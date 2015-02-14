/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.shop.web.controllers;

import java.io.IOException;
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
public class ListController extends RootController {

    final static Logger log = Logger.getLogger(ListController.class);

    @Override
    protected void doWork(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        if (request.getParameter("list").equalsIgnoreCase("customersList")) {
            if (request.getSession().getAttribute("Admin") == null) {
                log.info("Addmin Object Not Avaliable");
                response.sendRedirect("home.jsp");
            } else {
                InstanceUtils utils = new InstanceUtils();
                InventoryService service = utils.getService();
                List<Customer> list = service.getAllCustomers();
                log.info("Customers List:-"+list.size());
                request.setAttribute("studentList", list);
                request.getRequestDispatcher("/viewCustomers.jsp").forward(request, response);
            }
        }

    }
}
