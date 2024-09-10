
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;



public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        
        String text = "qwertyuioasdfghjklzxcvbnm";
        String[] parts = new String[text.length()];
        
        for (int i = 0; i < text.length(); i++){
            parts[i] = String.valueOf(text.charAt(i));
        }
        
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 6; i++){
            numbers.add(rand.nextInt());
        }
        
        ArrayList<String> input = new ArrayList<>();
        
        for (int i = 0; i < 6; i++){
            input.add(String.valueOf(rand.nextInt()));
        }
        
        sort(array);
        System.out.println("Int array: " + Arrays.toString(array));
        
        sort(parts);
        System.out.println("String array: " + Arrays.toString(parts));
        
        sortIntegers(numbers);
        System.out.println("Integer arrays: " + numbers.toString());
        
        sortStrings(input);
        System.out.println("String arrays: " + input.toString());
    }
    
    public static void sort(int[] array){
        Arrays.sort(array);
    }
    
    public static void sort(String[] array){
        Arrays.sort(array);
    }
    
    public static void sortIntegers(ArrayList<Integer> integers){
        Collections.sort(integers);
    }
    
    public static void sortStrings(ArrayList<String> strings){
        Collections.sort(strings);
    }
}
