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
    return null;
  }
}