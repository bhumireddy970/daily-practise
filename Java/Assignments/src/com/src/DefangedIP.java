package com.src;

public class DefangedIP {
    public static String defangIPaddr(String address) {
        String defangIp = "";
        char[] arr=address.toCharArray();

        for(char ch:arr){
            if(ch=='.'){
                defangIp=defangIp+"[.]";
            }
            else{
                defangIp=defangIp+ch;
            }
        }
        return defangIp;

    }
    public static void main(String[] args) {
        System.out.println(defangIPaddr("255.255.255.255"));
    }
}
