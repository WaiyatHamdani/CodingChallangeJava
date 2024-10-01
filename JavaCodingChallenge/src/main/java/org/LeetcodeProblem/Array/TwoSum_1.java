package org.LeetcodeProblem.Array;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */


import java.util.Arrays;

public class TwoSum_1 {
    public static int[] twosum(int[] nums , int target){
        int j = 1;
        for(int i = 0 ; i < nums.length; i++){
            if(nums[i]+nums[j] == target){
                return new int[]{i,j};
            }
            j++;
        }
        return new int[]{};
    }

    public static void main(String[] args){
        int[] array1 = new int[]{2,7,11,15};
        int target1 = 9;
        System.out.println(Arrays.toString(twosum(array1, target1)));


        int [] array2 = new int[]{3,2,4};
        int target2 = 6;
        System.out.println(Arrays.toString(twosum(array2,target2)));
    }
}
