package com.src;

public class NumericalPatterns {
    public static void main(String[] args) {

        //left side below triangle with numerical values
        System.out.println("left side below triangle with numerical values");
        for(int i=1;i<=5;i++)
        {
            int k=1;
            for(int j=i;j>=1;j--)
            {
                System.out.print(k+++" ");
            }
            System.out.println();
        }

        //left side below triangle with numerical values
        System.out.println("left side below triangle with numerical values");
        int k=1;
        for(int i=1;i<=5;i++)
        {

            for(int j=i;j>=1;j--)
            {
                System.out.print(k+++" ");
            }
            System.out.println();
        }

        //left side above triangle with numerical values
        System.out.println("left side above triangle with numerical values");
        k=1;
        for(int i=5;i>=0;i--)
        {
            for(int j=i;j>=0;j--)
            {
                System.out.print(k+" ");
            }
            k++;
            System.out.println();
        }

        //binary left below triangle
        System.out.println("binary left below triangle");
        for(int i=0;i<5;i++)
        {
            for (int j=0;j<=i;j++)
            {
                if((i+j)%2==0)
                    System.out.print(1+" ");
                else
                    System.out.print(0+" ");
            }
            System.out.println();
        }

        //Border identical numbers
        System.out.println("Border identical numbers");
        for(int i=0;i<7;i++)
        {
            for (int j=0;j<7;j++)
            {
                int rowDist = (i < 3) ? (3 - i) : (i - 3);
                int colDist = (j < 3) ? (3 - j) : (j - 3);

                int value = (Math.max(rowDist, colDist)) + 1;
                System.out.print(value +" ");
            }
            System.out.println();
        }

        System.out.println("Numerical half buterfly");
        for(int i=1;i<5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            for(int m=4-i;m>=1;m--)
            {
                System.out.print(" ");
            }
            for(int m=4-i;m>=1;m--)
            {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("full Triangle with numerical values ");
        for(int i=0;i<5;i++)
        {
            int value=1;
            for(int m=4;m>i;m--)
            {
                System.out.print("  ");
            }
            for(int j=i;j>=0;j--)
            {
                System.out.print(value+j+" ");
            }
            value++;
            for(int l=i-1;l>=0;l--)
            {
                System.out.print((value++)+" ");
            }
            System.out.println();
        }



    }
}
