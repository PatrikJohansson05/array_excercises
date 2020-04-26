package exercises;
/**
 * Create a program and create a method with name ‘indexOf’ which will find and return the index of an element in the array.
 * If the element doesn’t exist your method should return -1 as value.
 * Expected output: Index position of number 5 is: 2.
 */
public class Exercise2 {
    public static int indexOf (int[] array, int t){
        if (array == null) return -1;
        int length = array.length;
        int i = 0;
        while (i < length){
            if(array[i] == t) return i;
            else i=i+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {9, 12, 5, 34, 22};
        System.out.println("Index position of number 5 is: " + indexOf(array, 5));
    }
}

