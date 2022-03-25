package com.sherry.score;

public class scoringNG {
    public static void main(String[] args) {
        String[] names = { "Sherry" , "Tammy" , "Kenny", "Wayne", "Kevin" };
        int[] english = {90, 88, 75, 60, 70};
        int[] math = {60, 55, 84, 75, 64};
        for (int i = 0; i < 5; i++) {
                System.out.println(names[i] + "\t" + english[i] + "\t" + math[i] );
            }

        }


    }
