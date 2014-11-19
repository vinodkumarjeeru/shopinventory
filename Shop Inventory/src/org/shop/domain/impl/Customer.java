/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.shop.domain.impl;

import org.shop.domain.Address;
import org.shop.domain.Domain;

/**
 *
 * @author 3500512
 */
public class Customer extends Domain {

    private Address address;
    
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
