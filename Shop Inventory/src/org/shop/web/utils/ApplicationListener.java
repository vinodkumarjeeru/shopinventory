/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.shop.web.utils;

import java.io.File;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.xml.DOMConfigurator;

/**
 * Web application lifecycle listener.
 *
 * @author vinod
 */
public class ApplicationListener implements ServletContextListener {

    /**
     *
     * @param arg0
     */
    @Override
    public void contextDestroyed(ServletContextEvent ctxEvent) {
    }

    @Override
    public void contextInitialized(ServletContextEvent ctxEvent) {
        ServletContext ctx = ctxEvent.getServletContext();
        String log4jConfig = ctx.getInitParameter("log4j-config");
        if (log4jConfig == null) {
            BasicConfigurator.configure();
        } else {
            String webAppPath = ctx.getRealPath("/");
            String log4jProp = webAppPath + log4jConfig;
            File log4jConfigFile = new File(log4jProp);
            if (log4jConfigFile.exists()) {
                DOMConfigurator.configure(log4jProp);
            } else {
                BasicConfigurator.configure();
            }
        }
    }
}
