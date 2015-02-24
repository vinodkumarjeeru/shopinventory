/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.shop.web.controllers;

import java.io.IOException;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import org.shop.domain.Address;
import org.shop.domain.Customer;
import org.shop.service.InventoryService;
import org.shop.service.impl.InventoryServiceImpl;
import org.shop.web.utils.RootController;

/**
 *
 * @author 3500512
 */
public class UpdateController extends RootController {

    private final static Logger log = Logger.getLogger(UpdateController.class);

    @Override
    protected void doWork(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        InventoryService service = InventoryServiceImpl.getService();
        if (request.getParameter("action").equalsIgnoreCase("Find Customer")) {
            String username = request.getParameter("custName").trim();
            Long phone = Long.valueOf(request.getParameter("phone").trim());
            log.debug("Parameters passed:" + username + "" + phone);
            Customer customer = service.findByCustomer(username, phone);
            log.debug(customer);
            if (customer == null) {
                request.setAttribute("status", "Entered Details are Invalid");
                request.getRequestDispatcher("/updateCustomer.jsp").forward(request, response);
            }
            request.setAttribute("customer", customer);
            request.getRequestDispatcher("/updateCustomer.jsp").forward(request, response);

        }

        if (request.getParameter("action").equalsIgnoreCase("Update Customer")) {
            Long custId = Long.valueOf(request.getParameter("customerId").trim());
            Customer customer = service.findByCustomer(custId);
            if (customer == null) {
                request.setAttribute("status", "Please enter valid details");
                request.getRequestDispatcher("/updateCustomer.jsp").forward(request, response);
            }

            String name = request.getParameter("customerName").trim();
            Long mobile = new Long(request.getParameter("mobile").trim());
            String door = request.getParameter("door").trim();
            String village = request.getParameter("village").trim();
            String district = request.getParameter("district").trim();
            String state = request.getParameter("state").trim();
            Long pincode = new Long(request.getParameter("pincode").trim());
            Address address = customer.getAddress();
            address.setDoorNo(door);
            address.setStateName(state);
            address.setDistrictName(district);
            address.setPinCode(pincode);
            address.setVilleageName(village);
            customer.setAddress(address);
            customer.setCustomer_Join_Date(new Date());
            customer.setCustomer_Name(name);
            customer.setCustomer_Phone(mobile);
            log.info("Data Updated Successfully");
            service.updateCustomer(customer.getCustomer_Id(), customer);
            request.setAttribute("status", "Customer Data Updated Successfully");
            RequestDispatcher dispatcher = request.getRequestDispatcher("/updateCustomer.jsp");
            dispatcher.forward(request, response);
        }
    }
}
