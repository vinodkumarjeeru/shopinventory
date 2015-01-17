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
import org.shop.domain.Administrator;
import org.shop.web.utils.RootController;

/**
 *
 * @author vinod
 */
public class LoginController extends RootController {

    @Override
    protected void doWork(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        if (request.getParameter("adminLogin").equalsIgnoreCase("admin login")) {

            String username = request.getParameter("username");
            String password = request.getParameter("password");
            Administrator admin = new Administrator();
            String adminUsername = admin.getUsername();
            String adminPassword = admin.getPassword();
            if (adminUsername.equals(username) && adminPassword.equals(password)) {
                HttpSession session = request.getSession();
                session.setAttribute("Admin", admin);
                response.sendRedirect("createCustomer.jsp");
            } else {
                request.setAttribute("status", "Login Failure");
                RequestDispatcher dispatcher = request.getRequestDispatcher("/home.jsp");
                dispatcher.forward(request, response);
            }
        }




    }
}
