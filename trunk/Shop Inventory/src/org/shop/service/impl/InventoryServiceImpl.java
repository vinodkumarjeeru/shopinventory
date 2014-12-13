/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.shop.service.impl;

import java.util.Date;
import java.util.List;
import org.shop.domain.Address;
import org.shop.domain.Transactions;
import org.shop.domain.Customer;
import org.shop.domain.Inventory;
import org.shop.domain.Purchase;
import org.shop.domain.Store;
import org.shop.service.InventoryService;

/**
 *
 * @author 3500512
 */
public class InventoryServiceImpl implements InventoryService {

    private static InventoryServiceImpl impl = new InventoryServiceImpl();

    private InventoryServiceImpl() {
    }

    @Override
    public void addInventoryDetails(Inventory inventory) {
    }

    @Override
    public boolean updateCustomerAddress(int id, Address address) {
        return false;
    }

    @Override
    public boolean updateStoreItems(int id, Store store) {
        return false;
    }

    @Override
    public boolean updateBalanceData(int id, Transactions balance) {
        return false;
    }

    @Override
    public Customer findByCustomer(Long inventoryId) {
        return null;
    }

    @Override
    public Store findByItem(Long inventoryId) {
        return null;
    }

    @Override
    public Transactions getBalanceDetails(Long inventoryId) {
        return null;
    }

    @Override
    public List<Customer> getAllCustomers() {
        List<Customer> list = null;
        return list;

    }

    @Override
    public List<Store> getCompleteStoreData() {
        List<Store> list = null;
        return list;
    }

    @Override
    public double getBalance(Long bill_Id, Long customer_Id) {
        return 0.0;

    }

    @Override
    public double getBalanceByDate(Long bill_Id, Long customer_Id, Date date) {
        return 0.0;
    }

    @Override
    public List<Purchase> getAllBillsByDate(Date date) {
        List<Purchase> list = null;
        return list;
    }

    @Override
    public List<Transactions> getAllTransactionsByDate(Date date) {
        List<Transactions> list = null;
        return list;
    }

    @Override
    public List<Transactions> getAllTransactionsByType(boolean transactionType) {
        List<Transactions> list = null;
        return list;
    }

    @Override
    public List<Transactions> getAllTransactionsByType(boolean transactionType, Date date) {
        List<Transactions> list = null;
        return list;
    }

    @Override
    public double calcMoney(Date date) {
        return 0.0;
    }

    @Override
    public double calcMoney(Date date, boolean transactionType) {
        return 0.0;
    }

    @Override
    public double calcMoney(Date date, boolean transactionType, Long id) {
        return 0.0;
    }

    @Override
    public List<Purchase> getPurchaseDetails(Long Id) {
        List<Purchase> list = null;
        return list;
    }

    @Override
    public List<Purchase> getPurchaseDetails(Date date) {
        List<Purchase> list = null;
        return list;
    }

    @Override
    public List<Purchase> getPurchaseDetails(Long Id, Date date) {
        List<Purchase> list = null;
        return list;
    }

    public static InventoryService getService() {
        return impl;
    }
}
