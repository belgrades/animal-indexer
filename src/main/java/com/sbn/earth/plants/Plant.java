/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbn.earth.plants;

/**
 *
 * @author fcrem
 */
public class Plant {
    private String name, description;
    
    public Plant(String m_name, String m_description){
        this.name = m_name;
        this.description = m_description;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getDescription(){
        return this.description;
    }
}
