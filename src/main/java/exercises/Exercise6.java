package exercises;

/**
 *6. Write a program which will set up an array to hold the next values in this
 * order: 43, 5, 23, 17, 2, 14 and print the average of these 6 numbers.
 * Expected output: Average is: 17.3
 */
public class Exercise6 {
    public static void main(String[] args) {
        double[] array = {43, 5, 23, 17, 2, 14};
        double total = 0;

        for (int i = 0; i < array.length; i++) {
            total = total + array[i];
        }

        double average = total / array.length;
        System.out.format("The average is: %.1f", average);
    }
}
