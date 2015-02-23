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
import org.shop.domain.Customer;
import org.shop.domain.Inventory;
import org.shop.domain.Purchase;
import org.shop.service.InventoryService;
import org.shop.utils.InstanceUtils;
import org.shop.web.utils.RootController;

/**
 *
 * @author vinod
 */
public class CustomerBillingController extends RootController {

    private static final Logger log = Logger.getLogger(CustomerBillingController.class);

    @Override
    protected void doWork(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        InstanceUtils utils = new InstanceUtils();
        InventoryService service = utils.getService();
        String customerName = request.getParameter("custName").trim();
        Customer customer = service.findByCustomer(customerName);
        Inventory inventory = service.getInventory(customer.getCustomer_Id());
        if (customer != null) {
            String[] itemIds = request.getParameterValues("itemId");
            String[] itemNames = request.getParameterValues("itemName");
            String[] noItems = request.getParameterValues("noItems");
            String[] ItemsPrice = request.getParameterValues("ItemsPrice");
            double totalPrice = Double.valueOf(request.getParameter("totalPrice").trim());
            Purchase purchase = utils.getPurchase();
            purchase.setCustomer_Id(customer);
            purchase.setPurchase_Date(new Date());
            purchase.setTotalSum(totalPrice);
            inventory.setBill_Id(purchase);
            service.updateInventoryDetails(inventory);
            log.info("Inventory information updated....");
            log.info("Bill Id & Inventory info successully Updated.....");

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
        } else {
            request.setAttribute("errorMsg", "Invalid Customer Name! Please Enter valid Username");
            request.getRequestDispatcher("/customerBilling.jsp").forward(request, response);
        }


    }
}
