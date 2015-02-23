/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.shop.domain;

import java.util.Date;

/**
 *
 * @author 3500512
 */
public class Purchase {

    private Long bill_Id;
    private Customer customer_Id;
    private Date purchase_Date;
    private double totalSum;

    public Purchase() {
    }

    public Purchase(Long bill_Id, Customer customer_Id, Date purchase_Date, double totalSum) {
        this.bill_Id = bill_Id;
        this.customer_Id = customer_Id;
        this.purchase_Date = purchase_Date;
        this.totalSum = totalSum;
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

    public Date getPurchase_Date() {
        return purchase_Date;
    }

    public void setPurchase_Date(Date purchase_Date) {
        this.purchase_Date = purchase_Date;
    }

    public double getTotalSum() {
        return totalSum;
    }

    public void setTotalSum(double totalSum) {
        this.totalSum = totalSum;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Purchase [bill_Id=");
        builder.append(bill_Id);
        builder.append(", customer_Id=");
        builder.append(customer_Id);
        builder.append(", purchase_Date=");
        builder.append(purchase_Date);
        builder.append(", totalSum=");
        builder.append(totalSum);
        builder.append("]");
        return builder.toString();
    }
}
