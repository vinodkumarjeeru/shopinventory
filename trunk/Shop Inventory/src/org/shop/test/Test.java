/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.shop.test;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.shop.domain.Inventory;
import org.shop.utils.HibernateUtils;

/**
 *
 * @author 3500512
 */
public class Test {

    public static void main(String args[]) {
        Session session = HibernateUtils.getSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery(" from Inventory");
        //query.setParameter("customer_Id", new Long(1));
        List<Inventory> list = query.list();
        for (int i = 0; i < list.size(); i++) {
            Inventory in = list.get(i);
            System.out.println(in.getCustomer_Id().getCustomer_Id());
        }
        //System.out.println("list Size" + list);
        //System.out.println(inventory);
        HibernateUtils.closeSession(session, transaction);






    }
}
