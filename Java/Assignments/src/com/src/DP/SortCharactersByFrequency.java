package com.src.DP;

import java.util.*;

public class SortCharactersByFrequency {
    public static String frequencySort(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(char c : s.toCharArray())
            map.put(c,map.getOrDefault(c,0)+1);

        List<Map.Entry<Character,Integer>> mapList=new ArrayList<>(map.entrySet());
        mapList.sort(Collections.reverseOrder(Map.Entry.comparingByValue()));
        StringBuilder sb=new StringBuilder();
        for(Map.Entry<Character,Integer> entry : mapList){
            for(int i=0;i<entry.getValue();i++)
                sb.append(entry.getKey());
        }

        return sb.toString();

    }

    public static void main(String[] args) {
        System.out.println(frequencySort("saradhi"));
    }
}
