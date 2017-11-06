/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbn.earth.animals;

import com.sbn.earth.animals.Animal;
import com.sbn.earth.plants.Plant;
import java.util.Set;

/**
 *
 * @author Fernando Crema
 */
public class Herbivore extends Animal{
    public Herbivore(int m_age, String m_name, String m_description, Set<String> m_diet){
        super(m_age, m_name, m_description, m_diet);
    }
    
    @Override
    void feedMe(Object food []){
        System.out.println(this.getName()+" is starting to eat!");
        for(Object aliment: food){
            if(aliment instanceof Plant){
                if(this.getDiet().contains(((Plant) aliment).getName())){
                    System.out.println("Eating plant: "+((Plant) aliment).getName());
                }
            }
        }
        System.out.println(this.getName()+" has finished!");
    }
}
