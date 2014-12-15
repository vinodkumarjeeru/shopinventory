/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.shop.test;

import java.util.Date;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.shop.domain.Address;
import org.shop.domain.Customer;
import org.shop.utils.HibernateUtils;
import org.shop.utils.InstanceUtils;

/**
 *
 * @author 3500512
 */
public class Test {

    public static void main(String args[]) {
        InstanceUtils utils = new InstanceUtils();
        Address address = utils.getAddress();
        Customer customer = utils.getCustomer();
        address.setDistrictName("aaa");
        address.setPinCode(Long.MIN_VALUE);
        customer.setAddress(address);
        customer.setCustomer_Join_Date(new Date());
        customer.setCustomer_Name("bbb");
        Session session = HibernateUtils.getSession();
        Transaction transaction = session.beginTransaction();
        session.save(customer);
        HibernateUtils.closeSession(session, transaction);



    }
}
