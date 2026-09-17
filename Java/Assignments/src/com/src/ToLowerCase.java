package com.src;

public class ToLowerCase {
    public static String toLowerCase(String s) {
//        return  s.toLowerCase();
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 65 && arr[i] <= 90) {
                arr[i] = (char) (arr[i] + 32);
            }
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        System.out.println(toLowerCase("hELLO"));
    }
}
