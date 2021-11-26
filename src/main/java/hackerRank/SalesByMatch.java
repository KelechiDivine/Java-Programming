package hackerRank;

import chapterSeven.examples.Array;

import java.util.Arrays;
import java.util.List;

public class SalesByMatch {

    /* The goal is to count the numbers of how many pairs of socks. This also gives info that the final result should be an integer. */

    /*                  PseudoCode
    * -> Need to initiate a count variable to count pairs and return the value.
    * -> Sort the given array
    * -> Loop through the sorted array
    * -> If the current item equals to the next item
    * -> Then that's the pair, increment our count variable
    * -> Also increment currentItem to skip the next item
    * -> return the count value.
      */

//    TODO: numberOfSocks : the number (integer) of socks in the pile.
//    TODO: arrayOfSockColor : an array of the colors (also integer to represent the value of each color) of each sock.


//    TODO: Create a method that implement the pseudoCode.
    public int sockMerchant(int numberOfSocks, int [] givenArray){
        int count  = 0;
        Arrays.sort(givenArray);

        for (int currentItem = 0; currentItem < numberOfSocks - 1; currentItem++){
            if (givenArray[currentItem] == givenArray[currentItem + 1]){
                count++;
                currentItem += 1;
            }
        }
        return count;
    }
}
