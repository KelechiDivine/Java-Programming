package hackerRank;

public class CountingValley {

    /* The goal is to count the number of valleys a hiker goes though: */

     /*                 PseudoCode

     * -> Initialize the altitude to default (0)
     * -> Initialize the valley to (0)
     * -> Then,increment direction toward the hike step
     * -> Check if the path is U.
     * -> If the path is equals U, then keep incrementing the altitude
     * -> If the altitude is still at default, then keep incrementing the valley
     * -> Else if altitude is not equals U, the decrement the altitude
     * -> return the valley.

     */


    //    TODO: Create counting valley method

    public int countingValley(String direction, int step) {
        int seaLevel = 0;
        int valley = 0;

        for (int stillInValley = 0; stillInValley < direction.length(); stillInValley++){
            if (direction.charAt(stillInValley) == 'U'){
                seaLevel ++;
            }
            else{
                if (direction.charAt(stillInValley) == 'D'){
                    if (seaLevel == 0){
                        valley++;
                    }
                    seaLevel--;
                }
            }
        }

//        TODO: Print a descriptive information for the hiker.
        System.out.printf("Number of steps: %d", step);
        System.out.println();
        System.out.printf("Number of direction: %s", direction);
        System.out.println();
        System.out.printf("Result: %d valley(s) ", valley);

        return valley;

    }
}
