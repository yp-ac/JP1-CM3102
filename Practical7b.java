/*
 * Title: Program Implementing HashMap Class
 * Assignment No: 07 (b)
 *
 * Enrollment No: 2106206      Date: 31st Aug 2023
 * */
import java.util.HashMap;

public class Practical7b {
    public static void main(String[] args) {
        // Analyze the letters in a word
        HashMap<Character, Integer> letters = new HashMap<>();
        String word = "Honorificabilitudinitatibus"; // meaning: The state of being able to achieve honors

        for (char letter: word.toCharArray()) {
            if (letters.containsKey(letter)) {
                letters.replace(letter, letters.get(letter) + 1);
            } else {
                letters.put(letter, 1);
            }
        }
        
        System.out.println("letters: " + letters);
    }
}
