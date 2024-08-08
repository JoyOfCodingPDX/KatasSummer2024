package edu.pdx.cs.joy.mob3;

import com.google.common.annotations.VisibleForTesting;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Minesweeper {
    public String grid = null;
    public Integer x, y;
    public ArrayList<char[]> grid2d;

    public Minesweeper (String grind) {
        this.grid = grind;
        parseSize();
        parseGrid();
    }

    public Minesweeper() {}

    /**
     * Parses the size of the grid from the first line
     */
    public void parseSize() {
        String line = grid.split("\n")[0];
        try{
            this.x = Integer.parseInt(line.split(" ")[0]);
            this.y = Integer.parseInt(line.split(" ")[1]);
        }catch (NumberFormatException e){
            System.err.println(e.getMessage());
        }
    }

    public char getNum(int y, int x){
        if(this.y > 1){
            //grid.get[]

        }
        return '1';
    }


    public void parseGrid() {
        this.grid2d = new ArrayList<>();
        ArrayList<String> lines = new ArrayList<String>(Arrays.asList(this.grid.split("\n")));
        boolean ignoredFirst = false;
        for (String line : lines) {
            if (!ignoredFirst) ignoredFirst = true;
            else this.grid2d.add(line.toCharArray());
        }
    }

    //public Integer getSize(){}

    @VisibleForTesting
    public static void main(String[] args) {
        System.err.println("Missing command line arguments");
    }
}