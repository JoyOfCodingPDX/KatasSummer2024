package edu.pdx.cs.joy.pair11;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Diamond {

  public int getDistanceFromA(char letter) {
    return letter - 'A';
  }

  public String buildLine(int spacesBefore,int spacesBetween, char letter) {
    StringBuilder sp = new StringBuilder();

    sp.append(" ".repeat(Math.max(0, spacesBefore)));

    sp.append(letter);

    if (spacesBetween > 0 )
    {
        sp.append(" ".repeat(spacesBetween));
        sp.append(letter);
    }
    return sp.toString();
  }

  public String diamondString(char letter) {
    StringBuilder sb = new StringBuilder();
    int distanceFromA = this.getDistanceFromA(letter);
    int spaceBefore = distanceFromA;
    int spaceBetween = 0;
    char currentLetter = 'A';

    for (int i = 0; i <= distanceFromA; i++) {
      sb.append(this.buildLine(spaceBefore, spaceBetween,currentLetter));
      sb.append("\n");
      spaceBetween += spaceBetween == 0 ? 1 : 2;
      spaceBefore--;
      currentLetter = (char) (currentLetter + 1);
    }

    for (int i = distanceFromA; i >= 0; i--) {
      spaceBetween -= spaceBetween == 1 ? 1 : 2;
      spaceBefore++;
      currentLetter = (char) (currentLetter - 1);
      sb.append(this.buildLine(spaceBefore, spaceBetween, currentLetter));
      sb.append("\n");
    }


    return sb.toString();
  }

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }
}