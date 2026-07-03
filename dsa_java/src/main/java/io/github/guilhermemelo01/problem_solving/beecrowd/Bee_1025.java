package io.github.guilhermemelo01.problem_solving.beecrowd;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bee_1025 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int count = 1;

        while (true) {
            String nq = in.nextLine();
            if (nq.equals("0 0")) {
                break;
            }

            String[] values = nq.split(" ");
            int n = Integer.parseInt(values[0]);
            int q = Integer.parseInt(values[1]);
            Map<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                map.put(in.nextInt(), i + 1);
            }

            sb.append("CASE# ").append(count).append(":\n");
            for (int i = 0; i < q; i++) {
                int value = in.nextInt();
                Integer position = map.get(value);
                if (position != null) {
                    sb.append(value).append(" found at ").append(position).append("\n");
                } else {
                    sb.append(value).append(" not found\n");
                }
            }

            count++;
            in.nextLine();
        }

        System.out.println(sb);
    }
}
