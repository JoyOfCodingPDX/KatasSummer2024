package edu.pdx.cs.joy.pair5;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Diamond {
  @VisibleForTesting
  public static void main(String[] args) {
    char letter = 'C';
    int letterNumValue = letter - 'A' + 1;
    int startLetter = 'A';
    for (int i = 0; i < letterNumValue; i++) {
      System.out.print(" ");
     char toPrint = (char) startLetter;
     System.out.print(toPrint);
     startLetter++;
    }
  }
 public void makeSpacing  (int space){
    for (int i = space; i >=0; i--) {
       System.out.print(" ");
    }
 }
}