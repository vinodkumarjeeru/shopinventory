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
import org.shop.domain.Inventory;
import org.shop.service.InventoryService;
import org.shop.utils.InstanceUtils;
import org.shop.web.utils.RootController;

/**
 *
 * @author Lenovo
 */
public class CreateCustomerController extends RootController {

    private final static Logger log = Logger.getLogger(CreateCustomerController.class);

    @Override
    protected void doWork(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String customerName = request.getParameter("firstname").trim();
        Long mobile = new Long(request.getParameter("mobile").trim());
        String door = request.getParameter("door").trim();
        String village = request.getParameter("village").trim();
        String district = request.getParameter("district").trim();
        String state = request.getParameter("state").trim();
        Long pincode = new Long(request.getParameter("pincode").trim());

        InstanceUtils utils = new InstanceUtils();
        Address address = utils.getAddress();
        Customer customer = utils.getCustomer();
        address.setDoorNo(door);
        address.setStateName(state);
        address.setDistrictName(district);
        address.setPinCode(pincode);
        address.setVilleageName(village);
        customer.setAddress(address);
        customer.setCustomer_Join_Date(new Date());
        customer.setCustomer_Name(customerName);
        customer.setCustomer_Phone(mobile);
        Inventory inventory = utils.getInventory();
        inventory.setAddress_Id(address);
        inventory.setCustomer_Id(customer);

        InventoryService service = utils.getService();
        service.addInventoryDetails(inventory);
        log.info("Data Successfully Submitted into the database");
        request.setAttribute("status", customer);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/customerBilling.jsp");
        dispatcher.forward(request, response);
    }
}
