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
  
  public int getDistance(char input){
    return Character.toUpperCase(input) - 'A';
  }

  public

  public static String[][] makeDiamond(Character c) {
    int charDistance = c - 'A';
    String[][] result = new String[charDistance][charDistance];
    return result;
  }

  public char[][] init2DArray(int distance) {
    char[][] chararray = new char[distance + 1][(distance * 2) + 1];
    return chararray;
  }
}