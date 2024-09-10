
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        //MainProgram.sort(numbers);
        
        for (int i = 0; i < numbers.length; i++){
            for (int j = i + 1; j < numbers.length; j++){
                if (numbers[i] > numbers[j]){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
        
        
    }
    
    public static int smallest(int[] array){
        if (array == null || array.length == 0){
            return Integer.MIN_VALUE;
        }
        
        int smallestElement = array[0];
        for (int el : array){
            if (el < smallestElement){
                smallestElement = el;
            }
        }
        return smallestElement;
    }
    
    public static int indexOfSmallest(int[] array){
        if (array == null || array.length == 0){
            return Integer.MIN_VALUE;
        }
        
        int smallestIndex = 0;
        for (int i = 1; i < array.length; i++){
            if (array[i] < array[smallestIndex]){
                smallestIndex = i;
            }
        }        
        return smallestIndex;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {        
        if (table == null || table.length == 0){
            return Integer.MIN_VALUE;
        }
        
        int smallestIndex = startIndex;
        for (int i = startIndex + 1; i < table.length; i++){
            if (table[i] < table[smallestIndex]){
                smallestIndex = i;
            }
        }        
        return smallestIndex;
    }
    
    public static void swap(int[] array, int index1, int index2) {        
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
    public static void sort(int[] array) {
        int smallestIndexFrom;
        for (int i = 0; i < array.length; i++){
            smallestIndexFrom = indexOfSmallestFrom(array, i);
            swap(array, smallestIndexFrom, i);
            System.out.println(Arrays.toString(array));
        }
    }
}
