package edu.pdx.cs.joy.pair2;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Diamond {

    @VisibleForTesting
    String getRow(char currentLetter, char targetLetter) {
        return null;
    }

    public static void printDiamond(char ch){
        int n = ch - 'A';

        // Print upper part
        for(int i = 0; i <= n; i++){
            for(int j = n; j > i; j--){
                System.out.print(" ");
            }
            System.out.print((char)('A' + i));

        }

    }

    @VisibleForTesting
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Missing command line arguments");
            return;
        }

        char targetLetter = args[0].charAt(0);
        StringBuilder builder = new StringBuilder();
        // for char c from firstC to char lastC
        // answer += getRow(c, lastC)
        // for char c from lastC-1 to firstC
        // answer += getRow(c, lastC)
    }
}