/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.shop.web.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.shop.web.utils.RootController;

/**
 *
 * @author 3500512
 */
public class MyController extends RootController {

    @Override
    protected void doWork(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        /*String username = request.getParameter("username");
         String password = request.getParameter("password");
         System.out.println(username + password);
         InstanceUtils utils = new InstanceUtils();
         Address address = utils.getAddress();
         Customer customer = utils.getCustomer();
         address.setDistrictName("aaa");
         address.setPinCode(Long.MIN_VALUE);
         customer.setAddress(address);
         customer.setCustomer_Join_Date(new Date());
         customer.setCustomer_Name("bbb");
         Session session = HibernateUtils.getSession();
         Transaction transaction = session.beginTransaction();
         session.save(customer);
         HibernateUtils.closeSession(session, transaction);
        
         */
        PrintWriter out = response.getWriter();

        String rq = request.getParameter("login");

        if (rq.equalsIgnoreCase("Login")) {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            System.out.println(username + password);
            HttpSession session = request.getSession();
            session.setAttribute("User", username);
            response.sendRedirect("index.jsp");

        }

    }
}
