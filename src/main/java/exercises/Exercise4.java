package exercises;

import java.util.Arrays;

/**
 * 4. Write a program which will copy the elements of one array into another array.
 * Expected output: Elements from first array: 1 15 20
 * Elements from second array: 1 15 20
 */
public class Exercise4 {
    public static void main(String[] args) {
        int[] array1 = {1, 15, 20};
        int[] array2 = Arrays.copyOf(array1, array1.length);

        System.out.println("Elements from first array:");
        for (int number1 : array1){
            System.out.println(number1);
        }
        System.out.println("Elements from second array:");
        for (int number2 : array2) {
            System.out.println(number2);
        }
    }
}
