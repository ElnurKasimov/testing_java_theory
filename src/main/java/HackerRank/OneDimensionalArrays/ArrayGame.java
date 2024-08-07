package HackerRank.OneDimensionalArrays;

//  Let's play a game on an array! You're standing at index 0
//  of an n-element array named 'game'. From some index i (where 0<=i<=n),
//  you can perform one of the following moves:
//
//Move Backward: If cell i-1 exists and contains a 0, you can walk back to cell i-1.
//Move Forward:
//If cell i+1 contains a zero, you can walk to cell i+1.
//If cell i+leap contains a zero, you can jump to cell i+leap.
//If you're standing in cell n-1 or the value of i+leap>=n, you can walk
// or jump off the end of the array and win the game.
//In other words, you can move from index i to index i+1,i-1 , or i+leap as long
// as the destination index is a cell containing a 0.
// If the destination index is greater than n-1, you win the game.
//
//Function Description
//
//Complete the canWin function in the editor below.
//
//canWin has the following parameters:
//
//int leap: the size of the leap
//int game[n]: the array to traverse
//Returns
//
//boolean: true if the game can be won, otherwise false

import java.util.Arrays;

public class ArrayGame {

    public static boolean canWin(int leap, int[] game) {
        if(game.length <= leap) {
            return true;
        }
        for (int i = 0; i < game.length; i++) {
            for (int j = i; j < game.length; j++) {
                int[]subArray = Arrays.copyOfRange(game,i,j+1);
                if(containsAllOnes(subArray) && subArray.length >= leap ) {
                    return false;
                }
            }
            if (i+leap < game.length - 1) {
                if (game[i+1] == 1 && game[i+leap] == 1) {
                    return false;
                }
            }

        }
        return true;
    }

    public static boolean containsAllOnes(int[] subArray) {
        if(subArray.length == 0) {
            return false;
        }
        for (int j : subArray) {
            if (j == 0) {
                return false;
            }
        }
        return true;
    }

}
