/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.shop.web.controllers;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.log4j.Logger;
import org.shop.domain.Administrator;
import org.shop.web.utils.RootController;

/**
 *
 * @author vinod
 */
public class LoginController extends RootController {

    private final static Logger log = Logger.getLogger(LoginController.class);

    @Override
    protected void doWork(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String username = request.getParameter("username").trim();
        String password = request.getParameter("password").trim();
        Administrator admin = new Administrator();
        String adminUsername = admin.getUsername();
        String adminPassword = admin.getPassword();
        if (adminUsername.equals(username) && adminPassword.equals(password)) {
            log.info("Login Successfull.");
            HttpSession session = request.getSession();
            session.setAttribute("Admin", admin);
            session.setMaxInactiveInterval(30);
            response.sendRedirect("menu.jsp");
        } else {
            log.warn("Login Failure! because invalid data entered.");
            request.setAttribute("status", "Login Failure");
            RequestDispatcher dispatcher = request.getRequestDispatcher("/home.jsp");
            dispatcher.forward(request, response);
        }




    }
}
