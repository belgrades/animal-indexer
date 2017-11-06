/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbn.test;
import com.sbn.earth.animals.Animal;
import com.sbn.earth.animals.Carnivore;
import com.sbn.earth.animals.Omnivore;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Fernando Crema
 */
public class Test1 {
    public static void main (String [] args){
        Set<String> diet_omni = new HashSet<String>(Arrays.asList("Conejo", "Caballo"));
        Omnivore nuevo = new Omnivore(27, "Fernando Crema", "venezolano", diet_omni);
    
        Set<String> diet_carni = new HashSet<String>(Arrays.asList("Conejo", "Caballo"));
        
        Carnivore carni = new Carnivore(30, "jj", "kk", diet_carni);
        System.out.println(nuevo.getName());
        System.out.println(carni.getClass());
        
        Animal array [] = new Animal [2];
        array[0] = nuevo;
        array[1] = carni;
        
        for(String p: array[0].getDiet()){
            System.out.println(p);
        }
        
        System.out.println(array[0].getDiet());
        
    }
}
