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
public class Transactions {

    private Purchase purchase_Id;
    private Long transaction_Id;
    private boolean credit;
    private boolean debit;
    private double payment_Amount;
    private double remaining_Balance;
    private Date date;

    public Transactions() {
    }

    public Transactions(Purchase purchase_Id, Long transaction_Id, boolean credit, boolean debit, double payment_Amount, double remaining_Balance, Date date) {
        this.purchase_Id = purchase_Id;
        this.transaction_Id = transaction_Id;
        this.credit = credit;
        this.debit = debit;
        this.payment_Amount = payment_Amount;
        this.remaining_Balance = remaining_Balance;
        this.date = date;
    }

    public Purchase getPurchase_Id() {
        return purchase_Id;
    }

    public void setPurchase_Id(Purchase purchase_Id) {
        this.purchase_Id = purchase_Id;
    }

    public Long getBalance_Id() {
        return transaction_Id;
    }

    public void setBalance_Id(Long balance_Id) {
        this.transaction_Id = balance_Id;
    }

    public boolean isCredit() {
        return credit;
    }

    public void setCredit(boolean credit) {
        this.credit = credit;
    }

    public boolean isDebit() {
        return debit;
    }

    public void setDebit(boolean debit) {
        this.debit = debit;
    }

    public double getPayment_Amount() {
        return payment_Amount;
    }

    public void setPayment_Amount(double payment_Amount) {
        this.payment_Amount = payment_Amount;
    }

    public double getRemaining_Balance() {
        return remaining_Balance;
    }

    public void setRemaining_Balance(double remaining_Balance) {
        this.remaining_Balance = remaining_Balance;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Balance [purchase_Id=");
        builder.append(purchase_Id);
        builder.append(", transaction_Id=");
        builder.append(transaction_Id);
        builder.append(", credit=");
        builder.append(credit);
        builder.append(", debit=");
        builder.append(debit);
        builder.append(", payment_Amount=");
        builder.append(payment_Amount);
        builder.append(", remaining_Balance=");
        builder.append(remaining_Balance);
        builder.append(", date=");
        builder.append(date);
        builder.append("]");
        return builder.toString();
    }
}
