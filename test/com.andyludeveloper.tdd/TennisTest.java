package com.andyludeveloper.tdd;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TennisTest {
    Tennis tennis = new Tennis();

    @Test
    public void test_love_all(){
        String result = tennis.score();
        assertThat(result, is("love all"));
    }

    @Test
    public void test_fifteen_love() {
        firstPlayerScoreTimes(1);
        String result = tennis.score();
        assertThat(result, is("fifteen love"));
    }
    @Test
    public void test_thirty_love() {
        firstPlayerScoreTimes(2);
        String result = tennis.score();
        assertThat(result, is("thirty love"));
    }
    @Test
    public void test_forty_love() {
        firstPlayerScoreTimes(3);
        String result = tennis.score();
        assertThat(result, is("forty love"));
    }

    @Test
    public void test_love_fifteen() {
        tennis.secondPlayerScore();
        String result = tennis.score();
        assertThat(result, is("love fifteen"));
    }

    private void firstPlayerScoreTimes(int times) {
        for(int i=0;i<times; i++){
            tennis.firstPlayerScore();
        }
    }
}
