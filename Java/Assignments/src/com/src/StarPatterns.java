package com.src;

public class StarPatterns {
    public static void main(String[] args) {
        //Rectangular pattern
        System.out.println("Rectangular pattern");
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        //left side below triangle
        System.out.println("left side below triangle");
        for(int i=0;i<5;i++)
        {
            for(int j=i;j>=0;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //left side above triangle
        System.out.println("left side above triangle");
        for(int i=5;i>0;i--)
        {
            for(int j=i;j>0;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }


        //left side below and above triangle
        System.out.println("left side below and above triangle");
        for(int i=0;i<5;i++)
        {
            for(int j=i;j>=0;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=4;i>0;i--)
        {
            for(int j=i;j>0;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        //right side below triangle
        System.out.println("right side below triangle");
        for(int i=0;i<5;i++)
        {
            for(int k=4;k>i;k--)
            {
                System.out.print(" ");
            }
            for(int j=i;j>=0;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        //right side above triangle
        System.out.println("right side above triangle");
        for(int i=0;i<5;i++)
        {
            for(int k=i;k>0;k--)
            {
                System.out.print(" ");
            }
            for(int j=5-i;j>0;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        //full Triangle
        System.out.println("full Triangle");
        for(int i=0;i<5;i++)
        {
            for(int k=4;k>i;k--)
            {
                System.out.print(" ");
            }
            for(int j=i;j>=0;j--)
            {
                System.out.print("*");
            }
            for(int l=i-1;l>=0;l--)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        //Inverted Triangle
        System.out.println("Inverted Triangle");
        for(int i=0;i<5;i++)
        {
            for(int k=i;k>0;k--)
            {
                System.out.print(" ");
            }
            for(int j=5-i;j>0;j--)
            {
                System.out.print("*");
            }
            for(int l=5-i-1;l>0;l--) {
                System.out.print("*");
            }
            System.out.println();
        }

        //full triangle with spaces
        System.out.println("full triangle with spaces");
        for(int i=0;i<5;i++)
        {
            for(int k=4;k>i;k--)
            {
                System.out.print(" ");
            }
            for(int j=i;j>=0;j--)
            {
                System.out.print("* ");
            }

            System.out.println();
        }

        //Inverted Triangle with spaces
        System.out.println("Inverted Triangle with spaces");
        for(int i=0;i<5;i++)
        {
            for(int k=i;k>0;k--)
            {
                System.out.print(" ");
            }
            for(int j=5-i;j>0;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        // full triangle and Inverted Triangle with spaces
        System.out.println("full triangle and Inverted Triangle with spaces");
        for(int i=0;i<5;i++)
        {
            for(int k=i;k>0;k--)
            {
                System.out.print(" ");
            }
            for(int j=5-i;j>0;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=0;i<5;i++)
        {
            for(int k=4;k>i;k--)
            {
                System.out.print(" ");
            }
            for(int j=i;j>=0;j--)
            {
                System.out.print("* ");
            }

            System.out.println();
        }

        //left side above triangle with alphabetical values
        System.out.println("left side above triangle with alphabetical values");

        int k;
        char c='E';
        for(int i=5;i>0;i--)
        {
            k=0;
            for(int j=i;j>0;j--)
            {
                System.out.print((char)(c-k)+" ");
                k++;
            }
            c-=1;

            System.out.println();
        }

        //Hallow Triangle
        System.out.println("Hallow Triangle");
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 2 * 5 - 1; j++) {

                if (j == 5 - i + 1 || j == 5 + i - 1 || i == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        //Inverted Hallow Triangle
        System.out.println("Inverted Hallow Triangle");
        for (int i = 5; i>=1; i--) {

            for (int j = 1; j <= 2 * 5 - 1; j++) {

                if (j == 5 - i + 1 || j == 5 + i - 1 || i == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        //Hallow Diamond
        System.out.println("Hallow Diamond");
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 9; j++) {

                if (j == 5 - i + 1 || j == 5 + i - 1 ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
        for (int i = 4; i>=1; i--) {

            for (int j = 1; j <= 9; j++) {

                if (j == 5 - i + 1 || j == 5 + i - 1 ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        //Hallow parllelogram
        System.out.println("Hallow parllelogram");
        for (int i=0;i<5;i++)
        {
            for (int m=0;m<5-i;m++)
            {
                System.out.print(" ");
            }
            for (int j=0;j<5;j++)
            {
                if(i==0 || j==0 || i==4 || j==4)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }



    }


}
