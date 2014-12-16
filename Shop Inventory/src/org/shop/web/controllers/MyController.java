/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.shop.web.controllers;

import java.io.IOException;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.shop.domain.Address;
import org.shop.domain.Customer;
import org.shop.utils.HibernateUtils;
import org.shop.utils.InstanceUtils;
import org.shop.web.utils.RootController;

/**
 *
 * @author 3500512
 */
public class MyController extends RootController {

    @Override
    protected void doWork(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
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


    }
}
