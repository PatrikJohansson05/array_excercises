package exercises;

import java.util.Arrays;

/**
 * 5. Create a two-dimensional string array [2][2]. Assign values to the 2d array containing any Country and City.
 * Expected output:
 * France Paris
 * Sweden Stockholm
 */
public class Exercise5 {
    public static void main(String[] args) {
        String[][] array = new String[2][2];
        array[0][0] = "France";
        array[0][1] = "Paris";
        array[1][0] = "Sweden";
        array[1][1] = "Stockholm";

        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}

