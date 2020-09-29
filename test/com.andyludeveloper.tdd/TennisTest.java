package com.andyludeveloper.tdd;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TennisTest {
    Tennis tennis = new Tennis("Tom", "Mary");

    @Test
    public void test_love_all(){
        shouldBe("love all");
    }

    @Test
    public void test_fifteen_love() {
        firstPlayerScoreTimes(1);
        shouldBe("fifteen love");
    }

    @Test
    public void test_thirty_love() {
        firstPlayerScoreTimes(2);
        shouldBe("thirty love");
    }
    @Test
    public void test_forty_love() {
        firstPlayerScoreTimes(3);
        shouldBe("forty love");
    }
    @Test
    public void test_love_fifteen() {
        secondPlayerScoreTimes(1);
        shouldBe("love fifteen");
    }

    @Test
    public void test_love_thirty() {
        secondPlayerScoreTimes(2);
        shouldBe("love thirty");
    }
    @Test
    public void test_deuce() {
        givenDeuce();
        shouldBe("deuce");
    }

    @Test
    public void test_player1_adv() {
        givenDeuce();
        firstPlayerScoreTimes(1);
        shouldBe("Tom adv");
    }
    @Test
    public void test_player2_adv() {
        givenDeuce();
        secondPlayerScoreTimes(1);
        shouldBe("Mary adv");
    }
    @Test
    public void test_player1_win() {
        givenDeuce();
        firstPlayerScoreTimes(2);
        shouldBe("Tom win");
    }
    @Test
    public void test_player2_win() {
        givenDeuce();
        secondPlayerScoreTimes(2);
        shouldBe("Mary win");
    }

    private void givenDeuce() {
        firstPlayerScoreTimes(3);
        secondPlayerScoreTimes(3);
    }

    private void shouldBe(String expected) {
        String result = tennis.score();
        assertThat(result, is(expected));
    }

    private void secondPlayerScoreTimes(int times) {
        for(int i=0; i<times; i++){
        tennis.secondPlayerScore();
        }
    }

    private void firstPlayerScoreTimes(int times) {
        for(int i=0;i<times; i++){
            tennis.firstPlayerScore();
        }
    }
}
