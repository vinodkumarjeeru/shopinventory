/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.shop.utils;

import java.io.File;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author 3500512
 */
public class HibernateUtils {

    private static Session session = null;
    private static File file = new File("WebContent/WEB-INF/classes/hibernate.cfg.xml");

    public static Session getSession() {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        session = factory.openSession();
        return session;
    }

    public static void closeSession(Session session1, Transaction transaction) {
        transaction.commit();
        session.close();
    }
}
