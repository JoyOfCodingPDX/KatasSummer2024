package edu.pdx.cs.joy.mob1;

import java.text.ParseException;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Minesweeper {

  @VisibleForTesting
  public static void main(String[] args) {
    if (args.length < 3) {
      System.err.println("Missing command line arguments");
    }

    try{
      int rows = Integer.parseInt(args[0]);
      int columns = Integer.parseInt(args[1]);
    }
    catch(ParseException e){

    }
    

    Character[][] field = new Character[rows][columns];
    for (int i = 2; i < args.length; ++i) {
      for (int j = 0; j < columns; ++j) {
        field[i-2][j] = args[i].charAt(j);
      }
    }

    for (int i = 0; i < columns; ++i) {
      for (int j = 0; j < rows; ++j) {
        int count = 0;
        if(field[i][j] != '*')
        {
          if (i - 1 >= 0) {
          if (j - 1 >= 0) {
            if (field[i-1][j-1] == '*')
              ++count;
          }
          if (j + 1 < rows) {
            if (field[i-1][j+1] == '*')
              ++count;
          }
          if (field[i-1][j] == '*')
            ++count;
        }

        if (i + 1 < columns) {
          if (j - 1 >= 0) {
            if (field[i+1][j-1] == '*')
              ++count;
          }
          if (j + 1 < rows) {
            if (field[i+1][j+1] == '*')
              ++count;
          }
          if (field[i+1][j] == '*')
            ++count;
        }
        if (j - 1 >= 0) {
          if (field[i][j - 1] == '*') {
            ++count;
          }
        }
        if(j+1 < rows){
          if(field[i][j+1] == '*'){
            ++count;
          }
        }
        field[i][j] = (char)count;
        
      }
        System.out.print(field[i][j]);
      }
      System.out.println();
    }
    
  }
}