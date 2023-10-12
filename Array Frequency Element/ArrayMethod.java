 import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.text.html.parser.Element;

public interface ArrayMethod {
    public static void main(String[] args) {
        
        int[] arr = { 1, 1, 2, 3, 4, 2, 1, 5, 1, 2, 9};

        int maxElement = 100;
        int[] frequencyArray = new int[maxElement+1];

        for(int num : arr){
            frequencyArray[num]++;
        }

        for(int i=0; i<frequencyArray.length-1; i++){
            if(frequencyArray[i] > 0){
            System.out.println("Element "+i+" occurs "+frequencyArray[i]+" times.");
            }
        }

        int maxFrequency = 0;
        int maxFrequentElement = 0;

        for(int i=0; i<frequencyArray.length-1; i++){
            if(frequencyArray[i] > maxFrequency){
                maxFrequency = frequencyArray[i];
                maxFrequentElement = i;
            }
        }

        int minFrequency = Integer.MAX_VALUE;
        int minFrequentElement = 0;

        for(int i=0; i<frequencyArray.length-1; i++){
            if(frequencyArray[i] > 0 && frequencyArray[i] < minFrequency){
                minFrequency = frequencyArray[i];
                minFrequentElement = i;
            }
        }

        System.out.println("Most frequent element is: "+maxFrequentElement+" with frequency "+maxFrequency);

        System.out.println("Least frequent element is: "+minFrequentElement+" with frequency "+minFrequency);
        

    }
}
