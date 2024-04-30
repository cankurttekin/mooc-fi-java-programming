
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        
        //System.out.println("Smallest: " + MainProgram.smallest(array));
        //System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(array));
        //System.out.println(MainProgram.indexOfSmallestFrom(array, 2));
        sort(array);
    }
    
    public static int smallest(int[] arr) {
            int smol = arr[0];
            
            for(int i = 0; i < arr.length; i++) {
                if (smol > arr[i]) {
                    smol = arr[i];
                }
            }
            return smol;
    }
    
    public static int indexOfSmallest(int[] arr) {
        int smol = smallest(arr);
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == smol) {
                return i;
            }
            i++;
        }
        return -1;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int[] subArr = Arrays.copyOfRange(table, startIndex, table.length);
        //System.out.println("SubArray " + Arrays.toString(subArr));
        return startIndex + indexOfSmallest(subArr);
    
    }

    
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
    public static void sort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(i + ". Sorting: " + Arrays.toString(array));
            
            swap(array, i, indexOfSmallestFrom(array, i) );
        }
    }
}
