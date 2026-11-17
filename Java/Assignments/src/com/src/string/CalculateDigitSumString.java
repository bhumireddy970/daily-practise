package com.src.string;

public class CalculateDigitSumString {
    public static String digitSum(String s, int k) {
        while(s.length()>k)
        {
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<s.length();i+=k)
            {
                int sum=0;
                for(int j=i;j<s.length() && j<i+k;j++)
                    sum+=s.charAt(j)-'0';
                sb.append(sum);
            }
            s=sb.toString();
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println(digitSum("11111222223",3));
    }
}
