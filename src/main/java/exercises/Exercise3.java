package exercises;
import java.util.Arrays;

/**
 * 3. Write a program which will sort string array.
 * Expected output: String array: [Paris, London, New York, Stockholm]
 * Sort string array: [London, New York, Paris, Stockholm]
 */

public class Exercise3 {
    public static void main(String[] args) {
        String[] capitals = {
                "Paris", "London", "New York", "Stockholm"};
        System.out.println("String array:");
        for (int i=0; i<capitals.length; i++){
            System.out.println(capitals[i]);
        }
        System.out.println("Sort String array:");

       Arrays.sort(capitals);

        for(String sorted_capitals: capitals) {
            System.out.println(sorted_capitals);
        }
    }
}
