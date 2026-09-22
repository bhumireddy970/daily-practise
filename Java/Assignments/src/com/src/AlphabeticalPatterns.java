package com.src;

public class AlphabeticalPatterns {
    public static void main(String[] args) {
        System.out.println("Alphabets left right angle triangle");
        char ch='a';
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if(ch%2!=0)
                    System.out.print((char)(ch++)+" ");
                else {

                    System.out.print(Character.toUpperCase(ch++)+" ");
                }
            }
            System.out.println();
        }

        System.out.println("Alphabets left right angle triangle");
        for(int i=0;i<5;i++)
        {
            for(int j=i;j>=0;j--)
            {
                    System.out.print((char)('E'-j)+" ");
            }
            System.out.println();
        }
    }
}
