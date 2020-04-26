package exercises;

import java.util.Arrays;

/**
 * 8. Write a program which will remove the duplicate elements of a given array [20, 20, 40, 20, 30, 40, 50, 60, 50].
 * Expected output:
 * Array: 20 20 40 20 30 40 50 60 50
 * Array without duplicate values: 20 40 30 50 60
 */
public class Exercise8 {
    public static int removeDuplicate(int array[], int n){
        if (n==0 || n==1){
            return n;
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i=0; i<n-1; i++){
            if (array[i] != array[i+1]){
                temp[j++] = array[i];
            }
        }
        temp[j++] = array[n-1];
        for (int i=0; i<j; i++){
            array[i] = temp[i];
        }
        return j;
    }
    public static void main(String[] args) {
        int[] array = {20, 20, 40, 20, 30, 40, 50, 60, 50};
        System.out.println("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        Arrays.sort(array); // kinda sorts but not really?
        int length = array.length;
        length = removeDuplicate(array, length);
        System.out.println("Array without duplicate values:");
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]); // removes only duplicate 20's, but there's still other duplicates?
        }


    }
}
