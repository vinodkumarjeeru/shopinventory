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
import org.shop.domain.Address;
import org.shop.domain.Customer;
import org.shop.domain.Inventory;
import org.shop.service.InventoryService;
import org.shop.service.impl.InventoryServiceImpl;
import org.shop.utils.InstanceUtils;
import org.shop.web.utils.RootController;

/**
 *
 * @author Lenovo
 */
public class CreateCustomerController extends RootController {

    @Override
    protected void doWork(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String name = firstname + lastname;
        Long mobile = new Long(request.getParameter("mobile"));
        String door = request.getParameter("door");
        String village = request.getParameter("village");
        String district = request.getParameter("district");
        String state = request.getParameter("state");
        Long pincode = new Long(request.getParameter("pincode"));

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
        customer.setCustomer_Name(name);
        customer.setCustomer_Phone(mobile);
        Inventory inventory = utils.getInventory();
        inventory.setAddress_Id(address);
        inventory.setCustomer_Id(customer);

        InventoryService service = utils.getService();
        service.addInventoryDetails(inventory);
        request.setAttribute("status", customer);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/customerBilling.jsp");
        dispatcher.forward(request, response);
    }
}
