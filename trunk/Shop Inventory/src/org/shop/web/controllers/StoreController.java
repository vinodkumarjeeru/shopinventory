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
import org.shop.domain.Store;
import org.shop.utils.InstanceUtils;
import org.shop.web.utils.RootController;

/**
 *
 * @author vinod
 */
public class StoreController extends RootController {

    private static final Logger log = Logger.getLogger(StoreController.class);

    @Override
    protected void doWork(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        InstanceUtils utils = new InstanceUtils();
        Store store = utils.getStore();

    }
}
