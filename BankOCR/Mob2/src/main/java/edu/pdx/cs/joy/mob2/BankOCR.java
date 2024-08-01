package edu.pdx.cs.joy.mob2;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class BankOCR {

  String pipeReference = "    _  _     _  _  _  _  _ " +
                         "  | _| _||_||_ |_   ||_||_|" +
                         "  ||_  _|  | _||_|  ||_| _|";

  final String numberZero = " _ | ||_|";
  final String numberOne = "     |  |";
  final String numberTwo = " _  _||_ ";

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  public Integer parse(String numToParse) {
    switch (numToParse) {
      case (numberZero):
        return 0;
      case (numberOne):
        return 1;
      case (numberTwo):
        return 2;
      default:
        return -1;
    }
  }
}