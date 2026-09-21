package com.src;


public class DecryptStringToIntegerMapping {
    public static String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
          for(int i=s.length()-1;i>=0;i--){
              if(s.charAt(i)=='#'){
                  String sub = s.substring(i-2, i);
                  int value = Integer.parseInt(sub);
                  sb.insert(0,  (char)('a'+value-1));
                  i=i-2;
              }
              else {
                  int value = Character.getNumericValue(s.charAt(i));
                  sb.insert(0,  (char)('a'+value-1));
              }
          }

      return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(freqAlphabets("1326#"));
    }
}
