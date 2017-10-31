/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbn.animal.indexer;

/**
 *
 * @author Fernando Crema
 */
public class Animal {
    public int age;
    public String name;
    public String description;
    
    public Animal(int m_age, String m_name, String m_description){
        this.age = m_age;
        this.description = m_description;
        this.name = m_name; 
    }
}
