/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.shop.service;

import java.util.Date;
import java.util.List;
import org.shop.domain.Transactions;
import org.shop.domain.Customer;
import org.shop.domain.Inventory;
import org.shop.domain.Purchase;
import org.shop.domain.Store;

/**
 *
 * @author 3500512
 */
public interface InventoryService {

    public void addInventoryDetails(Inventory inventory);

    public void updateInventoryDetails(Inventory inventory);

    public void createCustomer(Customer customer);

    public void addItemsToStore(Store store);

    public boolean updateCustomer(Long id, Customer customer);

    public boolean updateStoreItems(int id, Store store);

    public boolean updateBalanceData(int id, Transactions balance);

    public Inventory getInventory(long id);

    public Customer findByCustomer(String name);

    public List<String> getCustomerByKey(String key);

    public Customer findByCustomer(long id);

    public Customer findByCustomer(String name, Long phone);

    public Store findByItem(Long itemId);

    public Transactions getBalanceDetails(Long inventoryId);

    public List<Customer> getAllCustomers();

    public List<Store> getCompleteStoreData();

    public double getBalance(Long bill_Id, Long customer_Id);

    public double getBalanceByDate(Long bill_Id, Long customer_Id, Date date);

    public List<Purchase> getAllBillsByDate(Date date);

    public List<Transactions> getAllTransactionsByDate(Date date);

    public List<Transactions> getAllTransactionsByType(boolean transactionType);

    public List<Transactions> getAllTransactionsByType(boolean transactionType, Date date);

    public double calcMoney(Date date);

    public double calcMoney(Date date, boolean transactionType);

    public double calcMoney(Date date, boolean transactionType, Long id);

    public List<Purchase> getPurchaseDetails(Long Id);

    public List<Purchase> getPurchaseDetails(Date date);

    public List<Purchase> getPurchaseDetails(Long Id, Date date);
}
