package com.andyludeveloper.tdd;

public class Tennis {
    private int firstPlayerScore;
    Tennis(){
        firstPlayerScore = 0;
    }

    String score(){
        if(firstPlayerScore==1){
            return "fifteen love";
        }
        return "love all";
    }

    public void firstPlayerScore() {
        firstPlayerScore++;
    }
}
