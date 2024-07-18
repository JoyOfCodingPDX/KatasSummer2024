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

  public char[][] init2DArray(int distance) {
    char[][] chararray = new char[distance + 1][(distance * 2) + 1];
    return chararray;
  }

  public char[][] makeDiamond(char c) {
    int distance = getDistance(c);
    char[][] array = init2DArray(distance);

    int left, right;
    left = right = distance;


    char currentChar = 'A';
    for (int i = 0; i <= distance; ++i) {
      array[i][left--] = currentChar;
      array[i][right++] = currentChar;
      ++currentChar;
    }
    return array;
  }

  public void displayDiamond(char[][] diamond) {

  }
}