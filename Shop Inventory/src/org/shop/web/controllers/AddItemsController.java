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
import org.apache.log4j.Logger;
import org.shop.domain.Store;
import org.shop.service.InventoryService;
import org.shop.utils.InstanceUtils;
import org.shop.web.utils.RootController;

/**
 *
 * @author vinod
 */
public class AddItemsController extends RootController {

    private Logger log = Logger.getLogger(AddItemsController.class);

    @Override
    protected void doWork(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        InstanceUtils utils = new InstanceUtils();
        InventoryService service = utils.getService();
        Store store = utils.getStore();
        log.info("Add Items Controller Called.");
        String itemId = request.getParameter("itemId").trim();
        String itemName = request.getParameter("itemName").trim();
        int noItems = Integer.parseInt(request.getParameter("noItems").trim());
        double itemPrice = Double.parseDouble(request.getParameter("itemPrice").trim());
        String factory = request.getParameter("factory").trim();
        store.setItem_Id(itemId);
        store.setItem_Name(itemName);
        store.setPrice(itemPrice);
        store.setTotal_Items(noItems);
        store.setStorage_Date(new Date());
        store.setFactoryName(factory);
        service.addItemsToStore(store);
        request.setAttribute("status", "Item Added Successfully.....");
        request.getRequestDispatcher("/addItems.jsp").forward(request, response);
        log.info("Item Successsfully Added...");

    }
}
