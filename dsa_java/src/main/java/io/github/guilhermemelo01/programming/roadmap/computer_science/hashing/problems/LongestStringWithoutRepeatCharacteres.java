package io.github.guilhermemelo01.programming.roadmap.computer_science.hashing.problems;

import java.util.HashMap;
import java.util.Map;

public class LongestStringWithoutRepeatCharacteres {
    public static void main(String[] args) {
        int output = logentsSubstring("pwwkew");
        System.out.println(output);
    }

    private static int logentsSubstring(String s){
        Map<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int start = 0;
        for(int end = 0; end < s.length(); end++){
            char charRight = s.charAt(end);
            if(map.containsKey(charRight)){
                start = Math.max(start, map.get(charRight) + 1);
            }
            map.put(charRight, end);
            maxLength = Math.max(maxLength, (end - start) + 1);
        }

        return maxLength;
    }
}
