/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbn.earth;

/**
 *
 * @author Fernando Crema
 */
public abstract class Animal {
    int age;
    String name, description;
    
    public Animal(int m_age, String m_name, String m_description){
        this.age = m_age;
        this.name = m_name;
        this.description = m_description;
    }
    
    public int get_age(){
        return this.age;
    }
    
    public String get_name(){
        return this.name;
    }
    
    public String get_description(){
        return this.description;
    }
     
    abstract void feedMe();
}
