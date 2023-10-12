 import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.text.html.parser.Element;

public interface HashMapMethod {
    public static void main(String[] args) {
        
        int[] arr = { 1, 1, 2, 3, 4, 2, 1, 5, 1, 2, 9};

        // Create a HashMap to store element frequencies
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Loop through the array and update the frequency map
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Display the frequency of each element
        for (HashMap.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Element " + entry.getKey() + " occurs " + entry.getValue() + " times.");
        }

        int maxFrequency = 0;
        int maxFrequentElement = 0;

        for(Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()){
            if(entry.getValue() > maxFrequency){
                maxFrequency = entry.getValue();
                maxFrequentElement = entry.getKey();

                System.out.println("Most frequent element is: "+maxFrequentElement+" with frequency "+maxFrequency);
            }
        }

        
    }
}
