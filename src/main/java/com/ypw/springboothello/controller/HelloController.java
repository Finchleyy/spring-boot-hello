package com.ypw.springboothello.controller;

import com.ypw.springboothello.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author yupengwu
 * @Date 2018/6/12 20:39
 * @Version 1.0
 **/
@RestController
public class HelloController {
    @Autowired
    private Person person;

    @RequestMapping("/hello")
    public String hello(HttpServletRequest request) {
        return request.getServerName() + request.getServerPort() + request.getContextPath() + request.getServletPath();
    }

    @RequestMapping("/helloException")
    public String helloException() {
        int i = 1 / 0;
        return "Hello Sping Boot!~sdfasdfasfasdf";
    }

    @RequestMapping("/getPerson")
    public Person getPerson() {
        //System.out.println(applicationContext);
        return person;
    }

    @RequestMapping(value = "/downloadExcel")
    public ResponseEntity<String> downloadExcel(HttpServletResponse response, HttpServletRequest request) {
        FileInputStream input = null;
        try {
            //获取要下载的模板名称
            String fileName = "excel/equip_template.xls";
            //设置要下载的文件的名称
            response.setHeader("Content-disposition", "attachment;fileName=" + fileName);
            //通知客服文件的MIME类型
            response.setContentType("application/octet-stream;charset=UTF-8");
            //获取文件的路径
            String filePath = ResourceUtils.getFile("classpath:excel/" + fileName).getPath();
            input = new FileInputStream(filePath);
            OutputStream out = response.getOutputStream();
            byte[] b = new byte[2048];
            int len;
            while ((len = input.read(b)) != -1) {
                out.write(b, 0, len);
            }
            //修正 Excel在“xxx.xlsx”中发现不可读取的内容。是否恢复此工作薄的内容？如果信任此工作簿的来源，请点击"是"
            response.setHeader("Content-Length", String.valueOf(input.getChannel().size()));
            input.close();
            return ResponseEntity.ok("应用导入模板下载完成");
        } catch (Exception ex) {
            //log.error("get equip_template.xls :", ex);
            return ResponseEntity.ok("应用导入模板下载失败！");
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
