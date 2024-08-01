package edu.pdx.cs.joy.everyone;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Tennis {

  String[] scores = {"Love", "15", "30", "40"};
  int player1Index = 0;
  int player2Index = 0;

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  public String getPlayer1Score() {
    return scores[player1Index];
  }

  public String getPlayer2Score() {
    return scores[player2Index];
  }

  public void player1Scores() {
    player1Index++;
  }

  public void player2Scores() {
    player2Index++;
  }

}