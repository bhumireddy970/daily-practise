package com.src.string;

import java.util.Arrays;

public class ShiftingLetters {
    public static String shiftingLetters(String s, int[] shifts) {
        for(int i=shifts.length-2;i>=0;i--)
            shifts[i] = (int) (((long) shifts[i] + shifts[i + 1]) % 26);
        System.out.println(Arrays.toString(shifts));
        char[] arr = s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            arr[i] = (char) ((arr[i]-'a'+shifts[i]) % 26+'a');
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        System.out.println(shiftingLetters("ruu",new int[]{26,9,17}));
    }
}
