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
    private int total_Items;
    private Date storage_Date;
    private double price;
    private int soldItems;
    private int remainingItems;
    private String factoryName;

    public Store() {
    }

    public Store(Long item_Id, String item_Name, int total_Items, Date storage_Date, double price, int soldItems, int remainingItems, String factoryName) {
        this.item_Id = item_Id;
        this.item_Name = item_Name;
        this.total_Items = total_Items;
        this.storage_Date = storage_Date;
        this.price = price;
        this.soldItems = soldItems;
        this.remainingItems = remainingItems;
        this.factoryName = factoryName;
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

    public int getTotal_Items() {
        return total_Items;
    }

    public void setTotal_Items(int total_Items) {
        this.total_Items = total_Items;
    }

    public Date getStorage_Date() {
        return storage_Date;
    }

    public void setStorage_Date(Date storage_Date) {
        this.storage_Date = storage_Date;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Store [item_Id=");
        builder.append(item_Id);
        builder.append(", item_Name=");
        builder.append(item_Name);
        builder.append(", total_Items=");
        builder.append(total_Items);
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
