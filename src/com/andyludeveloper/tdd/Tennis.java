package com.andyludeveloper.tdd;

import java.util.HashMap;

public class Tennis {
    private int firstPlayerScore;
    private final HashMap<Integer, String> scoreLookup;
    Tennis(){
        firstPlayerScore = 0;
        scoreLookup = new HashMap<>();
        scoreLookup.put(1, "fifteen");
        scoreLookup.put(2, "thirty");
    }

    String score(){
        if(firstPlayerScore>0){
            return scoreLookup.get(firstPlayerScore)+" love";
        }
        return "love all";
    }

    public void firstPlayerScore() {
        firstPlayerScore++;
    }
}
