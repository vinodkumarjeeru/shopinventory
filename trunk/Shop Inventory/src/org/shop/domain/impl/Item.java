/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.shop.domain.impl;

import org.shop.domain.Domain;


/**
 *
 * @author 3500512
 */
public class Item extends Domain {

    private int itemQuantity;

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }
}
