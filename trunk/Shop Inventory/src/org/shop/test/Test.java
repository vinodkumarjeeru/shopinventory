/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.shop.test;

import java.util.Date;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.shop.domain.Store;
import org.shop.service.InventoryService;
import org.shop.utils.HibernateUtils;
import org.shop.utils.InstanceUtils;

/**
 *
 * @author 3500512
 */
public class Test {
    
    public static void main(String args[]) {
        /*InstanceUtils utils = new InstanceUtils();
         //Session session = HibernateUtils.getSession();
         //Transaction transaction = session.beginTransaction();
         InventoryService service = utils.getService();
         Store store = utils.getStore();
         store.setItem_Id("Salt");
         store.setItem_Name("Salt");
         store.setPrice(1000.00);
         store.setTotal_Items(35);
         store.setSoldItems(10);
         store.setStorage_Date(new Date());
         store.setRemainingItems(25);
         store.setFactoryName("Ravi Factory");
         service.addItemsToStore(store);*/
        //session.save(store);
        //service.addItemsToStore(store);
        //Query query = session.createQuery(" from Inventory");
        //query.setParameter("customer_Id", new Long(1));
                /*List<Inventory> list = query.list();
         for (int i = 0; i < list.size(); i++) {
         Inventory in = list.get(i);
         System.out.println(in.getCustomer_Id().getCustomer_Id());
         }*/ //System.out.println("list Size" + list);
        //System.out.println(inventory);*/
        //HibernateUtils.closeSession(session, transaction);

        
        
        
        
    }
}
