package com.src;

import java.util.Scanner;

public class LiveCricketScoreBoard {
    int wickets1 = 0;
    int wickets2 = 0;
    float overs1 = 0.0f;
    float overs2 = 0.0f;
    int score1 = 0;
    int score2 = 0;
    boolean flag1 = true;
    boolean flag2 = false;
    Scanner sc = new Scanner(System.in);
    String teamName1="";
    String teamName2="";

    public void ScoreBoard() {
        do {
            System.out.print("Enter runs scored in the current ball:");
            String runs = sc.nextLine();
            if (runs.matches("[7-9]*")) {
                System.out.println("The runs should between 0 to 6");
            } else if (runs.equalsIgnoreCase("w") || runs.matches("[0-6]")) {
                if (runs.equalsIgnoreCase("w")){
                    if(flag1)
                        wickets1++;
                    else
                        wickets2++;
                }
                else{
                    if(flag1)
                        score1 += Integer.parseInt(runs);
                    else
                        score2 += Integer.parseInt(runs);
                }

                if(flag1)
                {
                    if (overs1 - (int) overs1 < 0.5f)
                        overs1 += 0.1f;
                    else {
                        overs1 += 0.5f;
                    }
                    overs1 = Math.round(overs1 * 10.0f) / 10.0f;
                }
                else {
                    if (overs2 - (int) overs2 < 0.5f)
                        overs2 += 0.1f;
                    else {
                        overs2 += 0.5f;
                    }
                    overs2 = Math.round(overs2 * 10.0f) / 10.0f;
                }
            } else if (runs.matches("[a-zA-Z]*")) {
                System.out.println("The allowed characters are only W or w i.e wicket");
            }
            if(flag1)
                System.out.println(teamName1+" : " + score1 + "/" + wickets1 + " over " + overs1);
            else if(flag2)
                System.out.println(teamName2+" : " + score2 + "/" + wickets2 + " over " + overs2);
            if (flag1) {
                if (wickets1 == 10) {
                    System.out.println("All out wait for second innings");
                    summary();
                }
                else if(overs1 >= 3.0) {
                    System.out.println("Match Completed wait for second innings");
                    summary();
                }
            }
            if (flag2) {
                if (score1<score2 || wickets2 == 10 || overs2 >= 3.0) {
                    if(score1<score2)
                         System.out.println(teamName2 +" is the winner of the match ");
                    else if(score1>score2)
                         System.out.println(teamName1 +" is the winner of the match ");
                    else
                        System.out.println("Both "+teamName1+" and "+teamName2+" are equal. Match Draw");
                    summary();
                }

            }

        } while (flag1 ||  flag2);

    }

    public void summary()
    {
        if(flag1){
            System.out.println("Summary of Team-1 :");
            System.out.println("Runs :" + score1);
            System.out.println("Wickets :" + wickets1);
            System.out.println("Overs :" + overs1);
            flag1 = false;
            flag2 = true;
            System.out.print("Enter second innings Team Name:");
            teamName2=sc.nextLine();
        }
        else if(flag2){
            System.out.println("Summary of Team-2 :");
            System.out.println("Runs :" + score2);
            System.out.println("Wickets :" + wickets2);
            System.out.println("Overs :" + overs2);
            flag2 = false;
            System.out.println("Match Completed");
        }
    }

    public static void main(String[] args) {

        LiveCricketScoreBoard lcbc = new LiveCricketScoreBoard();

        System.out.println("Welcome to Live Cricket Score Board");
        System.out.print("Enter first innings Team Name:");
        lcbc.teamName1=lcbc.sc.nextLine();
        lcbc.ScoreBoard();
    }
}
