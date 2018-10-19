/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maurams.romannumeralcalculator;

import java.util.TreeMap;

/**
 *
 * @author Maurice
 */
public class NumericalConverter {
 private final static TreeMap<String, Integer> map = new TreeMap<String, Integer>();
     static {
    
    map.put("M",1000);
    map.put("CM", 900);
    map.put("D", 500);
    map.put("CD", 400);
    map.put("C", 100);
    map.put("XC", 90);
    map.put("L", 50);
    map.put("XL", 40);
    map.put("X", 10);
    map.put("IX", 9);
    map.put("V", 5);
    map.put("IV", 4);
    map.put("I", 1);
    
     }
    public final static int toNumber(String num){
        //get the corresponding entry to each number
        String l = map.floorKey(num);
        if(num.equals(l)){
            return map.get(num);
        }
        //recursive method calls itself with the value mapped each number
        //incorrect mapping being carried out
        //After debugging I have been unable to find root cause
        
        return map.get(l) + toNumber(num.substring(1));
    }
     

}