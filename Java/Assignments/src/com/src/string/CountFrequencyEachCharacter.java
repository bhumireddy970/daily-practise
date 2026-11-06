package com.src.string;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyEachCharacter {
    public static void frequency(String s){
        Map<Character,Integer> map = new HashMap<>();
        for(char ch : s.toLowerCase().toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
    public static void main(String[] args) {
        frequency("Ssaradhi");
    }
}
