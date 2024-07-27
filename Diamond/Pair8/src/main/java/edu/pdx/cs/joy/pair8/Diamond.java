package edu.pdx.cs.joy.pair8;

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

    if(args.length != 1) {
      System.err.println("Missing command line arguments");
    }
    char ch = 'C';
    printDiamond(ch);
  }
  public static void printDiamond(char end) {
    int total = end - 'A';
    int spaces = total;
    for(char current = 'A'; current <= end; current++) {
      for(int n = 0; n < spaces; n++) {
        System.out.print(" ");
      }
      System.out.print(current);
      for(int n = 0; n < spaces; n++) {
        System.out.print(" ");
      }
      System.out.println();
      --spaces;
    }
    spaces = total;

  }
  /**
   "  A  " 3 - 1 spaces,
   " B B " 3 - 2 spaces
   "C   C"
   " B B "
   "  A  "
   "    A    "
   "   B B   "
   "  C   C  "
   " D     D "
   "E       E"
   */
}