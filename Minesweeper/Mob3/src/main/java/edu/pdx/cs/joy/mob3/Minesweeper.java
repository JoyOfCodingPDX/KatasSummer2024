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

    public int getNum(int y, int x){
        int num = 0;

        if (y > 0 && isBomb(y - 1, x)) {
            num++;
        }
        if (x > 0 && isBomb(y, x - 1)) {
            num++;
        }
        if (x < this.x && isBomb(y, x + 1)) {
            num++;
        }
        if (y < this.y && isBomb(y + 1, x)) {
            num++;
        }

        // top left corner
        if (y > 0 && x > 0 && isBomb(y - 1, x - 1)) {
            num++;
        }
        // bottom right corner
        if (x < this.x && y < this.y && isBomb(y + 1, x + 1)) {
            num++;
        }
        // bottom left corner
        if (x > 0 && y < this.y && isBomb(y + 1, x - 1)) {
            num++;
        }
        // top right
        if (x < this.x && y > 0 && isBomb(y - 1, x + 1)) {
            num++;
        }
        
        return num;
    }

    public boolean isBomb(int y, int x){
        return (grid2d.get(y)[x] == '*');
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