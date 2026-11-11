package com.src.string;

public class MinimumWindowSubstring {
    public static String minWindow(String s, String t) {
        if(s==null || t==null || s.length()==0 ||  t.length()==0 ||  s.length()< t.length())
            return new String();
        int[] map=new int[128];
        int count= t.length();
        for(char c : t.toCharArray())
            map[c]++;

        int start=0,end=0,minLen=Integer.MAX_VALUE,startIndex=0;

        char[] arrS=s.toCharArray();
        while(end<arrS.length)
        {
            if(map[arrS[end++]]-->0)
                count--;
            while(count==0){
                if(end-start<minLen)
                {
                    startIndex=start;
                    minLen=end-start;
                }
                if(map[arrS[start++]]++ ==0)
                    count++;
            }
        }

        return minLen==Integer.MAX_VALUE?new String():new String(arrS,startIndex,minLen);
    }

    public static void main(String[] args) {
        System.out.println(minWindow("adebc","ab"));
    }
}
