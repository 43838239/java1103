/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp2;

/**
 *
 * @author MB-study
 */
public class Bank {

    public static void main(String[] args) {
        Account ac1 = new Account();
        Account ac2 = new Account();
        ac1.name = "john";
        ac1.setBalance (10000);
        ac1.setBalance(5000);
        ac2.name = "mary";
        ac2.setBalance(10000);
        ac2.setBalance(3000);
        //System.out.printf("name: %s, balance: %,d\n", name ,balance);
        //System.out.printf("name: %s, balance: %,d\n", name ,balance);
        ac1.printBalance();
        ac2.printBalance();

    }
}
