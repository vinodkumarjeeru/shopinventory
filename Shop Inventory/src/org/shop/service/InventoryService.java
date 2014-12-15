/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.shop.service;

import java.util.Date;
import java.util.List;
import org.shop.domain.Address;
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

    public boolean updateCustomerAddress(int id, Address address);

    public boolean updateStoreItems(int id, Store store);

    public boolean updateBalanceData(int id, Transactions balance);

    public Customer findByCustomer(Long inventoryId);

    public Store findByItem(Long inventoryId);

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
