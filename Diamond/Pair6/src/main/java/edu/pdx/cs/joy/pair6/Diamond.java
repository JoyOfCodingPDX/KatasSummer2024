package edu.pdx.cs.joy.pair6;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Diamond {

  public String createDiamond(String letter) {
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    int letterIndex = alphabet.indexOf(letter);
    String diamond = "";

    if (letter == "A")
     return "A";

    for (int i = 0; i < letterIndex; i++) {
      diamond += createLine(i, letterIndex);

      if (i != letterIndex - 1)
        diamond += "\n";
    }

    return diamond;
  }

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }
}