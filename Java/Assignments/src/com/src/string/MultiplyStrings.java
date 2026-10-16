package com.src.string;

public class MultiplyStrings {
    public static String multiply(String num1, String num2) {
       if(num1.equals("0") || num2.equals("0")) return "0";

       int m=num1.length(),n=num2.length();
       int[] result=new int[m+n];

       for(int i=0;i<m;i++)
       {
           for(int j=0;j<n;j++)
           {
               int digit1=num1.charAt(i)-'0';
               int digit2=num2.charAt(j)-'0';
               result[i+j+1]=digit1*digit2;
           }
       }
        for (int k = result.length - 1; k > 0; k--) {
            result[k - 1] += result[k] / 10;
            result[k] %= 10;
        }

       StringBuilder sb=new StringBuilder();
       int startIndex=(result[0]==0)?1:0;
        for(int i=startIndex;i<result.length;i++) {
            sb.append(result[i]);
       }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(multiply("12", "2"));
    }
}
