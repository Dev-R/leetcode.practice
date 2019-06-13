package leetcode.devr;

import java.util.*;

/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */
public class TwoSum {
    public static int[] solutionWithBrutalForce (int[] nums, int target) {
        int length = nums.length;
        for (int pivot=0; pivot < length-1; pivot++) {
            for (int inner=pivot+1; inner<length; inner++){
                if (nums[pivot] + nums[inner] == target){
                    int[] answer = {pivot, inner};
                    return answer;
                }
            }
        }
        return null;
    }

    public Map<Integer, Integer> intArrayToHashMap(int[] nums) {
        Map<Integer, Integer> integerMap = new HashMap<>();
        int length = nums.length;
        for (int i=0; i < length; i++) {
            integerMap.put(nums[i], i);
        }

        return integerMap;
    }

    public int[] solutionWithHashMap(int[] nums, int target) {
        final Map<Integer, Integer> complementMap = intArrayToHashMap(nums);
        final int length = nums.length;

        for (int i=0; i<length; i++) {
            int num = nums[i];
            int complement = target - num;
            Integer complementIdx = complementMap.get(complement);
            if (complementIdx!=null && !complementIdx.equals(i))
                return new int[] {i, complementIdx};
        }

        return null;
    }

    public int[] solutionWithHashMapImprovement (int[] nums, int target) {
        final Map<Integer, Integer> complementMap = new HashMap<>();
        final int length = nums.length;

        for (int i=0; i<length; i++) {
            int num = nums[i];
            int complement = target - num;
            Integer complementIdx = complementMap.get(complement);
            if (complementIdx != null) {
                return new int[]{complementIdx, i};
            }
            complementMap.put(num, i);
        }
        return null;
    }
}
