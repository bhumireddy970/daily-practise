package com.src.string;



public class LongPressedName {
    public static boolean isLongPressedName(String name, String typed) {
        char[] n = name.toCharArray();
        char[] t = typed.toCharArray();
        int i=0,j=0;
        while(j<t.length)
        {
            if(i<n.length&&n[i]==t[j])
                i++;
            else if(j==0 || t[j]!=t[j-1])
                return false;
            j++;
        }
        return i==n.length;
    }

    public static void main(String[] args) {
        System.out.println(isLongPressedName("saeed","ssaaedd"));
    }
}
