/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.shop.web.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.shop.domain.Administrator;
import org.shop.web.utils.RootController;

/**
 *
 * @author 3500512
 */
public class LogoutController extends RootController {
    
    @Override
    protected void doWork(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Administrator admin = (Administrator) request.getSession().getAttribute("Admin");
        if (admin == null) {
            response.sendRedirect("/home.jsp");
        }
        request.getSession().removeAttribute("Admin");
        request.setAttribute("status", "You are successfully logged out");
        request.getRequestDispatcher("/home.jsp").forward(request, response);
    }
}
