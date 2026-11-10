package com.src.string;

public class CountVowelsandConsonants {
    public static void NoOfVowelsandConsonants(String str) {
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z'){
                if("aeiou".indexOf(ch)>-1){
                    vowels++;
                }
                else{
                    consonants++;
                }
            }
        }
        System.out.println("Vowels : "+vowels);
        System.out.println("Consonents : "+consonants);
    }
    public static void main(String[] args) {
        NoOfVowelsandConsonants("aeiouaeious");
    }
}
