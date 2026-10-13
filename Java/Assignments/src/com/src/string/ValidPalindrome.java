package com.src.string;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        String cleanString = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        String reversedString = new StringBuilder(cleanString).reverse().toString();
        return cleanString.equals(reversedString);

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
