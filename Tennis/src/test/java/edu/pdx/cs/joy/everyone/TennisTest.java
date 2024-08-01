package edu.pdx.cs.joy.everyone;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class TennisTest
{

  @Test
  void canInstantiateKataClass() {
    new Tennis();
  }

  @Test
  void playersStartatLoveTrue(){
    Tennis t = new Tennis();

    String player1Score = t.getPlayer1Score();
    String player2Score = t.getPlayer2Score();

    assertThat(player1Score, equalTo("Love"));
    assertThat(player2Score, equalTo("Love"));
  }

@Test
  void incrementPlayerOneSuccess() {
    Tennis t = new Tennis();
    t.player1Scores();
    String player1Score = t.getPlayer1Score();
    String player2Score = t.getPlayer2Score();

    assertThat(player1Score, equalTo("15"));
    assertThat(player2Score, equalTo("Love"));
}

  @Test
  void incrementPlayerTwoSuccess() {
    Tennis t = new Tennis();
    t.player2Scores();
    String player1Score = t.getPlayer1Score();
    String player2Score = t.getPlayer2Score();

    assertThat(player1Score, equalTo("Love"));
    assertThat(player2Score, equalTo("15"));
  }

}


