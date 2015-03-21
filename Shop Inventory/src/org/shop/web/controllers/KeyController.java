/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.shop.web.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import org.shop.domain.Customer;
import org.shop.service.InventoryService;
import org.shop.utils.InstanceUtils;
import org.shop.web.utils.RootController;

/**
 *
 * @author vinod
 */
public class KeyController extends RootController {

    private static final Logger log = Logger.getLogger(KeyController.class);

    @Override
    protected void doWork(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<String> nameList = new ArrayList<String>();
        InstanceUtils utils = new InstanceUtils();
        PrintWriter out = response.getWriter();
        String param = request.getParameter("info").trim();
        log.debug(param);
        if (param.equals("names")) {
            String content = request.getParameter("criteria").trim();
            InventoryService service = utils.getService();
            List list = service.getCustomerByKey(content);
            if (list.size() > 0) {
                for (int i = 0; i < list.size(); i++) {
                    Customer customer = (Customer) list.get(i);
                    String name = customer.getCustomer_Name();
                    nameList.add(name);
                }
                out.println(nameList);
            }
        }
        if (param.equals("itemId")) {
            String content = request.getParameter("criteria").trim();
            InventoryService service = utils.getService();
            boolean status = service.getItemsByKey(content);
            if (status) {
                out.println("Item Id Avaliabled...!");
            } else {
                out.println("Item Id Already Exists! Please Choose Different Id...");
            }

        }
    }
}
