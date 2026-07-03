package io.github.guilhermemelo01.problem_solving.leetcode;

import java.util.*;

public class MaxSubArray {
    public static void main(String[] args) {
        long l = maxSubarraySum(new int[]{-1, -2, -3, -4, -5}, 4);
        System.out.println(l);
    }

    public static long maxSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                boolean divisible = ((j+1) - (i+1)) % k == 0;
                if (divisible) {
                    int x = i;
                    int auxValue = 0;
                    while (x < j) {
                        auxValue += nums[x];
                        x++;
                    }
                    if (map.containsKey(j)) {
                        Integer val = map.get(j);
                        if (auxValue > val) {
                            map.put(j, auxValue);
                        }
                    } else {
                        map.put(j, auxValue);
                    }
                }
            }
        }

        List<Integer> mapValues = new ArrayList(map.values());

        return Collections.max(mapValues);
    }
}
