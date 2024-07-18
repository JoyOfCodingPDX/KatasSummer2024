package edu.pdx.cs.joy.pair2;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Diamond {

    public static void printDiamond(char ch){
        int n = ch - 'A';

        // Print upper part
        for(int i = 0; i <= n; i++){
            for(int j = n; j > i; j--){
                System.out.print(" ");
            }
            System.out.print((char)('A' + i));
            if (i > 0) {
                for (int j = 0; j < (i-1)*2+1; j++) {
                    System.out.print(" ");
                }
                System.out.print((char)('A' + i));
            }
            System.out.println();
        }
        // Print lower part
        for (int i = n-1; i >= 0; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            System.out.print((char)('A' + i));
            if (i > 0) {
                for (int j = 0; j < (i-1)*2+1; j++) {
                    System.out.print(" ");
                }
                System.out.print((char)('A' + i));
            }
            System.out.println();
        }
    }

    @VisibleForTesting
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Missing command line arguments");
            return;
        }

        char targetLetter = args[0].charAt(0);
        printDiamond(targetLetter);
    }
}