package com.src;
public class ShuffleString {
    public static String restoreString(String s, int[] indices) {
        char[] string = new char[s.length()];
        char[] arr=s.toCharArray();
        for(int i=0;i<indices.length;i++){
            string[indices[i]]=arr[i];
        }
        String result="";
        for(char ch:string){
            result+=ch;
        }

        return result;
    }

    public static void main(String[] args) {
        int [] arr={4,5,6,7,0,2,1,3};
        System.out.println(restoreString("codeleet",arr));
    }
}
