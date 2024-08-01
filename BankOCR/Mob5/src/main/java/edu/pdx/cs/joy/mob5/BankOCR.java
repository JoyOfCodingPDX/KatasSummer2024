package edu.pdx.cs.joy.mob5;

import com.google.common.annotations.VisibleForTesting;

import java.util.Arrays;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class BankOCR {


  public static final String[][] zeroString = {{" _ "}, {"| |"}, {"|_|"}};
  public static final String[][] oneString = {{"   "}, {"  |"}, {"  |"}};
  public static final String[][] twoString = {{" _ "},{ " _|"},{"|_ "}};
  public static final String[][] threeString = {{" _ "},{ " _|"},{" _|"}};
  public static final String[][] fourString = {{"   "},{ "|_|"},{"  |"}};
  public static final String[][] fiveString = {{" _ "},{ "|_ "},{" _|"}};
  public static final String[][] sixString = {{" _ "},{ "|_ "},{"|_|"}};
  public static final String[][] sevenString = {{" _ "},{ "  |"},{"  |"}};
  public static final String[][] eightString = {{" _ "},{ "|_|"},{"|_|"}};
  public static final String[][] nineString = {{" _ "},{ "|_|"},{" _|"}};


  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  public static String read(String[][] character) {

    if (Arrays.deepEquals(character, zeroString))
    {
      return "0";
    }
    else if (Arrays.deepEquals(character, oneString)) {
      return "1";
    }
    else if (Arrays.deepEquals(character, twoString)) {
      return "2";
    }
    else if (Arrays.deepEquals(character, threeString)) {
      return "3";
    }
    else if (Arrays.deepEquals(character, fourString)) {
      return "4";
    }
    else if (Arrays.deepEquals(character, fiveString)) {
      return "5";
    }
    else if (Arrays.deepEquals(character, sixString)) {
      return "6";
    }
    else if (Arrays.deepEquals(character, sevenString)) {
      return "7";
    }
    else if (Arrays.deepEquals(character, eightString)) {
      return "8";
    }
    else if (Arrays.deepEquals(character, nineString)) {
      return "9";
    }
    return null;
  }
}