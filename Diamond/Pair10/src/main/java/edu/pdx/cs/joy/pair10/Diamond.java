package edu.pdx.cs.joy.pair10;



import com.google.common.annotations.VisibleForTesting;

import java.util.ArrayList;
import java.util.List;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Diamond {

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  public static String[][] makeDiamond(Character c) {
    int charDistance = c - 'A';
    String[][] result = new String[charDistance][charDistance];
    return result;
  }
}