/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.shop.domain;

/**
 *
 * @author 3500512
 */
public class SoldItemDescription {

    private Purchase bill_Id;
    private Store item_Id;
    private long quantity;

    public SoldItemDescription() {
    }

    public SoldItemDescription(Purchase bill_Id, Store item_Id, long quantity) {
        this.bill_Id = bill_Id;
        this.item_Id = item_Id;
        this.quantity = quantity;
    }

    public Purchase getBill_Id() {
        return bill_Id;
    }

    public void setBill_Id(Purchase bill_Id) {
        this.bill_Id = bill_Id;
    }

    public Store getItem_Id() {
        return item_Id;
    }

    public void setItem_Id(Store item_Id) {
        this.item_Id = item_Id;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("SoldItemDescription [bill_Id=");
        builder.append(bill_Id);
        builder.append(", item_Id=");
        builder.append(item_Id);
        builder.append(", quantity=");
        builder.append(quantity);
        builder.append("]");
        return builder.toString();
    }
}
