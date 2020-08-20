package org.launchcode.java.studios.countingchar;
import java.util.HashMap;
import java.util.Map;

public class Counter {
    public static void main(String[] args){
        String myString = "In three words, I can sum up everything I've learned about life: it goes on.";
        char[] string = myString.toCharArray();

        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char character : string){
            if (charCount.containsKey(character)){
                charCount.put(character, charCount.get(character) + 1);
            } else {
                charCount.put(character, 1);
            }
        }
        for (Map.Entry<Character, Integer> charOccurrence : charCount.entrySet()){
            System.out.println(charOccurrence.getKey() + " : " + charOccurrence.getValue());
        }
    }
}
