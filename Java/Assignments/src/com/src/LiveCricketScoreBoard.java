package com.src;

import java.util.Scanner;

public class LiveCricketScoreBoard {
    public static void main(String[] args) {
        int wickets = 0;
        float overs = 0.0f;
        boolean flag = true;
        int score = 0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter runs scored in the current ball:");
            String runs = sc.nextLine();
            if (runs.matches("[7-9]")) {
                System.out.println("The runs should between 0 to 6");
            } else if (runs.equalsIgnoreCase("w") || runs.matches("[0-6]")) {
                if (runs.equalsIgnoreCase("w"))
                    wickets++;
                else
                    score += Integer.parseInt(runs);
                if (overs - (int) overs < 0.5f)
                    overs += 0.1f;
                else {
                    overs += 0.5f;
                }
                overs = Math.round(overs * 10.0f) / 10.0f;
            } else if (runs.matches("[a-zA-Z]*")) {
                System.out.println("The allowed characters are only W or w i.e wicket");
            }
            System.out.println("CSK : " + score + "/" + wickets + " over " + overs);
            if (wickets == 10 || overs >= 3.0) {
                if(wickets == 10)
                     System.out.println("All out wait for second innings");
                else
                    System.out.println("Match Completed wait for second innings");
                System.out.println("Summary :");
                System.out.println("Runs :"+ score);
                System.out.println("Wickets :"+ wickets);
                System.out.println("Overs :"+ overs);
                flag = false;
            }
        } while (flag);

    }
}
