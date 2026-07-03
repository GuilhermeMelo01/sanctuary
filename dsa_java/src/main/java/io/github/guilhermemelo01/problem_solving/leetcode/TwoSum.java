package io.github.guilhermemelo01.problem_solving.leetcode;

public class TwoSum {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] ints = twoSum.twoSum(new int[]{3, 2, 4}, 6);

    }
    public int[] twoSum(int[] nums, int target) {
        // Ordenate the array non-decresing order;
        // create two variable left and right => left = 0; right = size;
        // percurre the array => if < target = left++; if > target = right--; if == target return;
        nums = insertionSort(nums);
        int left = 0, right = nums.length-1;

        while(left < right){
            int sum = nums[left] + nums[right];
            if(sum == target){
                return new int[]{left, right};
            }else if(sum <= target){
                left++;
            }else{
                right--;
            }
        }

        return new int[2];
    }

    public static int[] insertionSort(int[] array){
        for(int i = 1; i < array.length; i++){
            int chave = array[i];
            int j = i - 1;
            while(j >= 0 && array[j] > chave){
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = chave;
        }
        return array;
    }
}
