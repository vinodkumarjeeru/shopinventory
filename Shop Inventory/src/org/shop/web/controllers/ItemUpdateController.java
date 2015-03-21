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
import org.shop.service.impl.InventoryServiceImpl;
import org.shop.utils.InstanceUtils;
import org.shop.web.utils.RootController;

/**
 *
 * @author Vinnu
 */
public class ItemUpdateController extends RootController {

    private static Logger log = Logger.getLogger(ItemUpdateController.class);

    @Override
    protected void doWork(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        InventoryService service = InventoryServiceImpl.getService();
        InstanceUtils utils = new InstanceUtils();
        String param = request.getParameter("action");
        if (param.equalsIgnoreCase("Get Details")) {
            String itemId = request.getParameter("itemId");
            String itemName = request.getParameter("itemName");
            log.debug(itemId + itemName);
            Store store = service.findByItem(itemId, itemName);
            log.debug(store);
            request.setAttribute("store", store);
            request.getRequestDispatcher("updateItems.jsp").forward(request, response);
        } else if (param.equalsIgnoreCase("Update Item")) {
            Store store = utils.getStore();
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
            service.updateStoreItems(itemId, store);
            request.setAttribute("status", "Item Updated Successfully.....");
            request.getRequestDispatcher("/updateItems.jsp").forward(request, response);
            log.info("Item Successsfully Updated...");
        }

    }
}
