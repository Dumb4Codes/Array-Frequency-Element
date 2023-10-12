import java.util.HashMap;
import java.util.Map;

public class ArrayFrequencyInString {
    public static void main(String[] args) {
        
        String inputString = "Hello, World!";
        
        // Create a HashMap to store character frequencies
        Map<Character, Integer> charFrequencyMap = new HashMap<>();
        
        // Convert the input string to lowercase (if needed)
        inputString = inputString.toLowerCase();
        
        // Loop through the characters in the string
        for (char c : inputString.toCharArray()) {
            // Ignore non-alphabetic characters or spaces
            if (Character.isLetter(c) || Character.isDigit(c)) {
                // Increment the character's frequency in the map
                charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c, 0) + 1);
            }
        }
        
        // Display the character frequencies
        for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
            System.out.println("Character '" + entry.getKey() + "' occurs " + entry.getValue() + " times.");
        }

        char mostFrequentChar = ' ';
        int maxFrequency = 0;
        for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mostFrequentChar = entry.getKey();
            }
        }
        System.out.println("Most frequent character: '" + mostFrequentChar + "' (Frequency: " + maxFrequency + ")");
    }
    
}