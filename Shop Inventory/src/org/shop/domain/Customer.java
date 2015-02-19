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
public class Customer {

    private Long customer_Id;
    private Address address;
    private String customer_Name;
    private Long customer_Phone;
    private Date customer_Join_Date;

    public Customer() {
    }

    public Customer(Long customer_Id, Address address, String customer_Name, Long customer_Phone, Date customer_Join_Date) {
        this.customer_Id = customer_Id;
        this.address = address;
        this.customer_Name = customer_Name;
        this.customer_Phone = customer_Phone;
        this.customer_Join_Date = customer_Join_Date;
    }

    public Long getCustomer_Id() {
        return customer_Id;
    }

    public void setCustomer_Id(Long customer_Id) {
        this.customer_Id = customer_Id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getCustomer_Name() {
        return customer_Name;
    }

    public void setCustomer_Name(String customer_Name) {
        this.customer_Name = customer_Name;
    }

    public Long getCustomer_Phone() {
        return customer_Phone;
    }

    public void setCustomer_Phone(Long customer_Phone) {
        this.customer_Phone = customer_Phone;
    }

    public Date getCustomer_Join_Date() {
        return customer_Join_Date;
    }

    public void setCustomer_Join_Date(Date customer_Join_Date) {
        this.customer_Join_Date = customer_Join_Date;
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Customer [customer_Id=");
        builder.append(customer_Id);
        builder.append(", address=");
        builder.append(address);
        builder.append(", customer_Name=");
        builder.append(customer_Name);
        builder.append(", customer_Phone=");
        builder.append(customer_Phone);
        builder.append(", customer_Join_Date=");
        builder.append(customer_Join_Date);
        builder.append("]");
        return builder.toString();
    }
}
