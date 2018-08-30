package com.ypw.springboothello;

import com.ypw.springboothello.bean.Person;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public String hello() {
        return "Hello Sping Boot!~sdfasdfasfasdf";
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
}
