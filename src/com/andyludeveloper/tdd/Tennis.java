package com.andyludeveloper.tdd;

import java.util.HashMap;

public class Tennis {
    private int firstPlayerScore;
    private int secondPlayerScore;
    private final HashMap<Integer, String> scoreLookup;
    public String player1;
    public String player2;

    Tennis(String player1, String player2){
        firstPlayerScore = 0;
        scoreLookup = new HashMap<>();
        scoreLookup.put(1, "fifteen");
        scoreLookup.put(2, "thirty");
        scoreLookup.put(3, "forty");
        this.player1 = player1;
        this.player2 = player2;
    }

    String score(){

        if(firstPlayerScore >=3 && secondPlayerScore >=3){
            if(firstPlayerScore>secondPlayerScore){
                if(firstPlayerScore-secondPlayerScore>1){
                    return player1 + " win";
                }
                return player1 + " adv";
            }
            if(secondPlayerScore>firstPlayerScore){
                return player2 + " adv";
            }
            return "deuce";
        }

        if(secondPlayerScore>0){
            return "love "+ scoreLookup.get(secondPlayerScore);
        }
        if(firstPlayerScore>0){
            return scoreLookup.get(firstPlayerScore)+" love";
        }
        return "love all";
    }

    public void firstPlayerScore() {
        firstPlayerScore++;
    }
    public void secondPlayerScore() {
        secondPlayerScore++;
    }
}
