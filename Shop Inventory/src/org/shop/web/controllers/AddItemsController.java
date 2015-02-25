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
public class AddItemsController extends RootController {

    private Logger log = Logger.getLogger(AddItemsController.class);

    @Override
    protected void doWork(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.info("Add Items Controller Called.");
    }
}
