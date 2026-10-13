package com.src.string;

import java.util.ArrayList;
import java.util.List;

public class PrintWordsVertically {
    public static List<String> printVertically(String s) {

        List<String> list = new ArrayList<>();

        String[] words = s.split(" ");
        int max=0;

        for(String word:words)
            max=Math.max(word.length(),max);

        for(int i=0;i<max;i++){
            StringBuilder sb=new StringBuilder();

            for(String word:words){
                if(i<word.length())
                    sb.append(word.charAt(i));
                else
                    sb.append(" ");
            }
            list.add(sb.toString().stripTrailing());
        }
        return list;
    }


    public static void main(String[] args) {
        System.out.println(printVertically("HOW ARE YOU"));
    }
}
