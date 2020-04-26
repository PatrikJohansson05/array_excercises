package exercises;

/**
 * 7. Write a program which will set up an array to hold 10 numbers and print out only the uneven numbers.
 * Expected output:
 * Array: 1 2 4 7 9 12
 * Odd Array: 1 7 9
 */
public class Exercise7 {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 7, 9, 12};

        System.out.println("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("Odd Array:");
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 != 0){
                System.out.println(array[i]);
            }
        }
    }
}
