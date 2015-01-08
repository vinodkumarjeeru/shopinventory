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

    public Administrator() {
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Administrator{" + "username=" + username + ", password=" + password + '}';
    }
}
