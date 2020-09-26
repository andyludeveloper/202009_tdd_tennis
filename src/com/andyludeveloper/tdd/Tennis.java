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
        if(firstPlayerScore == 2){
            return "thirty love";
        }
        return "love all";
    }

    public void firstPlayerScore() {
        firstPlayerScore++;
    }
}
