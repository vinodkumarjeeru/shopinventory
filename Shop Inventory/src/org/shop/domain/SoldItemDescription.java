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

    private Long item_desc_id;
    private Purchase purchase_id;
    private Store item_id;
    private int quantity;
    private double price;

    public SoldItemDescription() {
    }

    public SoldItemDescription(Long item_desc_id, Purchase purchase_id, Store item_id, int quantity, double price) {
        this.item_desc_id = item_desc_id;
        this.purchase_id = purchase_id;
        this.item_id = item_id;
        this.quantity = quantity;
        this.price = price;
    }

    public Long getItem_desc_id() {
        return item_desc_id;
    }

    public void setItem_desc_id(Long item_desc_id) {
        this.item_desc_id = item_desc_id;
    }

    public Purchase getPurchase_id() {
        return purchase_id;
    }

    public void setPurchase_id(Purchase purchase_id) {
        this.purchase_id = purchase_id;
    }

    public Store getItem_id() {
        return item_id;
    }

    public void setItem_id(Store item_id) {
        this.item_id = item_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + (this.item_desc_id != null ? this.item_desc_id.hashCode() : 0);
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
        final SoldItemDescription other = (SoldItemDescription) obj;
        if (this.item_desc_id != other.item_desc_id && (this.item_desc_id == null || !this.item_desc_id.equals(other.item_desc_id))) {
            return false;
        }
        if (this.purchase_id != other.purchase_id && (this.purchase_id == null || !this.purchase_id.equals(other.purchase_id))) {
            return false;
        }
        if (this.item_id != other.item_id && (this.item_id == null || !this.item_id.equals(other.item_id))) {
            return false;
        }
        if (this.quantity != other.quantity) {
            return false;
        }
        if (Double.doubleToLongBits(this.price) != Double.doubleToLongBits(other.price)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("SoldItemDescription [item_desc_id=");
        builder.append(item_desc_id);
        builder.append(", purchase_id=");
        builder.append(purchase_id);
        builder.append(", item_Id=");
        builder.append(item_id);
        builder.append(", quantity=");
        builder.append(quantity);
        builder.append(", price=");
        builder.append(price);
        builder.append("]");
        return builder.toString();
    }
}
