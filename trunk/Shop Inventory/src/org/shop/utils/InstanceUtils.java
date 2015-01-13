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
        System.out.println("Address Hashcode:- " + address.hashCode());
        return address;
    }

    public Administrator getAdmin() {
        System.out.println("Admin Hashcode:-" + admin.hashCode());
        return admin;
    }

    public Customer getCustomer() {
        System.out.println("Customer Hashcode:- " + customer.hashCode());
        return customer;
    }

    public Purchase getPurchase() {
        System.out.println("Purchase Hashcode:- " + purchase.hashCode());
        return purchase;
    }

    public Store getStore() {
        System.out.println("Store Hashcode:- " + store.hashCode());
        return store;
    }

    public Transactions getBalance() {
        System.out.println("Balance Hashcode:- " + balance.hashCode());
        return balance;
    }

    public Inventory getInventory() {
        System.out.println("Inventory Hashcode:- " + inventory.hashCode());
        return inventory;
    }

    public InventoryService getService() {
        System.out.println("Inventory Service Hashcode:- " + service.hashCode());
        return service;
    }
}
