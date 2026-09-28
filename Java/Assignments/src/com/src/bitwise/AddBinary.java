package com.src.bitwise;

public class AddBinary {
    public static String addBinary(String a, String b) {
       int  len1 = a.length()-1;
       int len2 = b.length()-1;
       int carry = 0;
       StringBuilder sb=new StringBuilder();
       while(len1>=0 ||len2>=0|| carry==1){
           int sum=carry;
           if(len1>=0) sum+=a.charAt(len1--)-'0';
           if(len2>=0) sum+=b.charAt(len2--)-'0';
           sb.append(sum%2);
           carry=sum/2;
       }
       return sb.reverse().toString();

    }

    public static void main(String[] args) {
        System.out.println(addBinary("111","1"));
    }
}
