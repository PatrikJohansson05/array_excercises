package exercises;
/**
 * 1. Write a program which will store elements in an array of type ‘int’ and print it out.
 * Expected output: 11 23 39 etc.
 */

public class Exercise1 {
    public static void main(String[] args) {
        int[] array = {11, 23, 39};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
