/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.shop.domain;

/**
 *
 * @author RAM
 */
public class Administrator {

    private final String username = "ShopApp";
    private final String password = "TestApp";
    private final String factoryUsername = "FactoryShopApp";
    private final String factoryPassword = "FactoryTestApp";

    public Administrator() {
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFactoryUsername() {
        return factoryUsername;
    }

    public String getFactoryPassword() {
        return factoryPassword;
    }
}
