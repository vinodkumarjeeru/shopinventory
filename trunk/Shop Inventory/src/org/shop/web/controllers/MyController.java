/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.shop.web.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.shop.web.utils.RootController;

/**
 *
 * @author 3500512
 */
public class MyController extends RootController {
    
    
    private static final Logger log = Logger.getLogger(MyController.class);
    
    @Override
    protected void doWork(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        log.debug("Hello");
        log.debug(username + password);
    }
}
