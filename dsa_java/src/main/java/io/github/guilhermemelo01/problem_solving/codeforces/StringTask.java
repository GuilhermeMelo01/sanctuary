package io.github.guilhermemelo01.problem_solving.codeforces;

import java.util.Hashtable;
import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Hashtable<String, String> hashtable = new Hashtable<>() {{
            put("a", "a");
            put("o", "o");
            put("y", "y");
            put("e", "e");
            put("u", "u");
            put("i", "i");
        }};

        String input = in.next();
        StringBuffer sb = new StringBuffer();

        String[] split = input.split("");
        for (String s : split) {
            if (!hashtable.containsKey(s.toLowerCase())){
                sb.append(".").append(s.toLowerCase());
            }
        }
        System.out.println(sb);
    }
}
