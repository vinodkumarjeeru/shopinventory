/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.shop.service.impl;

import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.shop.domain.Address;
import org.shop.domain.Transactions;
import org.shop.domain.Customer;
import org.shop.domain.Inventory;
import org.shop.domain.Purchase;
import org.shop.domain.Store;
import org.shop.service.InventoryService;
import org.shop.utils.HibernateUtils;

/**
 *
 * @author 3500512
 */
public class InventoryServiceImpl implements InventoryService {

    private static InventoryServiceImpl impl = new InventoryServiceImpl();
    private static Session session = null;

    private InventoryServiceImpl() {
    }

    private Session getSession() {
        session = HibernateUtils.getSession();
        return session;
    }

    private void closeSession(Session s, Transaction t) {
        HibernateUtils.closeSession(session, t);
    }

    @Override
    public void addInventoryDetails(Inventory inventory) {
        session = getSession();
        Transaction transaction = session.beginTransaction();
        session.save(inventory);
        closeSession(session, transaction);
    }

    @Override
    public void createCustomer(Customer customer) {
        session = getSession();
        Transaction transaction = session.beginTransaction();
        session.save(customer);
        closeSession(session, transaction);
    }

    @Override
    public boolean updateCustomer(Long id, Customer customer) {
        session = getSession();
        Query query = session.createQuery("from Customer customer where customer.customer_Id=:customer_Id");
        query.setParameter("customer_Id", id);
        Customer customer1 = (Customer) query.uniqueResult();
        if (customer1 != null) {
            Transaction transaction = session.beginTransaction();
            session.merge(customer);
            closeSession(session, transaction);
            return true;
        }
        return false;
    }

    @Override
    public boolean updateStoreItems(int id, Store store) {
        session = getSession();
        Query query = session.createQuery("from Store store where store.item_Id=: item_Id");
        query.setParameter("item_Id", id);
        Store store1 = (Store) query.uniqueResult();
        if (store1 != null) {
            Transaction transaction = session.beginTransaction();
            session.update(store);
            closeSession(session, transaction);
            return true;
        }

        return false;
    }

    @Override
    public boolean updateBalanceData(int id, Transactions balance) {
        return false;
    }

    @Override
    public Customer findByCustomer(Long inventoryId) {
        session = getSession();
        Query query = session.createQuery("from Inventory inventory where inventory.inventory_Id=:inventory_Id");
        query.setParameter("inventory_Id", inventoryId);
        Inventory inventory = (Inventory) query.uniqueResult();
        session.close();
        return inventory.getCustomer_Id();
    }

    @Override
    public Customer findByCustomer(String name, Long phone) {
        session = getSession();
        Query query = session.createQuery("from Customer customer where customer.customer_Name=:custName and customer.customer_Phone=:phone");
        query.setParameter("custName", name);
        query.setParameter("phone", phone);
        Customer customer = (Customer) query.uniqueResult();
        return customer;
    }

    @Override
    public Store findByItem(Long itemId) {
        session = getSession();
        Query query = session.createQuery("from Store store where store.item_Id=:item_Id");
        query.setParameter("item_Id", itemId);
        Store store = (Store) query.uniqueResult();
        session.close();
        return store;
    }

    @Override
    public Transactions getBalanceDetails(Long inventoryId) {
        return null;
    }

    @Override
    public List<Customer> getAllCustomers() {
        session = getSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from Customer");
        List<Customer> list = query.list();
        closeSession(session, transaction);
        return list;

    }

    @Override
    public List<Store> getCompleteStoreData() {
        session = getSession();
        Query query = session.createQuery("from Customer");
        List<Store> list = query.list();
        session.close();
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
        session = getSession();
        Query query = session.createQuery("from Purchase purchase where purchase.purchase_Date=:date");
        query.setParameter("date", date);
        List<Purchase> list = query.list();
        session.close();
        return list;
    }

    @Override
    public List<Transactions> getAllTransactionsByDate(Date date) {
        session = getSession();
        Query query = session.createQuery("from Transactions transactions where transactions.date=:date");
        query.setParameter("date", date);
        List<Transactions> list = query.list();
        session.close();
        return list;
    }

    @Override
    public List<Transactions> getAllTransactionsByType(boolean transactionType) {
        List<Transactions> list = null;
        return list;
    }

    @Override
    public List<Transactions> getAllTransactionsByType(boolean transactionType, Date date) {
        String type = String.valueOf(transactionType);
        List<Transactions> list = null;
        session = getSession();
        if (type.equalsIgnoreCase("credit")) {
            Query query = session.createQuery("from Transactions trans where trans.credit=:credit and trans.date=:date");
            query.setParameter("credit", "true");
            query.setParameter("date", date);
            list = query.list();
        } else {
            Query query = session.createQuery("from Transactions trans where trans.debit=:debit and trans.date=:date");
            query.setParameter("debit", "true");
            query.setParameter("date", date);
            list = query.list();
        }
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
        session = getSession();
        Query query = session.createQuery("from Purchase purchase where purchase.purchase_Date=:date");
        query.setParameter("date", date);
        List<Purchase> list = query.list();
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
