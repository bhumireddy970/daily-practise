package com.src;

public class RectangleHallowDiamond {
    public static void main(String[] args) {
        //Rectangular Hallow Diamond
        System.out.println("Rectangular Hallow Diamond");
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 2 * 5 - 1; j++) {

                if (j <= 5 - i + 1 || j >= 5 + i - 1 ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
        for (int i = 4; i>=1; i--) {

            for (int j = 1; j <= 2 * 5 - 1; j++) {

                if (j <= 5 - i + 1 || j >= 5 + i - 1 ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        //Butterfly Pattern
        System.out.println("Butterfly Pattern");
        for (int i = 5; i>1; i--) {

            for (int j = 1; j <= 2 * 5 - 1; j++) {

                if (j <= 5 - i + 1 || j >= 5 + i - 1 ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 2 * 5 - 1; j++) {

                if (j <= 5 - i + 1 || j >= 5 + i - 1 ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        //Hallow Butterfly Pattern
        System.out.println("Hallow Butterfly Pattern");
        for (int i = 5; i>=1; i--) {

            for (int j = 1; j <= 2 * 5 - 1; j++) {

                if (j == 5 - i + 1 || j == 5 + i - 1|| j==1 || j == 9 ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 2 * 5 - 1; j++) {

                if (j == 5 - i + 1 || j == 5 + i - 1|| j==1 || j == 9  ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        //hallow Rectngle
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if(i==1 || j==1 || j==5 || i==5){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        // Diamond
        System.out.println("Diamond");
        for(int i=0;i<4;i++)
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
    }
}
