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
import org.shop.web.utils.RootController;

/**
 *
 * @author 3500512
 */
public class LogoutController extends RootController {

    private final static Logger log = Logger.getLogger(LogoutController.class);

    @Override
    protected void doWork(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getSession().removeAttribute("Admin");
        request.getSession().invalidate();
        log.info("Successfully logged out");
        response.sendRedirect("home.jsp");
       
    }
}
