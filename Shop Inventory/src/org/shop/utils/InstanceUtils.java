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
import org.shop.domain.SoldItemDescription;
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
    private SoldItemDescription desc;

    public Address getAddress() {
    	address = new Address();
        return address;
    }

    public Administrator getAdmin() {
    	admin = new Administrator();
        return admin;
    }

    public Customer getCustomer() {
    	customer = new Customer();
        return customer;
    }

    public Purchase getPurchase() {
    	 purchase = new Purchase();
        return purchase;
    }

    public Store getStore() {
         store = new Store();
        return store;
    }

    public Transactions getBalance() {
    	 balance = new Transactions();
        return balance;
    }

    public Inventory getInventory() {
    	 inventory = new Inventory();
        return inventory;
    }

    public InventoryService getService() {
        service = InventoryServiceImpl.getService();
        return service;
    }

    public SoldItemDescription getItemDesc() {
        desc = new SoldItemDescription();
        return desc;
    }
}
