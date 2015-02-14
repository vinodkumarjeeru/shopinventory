/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.shop.utils;

import org.shop.domain.Address;
import org.shop.domain.Administrator;
import org.shop.domain.Transactions;
import org.shop.domain.Customer;
import org.shop.domain.Inventory;
import org.shop.domain.Purchase;
import org.shop.domain.Store;
import org.shop.service.InventoryService;
import org.shop.service.impl.InventoryServiceImpl;

/**
 *
 * @author 3500512
 */
public class InstanceUtils {

    private Address address;
    private Administrator admin;
    private Customer customer;
    private Purchase purchase;
    private Store store;
    private Transactions balance;
    private Inventory inventory;
    private InventoryService service;

    public InstanceUtils() {
        address = new Address();
        admin = new Administrator();
        customer = new Customer();
        purchase = new Purchase();
        store = new Store();
        balance = new Transactions();
        inventory = new Inventory();
        service = InventoryServiceImpl.getService();
    }

    public Address getAddress() {
        return address;
    }

    public Administrator getAdmin() {
        return admin;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Purchase getPurchase() {
        return purchase;
    }

    public Store getStore() {
        return store;
    }

    public Transactions getBalance() {
        return balance;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public InventoryService getService() {
        return service;
    }
}
