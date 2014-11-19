/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.shop.domain.impl;

import java.util.Date;
import org.shop.domain.Domain;


/**
 *
 * @author 3500512
 */
public class Bill extends Domain {

    private Date billDate;
    private Long balance;
    

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }
}
