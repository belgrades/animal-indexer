/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbn.test;
import com.sbn.animal.indexer.Omnivore;

/**
 *
 * @author Giulia
 */
public class Test1 {
    public static void main (String [] args){
        Omnivore nuevo = new Omnivore(27, "Venezolano", "Fernando Crema");
        System.out.println(nuevo.get_age());
    }
}
