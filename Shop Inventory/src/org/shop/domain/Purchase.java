/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.shop.domain;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author 3500512
 */
public class Purchase {

    private Long bill_Id;
    private Customer customer_Id;
    private Store item_Id;
    private Date purchase_Date;

    public Purchase() {
    }

    public Purchase(Long bill_Id, Customer customer_Id, Store item_Id, Date purchase_Date) {
        this.bill_Id = bill_Id;
        this.customer_Id = customer_Id;
        this.item_Id = item_Id;
        this.purchase_Date = purchase_Date;
    }

    public Long getBill_Id() {
        return bill_Id;
    }

    public void setBill_Id(Long bill_Id) {
        this.bill_Id = bill_Id;
    }

    public Customer getCustomer_Id() {
        return customer_Id;
    }

    public void setCustomer_Id(Customer customer_Id) {
        this.customer_Id = customer_Id;
    }

    public Store getItem_Id() {
        return item_Id;
    }

    public void setItem_Id(Store item_Id) {
        this.item_Id = item_Id;
    }

    public Date getPurchase_Date() {
        return purchase_Date;
    }

    public void setPurchase_Date(Date purchase_Date) {
        this.purchase_Date = purchase_Date;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.bill_Id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Purchase other = (Purchase) obj;
        if (this.bill_Id != other.bill_Id && (this.bill_Id == null || !this.bill_Id.equals(other.bill_Id))) {
            return false;
        }
        if (this.customer_Id != other.customer_Id && (this.customer_Id == null || !this.customer_Id.equals(other.customer_Id))) {
            return false;
        }
        if (this.item_Id != other.item_Id && (this.item_Id == null || !this.item_Id.equals(other.item_Id))) {
            return false;
        }
        if (this.purchase_Date != other.purchase_Date && (this.purchase_Date == null || !this.purchase_Date.equals(other.purchase_Date))) {
            return false;
        }
        return true;
    }
    
    

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Purchase [bill_Id=");
        builder.append(bill_Id);
        builder.append(", customer_Id=");
        builder.append(customer_Id);
        builder.append(", item_Id=");
        builder.append(item_Id);
        builder.append(", purchase_Date=");
        builder.append(purchase_Date);
        builder.append("]");
        return builder.toString();
    }
}
