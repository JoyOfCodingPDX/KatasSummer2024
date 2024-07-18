package edu.pdx.cs.joy.pair6;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Diamond {

  public static String createDiamond(String letter) {
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    int letterIndex = alphabet.indexOf(letter);
    String diamond = "";

    for (int i = 0; i <= letterIndex; i++) {
      diamond += createLine(i, letterIndex);
    }

    return diamond;
  }

  public static String createLine(int lineIndex, int letterIndex) {
    String line = "";
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    for (int i = 0; i < letterIndex; i++) {
      line += " ";
    }

    line = alphabet[letterIndex] + line + alphabet[letterIndex];
    line += "\n";

    return line;
  }

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }
}