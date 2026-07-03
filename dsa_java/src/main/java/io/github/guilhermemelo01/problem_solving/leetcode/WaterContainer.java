package io.github.guilhermemelo01.problem_solving.leetcode;

public class WaterContainer {

    public static void main(String[] args) {
        int i = maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
        System.out.println(i);
    }
    public static int maxArea(int[] height) {
        int maxValue = 0;

        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j <= height.length - 1; j++) {
                int lessValue = Math.min(height[i], height[j]);
                int distanceBetween = (Math.max(i, j) - Math.min(i, j));
                int actualValue = lessValue * distanceBetween;
                if (maxValue < actualValue) {
                    maxValue = actualValue;
                }
            }
        }

        return maxValue;
    }

}
