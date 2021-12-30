package hackerRank;

import java.util.Arrays;

public class SalesByMatch {

//    TODO: numberOfSocks : the number (integer) of socks in the pile.
//    TODO: givenArray : an array of the colors (also integer to represent the value of each color) of each sock.


//    TODO: Create a method that implement the pseudoCode.
    public int sockMerchant(int numberOfSocks, int [] givenArray){
        int count  = 0;
        Arrays.sort(givenArray);
        System.out.println(Arrays.toString(givenArray));

        for (int currentItem = 0; currentItem < numberOfSocks - 1; currentItem++){
            if (givenArray[currentItem] == givenArray[currentItem + 1]){
                count++;
                currentItem += 1;
            }
        }
        return count;
    }
}
