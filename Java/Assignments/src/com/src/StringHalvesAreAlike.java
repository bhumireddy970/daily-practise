package com.src;

public class StringHalvesAreAlike {
    public static boolean halvesAreAlike(String s) {
        int count1=0,count2=0;
        char[] a=new char[s.length()/2];
        char[] b=new char[s.length()/2];
        char[] str=s.toLowerCase().toCharArray();
        int k=0;
        for(int i=0;i<s.length();i++){
            if(i<s.length()/2){
                a[i]=str[i];
                if(a[i]=='a'||a[i]=='e' || a[i]=='o' || a[i]=='i' || a[i]=='u' ){
                    count1++;
                }
            }
            else{
                b[k]=str[i];
                if(b[k]=='a'||b[k]=='e' || b[k]=='o' || b[k]=='i' || b[k]=='u' ){
                    count2++;
                }
                k++;
            }
        }
        return count1==count2;
    }

    public static void main(String[] args) {
        System.out.println(halvesAreAlike("textbook"));
    }
}
