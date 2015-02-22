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
 * @author vinod
 */
public class CustomerBillingController extends RootController {

    private static final Logger log = Logger.getLogger(CustomerBillingController.class);

    @Override
    protected void doWork(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String customerId = request.getParameter("custId").trim();
        String[] itemIds = request.getParameterValues("itemId");
        String[] itemNames = request.getParameterValues("itemName");
        String[] noItems = request.getParameterValues("noItems");
        String[] ItemsPrice = request.getParameterValues("ItemsPrice");
        double totalPrice = Double.valueOf(request.getParameter("totalPrice").trim());
        log.debug("Items Id's Length:- " + itemIds.length);
        log.debug("Items Name's Length:- " + itemNames.length);
        log.debug("Items No's Length:- " + noItems.length);
        log.debug("Items Prices's Length:- " + ItemsPrice.length);
        log.debug("Total Price:- " + totalPrice);

        for (int i = 0; i < itemIds.length; i++) {
            if (itemIds[i] != null && itemNames[i] != null && noItems[i] != null && ItemsPrice[i] != null) {
                String itemId = itemIds[i].trim();
                String itemName = itemNames[i].trim();
                int noItem = Integer.valueOf(noItems[i].trim());
                double itemsPrice = Double.valueOf(ItemsPrice[i].trim());
                log.debug("itemId:-" + itemId + "itemName:-" + itemName + "noItem:-" + noItem + "itemsPrice:-" + itemsPrice);
            }
        }
        response.sendRedirect("createCustomer.jsp");



    }
}
