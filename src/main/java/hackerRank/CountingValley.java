package hackerRank;

public class CountingValley {

    /* The goal is to count the number of valleys a hiker goes though: */

     /*                 PseudoCode

     * -> Initialize the seaLevel to default (0)
     * -> Initialize the valley to (0)
     * -> Then,increment motion toward the hike direction
     * -> If the direction at motion is equals U, incrementing the seaLevel
     * -> Else, If the direction at motion is equals D decrement the seaLevel, if the seaLevel is at 0, then incrementing the valley.
     * -> Print the journey information of the hiker
     * -> return the valley.
*/

    //    TODO: Create counting valley method

    public int countingValley(String direction, int step) {
        int seaLevel = 0;
        int valley = 0;

        for (int motion = 0; motion < direction.length(); motion++){
            if (direction.charAt(motion) == 'U'){
                seaLevel ++;
            }
            else{
                if (direction.charAt(motion) == 'D'){
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
