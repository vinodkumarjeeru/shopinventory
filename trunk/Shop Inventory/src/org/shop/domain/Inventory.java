/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.shop.domain;

/**
 *
 * @author 3500512
 */
public class Inventory {

    private Long inventory_Id;
    private Customer customer_Id;
    private Address address_Id;
    private Purchase bill_Id;

    public Inventory() {
    }

    public Inventory(Long inventory_Id, Customer customer_Id, Address address_Id, Purchase bill_Id) {
        this.inventory_Id = inventory_Id;
        this.customer_Id = customer_Id;
        this.address_Id = address_Id;
        this.bill_Id = bill_Id;
    }

    public Long getInventory_Id() {
        return inventory_Id;
    }

    public void setInventory_Id(Long inventory_Id) {
        this.inventory_Id = inventory_Id;
    }

    public Customer getCustomer_Id() {
        return customer_Id;
    }

    public void setCustomer_Id(Customer customer_Id) {
        this.customer_Id = customer_Id;
    }

    public Address getAddress_Id() {
        return address_Id;
    }

    public void setAddress_Id(Address address_Id) {
        this.address_Id = address_Id;
    }

    public Purchase getBill_Id() {
        return bill_Id;
    }

    public void setBill_Id(Purchase bill_Id) {
        this.bill_Id = bill_Id;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Inventory [inventory_Id=");
        builder.append(inventory_Id);
        builder.append(", customer_Id=");
        builder.append(customer_Id);
        builder.append(", address_Id=");
        builder.append(address_Id);
        builder.append(", bill_Id=");
        builder.append(bill_Id);
        builder.append("]");
        
        return builder.toString();
    }
}
