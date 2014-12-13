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
public class Store {

    private Long item_Id;
    private String item_Name;
    private int total_Items;
    private Date storage_Date;
    private double unitPrice;
    private double dayPrice;
    private int soldItems;
    private int remainingItems;

    public Store() {
    }

    public Store(Long item_Id, String item_Name, int total_Items, Date storage_Date, double unitPrice, double dayPrice, int soldItems, int remainingItems) {
        this.item_Id = item_Id;
        this.item_Name = item_Name;
        this.total_Items = total_Items;
        this.storage_Date = storage_Date;
        this.unitPrice = unitPrice;
        this.dayPrice = dayPrice;
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

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getDayPrice() {
        return dayPrice;
    }

    public void setDayPrice(double dayPrice) {
        this.dayPrice = dayPrice;
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
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.item_Id);
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
        final Store other = (Store) obj;
        if (!Objects.equals(this.item_Id, other.item_Id)) {
            return false;
        }
        if (!Objects.equals(this.item_Name, other.item_Name)) {
            return false;
        }
        if (this.total_Items != other.total_Items) {
            return false;
        }
        if (!Objects.equals(this.storage_Date, other.storage_Date)) {
            return false;
        }
        if (Double.doubleToLongBits(this.unitPrice) != Double.doubleToLongBits(other.unitPrice)) {
            return false;
        }
        if (Double.doubleToLongBits(this.dayPrice) != Double.doubleToLongBits(other.dayPrice)) {
            return false;
        }
        if (this.soldItems != other.soldItems) {
            return false;
        }
        if (this.remainingItems != other.remainingItems) {
            return false;
        }
        return true;
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
        builder.append(", unitPrice=");
        builder.append(unitPrice);
        builder.append(", dayPrice=");
        builder.append(dayPrice);
        builder.append(", soldItems=");
        builder.append(soldItems);
        builder.append(", remainingItems=");
        builder.append(remainingItems);
        builder.append("]");
        return builder.toString();
    }
}
