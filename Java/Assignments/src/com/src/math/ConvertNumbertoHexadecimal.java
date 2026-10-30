package com.src.math;

public class ConvertNumbertoHexadecimal {
    public static String toHex(int num) {
        if(num==0)
            return "0";
        long val=num;
        if(val<0)
            val=(long)(Math.pow(2,32))+num;
        StringBuilder sb=new StringBuilder();
        String hexcode="0123456789abcdef";
        while(val>0){
            int rem=(int) (val%16);
            sb.append(hexcode.charAt(rem));
            val=val/16;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(toHex(-1));
    }
}
