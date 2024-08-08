package edu.pdx.cs.joy.mob3;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Minesweeper {
    public String grid = null;
    public Integer x;
    public Integer y;

    public Minesweeper (String grind) {
        this.grid = grind;
        parseSize();
    }

    public Minesweeper() {}

    /**
     * Parses the size of the grid from the first line
     */
    public void parseSize() {
        String line = grid.split("\n")[0];
        this.x = Integer.parseInt(line.split(" ")[0]);
        this.y = Integer.parseInt(line.split(" ")[1]);
    }

    //public Integer getSize(){}

    @VisibleForTesting
    public static void main(String[] args) {
        System.err.println("Missing command line arguments");
    }
}