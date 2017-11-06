/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbn.earth.animals;

import com.sbn.utils.LuceneHandler;
import java.util.Set;

/**
 *
 * @author Fernando Crema
 */
public abstract class Animal implements LuceneHandler {
    private final int age;
    private final String name, description;
    private final Set<String> diet;
    
    public Animal(int m_age, String m_name, String m_description, Set<String> m_diet){
        this.age = m_age;
        this.name = m_name;
        this.description = m_description;
        this.diet = m_diet;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getDescription(){
        return this.description;
    }
    
    public Set<String> getDiet(){
        return this.diet;
    }
     
    abstract void feedMe(Object food []);
    
    @Override
    public void createLuceneDocument(){
        System.out.println("Hola");
    }
}
