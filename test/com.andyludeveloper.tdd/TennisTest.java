package com.andyludeveloper.tdd;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TennisTest {

    @Test
    public void test_love_all(){
        Tennis tennis = new Tennis();
        String result = tennis.score();
        assertThat(result, is("love all"));
    }

    @Test
    public void test_fifteen_love() {
        Tennis tennis = new Tennis();
        tennis.firstPlayerScore();
        String result = tennis.score();
        assertThat(result, is("fifteen love"));
    }
    @Test
    public void test_thirty_love() {
        Tennis tennis = new Tennis();
        tennis.firstPlayerScore();
        tennis.firstPlayerScore();
        String result = tennis.score();
        assertThat(result, is("thirty love"));
    }
}
