package com.ypw.springboothello.file;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * @author hongmeng
 * @date 2022/10/11
 */
public class FileRead {
    public static void main(String[] args) throws IOException {
        String allCode = FileUtils.readFileToString(new File("/Users/yupengwu/Desktop/code.sql"), Charset.defaultCharset());
        String qunheCode = FileUtils.readFileToString(new File("/Users/yupengwu/Desktop/code-qh.sql"), Charset.defaultCharset());

        System.out.println(allCode);
        String[] splitAll = allCode.split("\\n");
        String[] splitQunhe = qunheCode.split("\\n");
        Collection<String> subtract = CollectionUtils.subtract(Arrays.asList(splitAll), Arrays.asList(splitQunhe));
        System.out.println(subtract);
    }
}
