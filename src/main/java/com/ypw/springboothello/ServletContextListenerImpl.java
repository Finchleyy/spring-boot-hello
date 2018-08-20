package com.ypw.springboothello;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @ClassName ServletContextListenerImpl
 * @Description TODO
 * @Author yupengwu
 * @Date 2018/8/20 11:23
 * @Version 1.0
 **/
public class ServletContextListenerImpl implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ServletContext servletContext = servletContextEvent.getServletContext();
        ClassLoader classLoader = servletContext.getClassLoader();
        while (true) {
            System.out.println(classLoader.getClass().getName());

            classLoader = classLoader.getParent();
            if (classLoader == null) {
                break;
            }
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
