package com.amos.arts.week1.day6;

import java.util.HashMap;

/**
 * 两数之和
 *
 *     Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 *     You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 *             Example:
 *
 *     Given nums = [2, 7, 11, 15], target = 9,
 *
 *     Because nums[0] + nums[1] = 2 + 7 = 9,
 *             return [0, 1].
 */
public class TwoSum {

    public static void main(String[] args) {

        int[] originNums = {1, 2, 3, 4, 5, 6, 7};
        int targetNum = 6;
        int[] sum = twoSumLoop(originNums, targetNum);
        if (sum != null) {
            for (int num : sum) {
                System.out.println(num);
            }
        } else {
            System.out.print("数组不能得到对应的两数之和: " + targetNum);
        }

        int[] sum2 = twoSumMap(originNums, targetNum);
        if (sum2 != null) {
            for (int num : sum2) {
                System.out.println(num);
            }
        } else {
            System.out.print("数组不能得到对应的两数之和: " + targetNum);
        }
    }

    public static int[] twoSumLoop(int[] nums, int target) {
        int length = nums.length;
        int[] result = new int[2];
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return null;
    }


    public static int[] twoSumMap(int[] nums, int target) {
        int length = nums.length;
        int[] result = new int[2];

        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < length; i++) {
            int diff = target - nums[i];
            if (hashMap.containsKey(diff)) {
                result[0] = hashMap.get(diff);
                result[1] = i;
                return result;
            }
            hashMap.put(nums[i], i);
        }
        return null;
    }

}
