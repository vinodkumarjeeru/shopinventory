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
public class Store {

    private Long item_Id;
    private String item_Name;
    private int quantity;
    private Date storage_Date;
    private double price;
    private int soldItems;
    private int remainingItems;

    public Store() {
    }

    public Store(Long item_Id, String item_Name, int total_Items, Date storage_Date, double price, int soldItems, int remainingItems) {
        this.item_Id = item_Id;
        this.item_Name = item_Name;
        this.quantity = total_Items;
        this.storage_Date = storage_Date;
        this.price = price;
        this.soldItems = soldItems;
        this.remainingItems = remainingItems;
    }

    public Long getItem_Id() {
        return item_Id;
    }

    public void setItem_Id(Long item_Id) {
        this.item_Id = item_Id;
    }

    public String getItem_Name() {
        return item_Name;
    }

    public void setItem_Name(String item_Name) {
        this.item_Name = item_Name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getStorage_Date() {
        return storage_Date;
    }

    public void setStorage_Date(Date storage_Date) {
        this.storage_Date = storage_Date;
    }

    public double getUnitPrice() {
        return price;
    }

    public void setUnitPrice(double unitPrice) {
        this.price = unitPrice;
    }

    public int getSoldItems() {
        return soldItems;
    }

    public void setSoldItems(int soldItems) {
        this.soldItems = soldItems;
    }

    public int getRemainingItems() {
        return remainingItems;
    }

    public void setRemainingItems(int remainingItems) {
        this.remainingItems = remainingItems;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Store [item_Id=");
        builder.append(item_Id);
        builder.append(", item_Name=");
        builder.append(item_Name);
        builder.append(", total_Items=");
        builder.append(quantity);
        builder.append(", storage_Date=");
        builder.append(storage_Date);
        builder.append(", price=");
        builder.append(price);
        builder.append(", soldItems=");
        builder.append(soldItems);
        builder.append(", remainingItems=");
        builder.append(remainingItems);
        builder.append("]");
        return builder.toString();
    }
}
