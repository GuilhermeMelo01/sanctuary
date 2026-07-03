package io.github.guilhermemelo01.programming.roadmap.computer_science.hashing.problems;

import java.util.Set;

public class RemoveVowels {

    public static void main(String[] args) {
        // Q. Given a String, remove the vowels from the string and return the string without vowels.
        // The string will contains lowercase letters.

        // Input: "what is your name?"
        // Output: "wht s yr nm?"

        String s = remove("what is your name?");
        System.out.println(s);
    }

    public static String remove(String s) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        StringBuilder sb = new StringBuilder();

        char[] charArray = s.toCharArray();
        for(char c: charArray){
            if(!vowels.contains(c)){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
