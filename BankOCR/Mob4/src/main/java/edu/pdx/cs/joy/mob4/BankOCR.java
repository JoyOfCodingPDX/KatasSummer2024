package edu.pdx.cs.joy.mob4;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class BankOCR {
  private static final String[] codes = new String[] {
          " _ | ||_|", // 0
          "     |  |", // 1
          " _  _||_ ", // 2
          " _  _| _|", // 3
          "   |_|  |", // 4
          " _ |_  _|", // 5
          " _ |_ |_|", // 6
  };

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  public static String doOCR(String input) {
    String digits = "";
    for (int i = 0; i < 27; i += 3) {
      digits += "" + (getDigit(input, i));
    }
    return digits;
  }

  @VisibleForTesting
  public static int getDigit (String input, int startPos) {
    int digit = 0;
    String [] hold = input.split("\n");
    String code = "";
    for (int i = 0; i < hold.length; i++) {
      code += hold[i].substring(startPos, startPos + 3);
    }
    for (int i =0;i< codes.length;i++) {
      if(code.equals(codes[i])) {
        return i;
      }
    }
    return digit;
  }

}