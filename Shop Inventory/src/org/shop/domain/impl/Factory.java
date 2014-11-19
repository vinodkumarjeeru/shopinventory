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
public class Factory extends Domain {

    private Address factoryAddress;

    public Address getFactoryAddress() {
        return factoryAddress;
    }

    public void setFactoryAddress(Address factoryAddress) {
        this.factoryAddress = factoryAddress;
    }
}
