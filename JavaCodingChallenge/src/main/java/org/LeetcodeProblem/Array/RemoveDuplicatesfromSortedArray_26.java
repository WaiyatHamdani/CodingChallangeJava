package org.LeetcodeProblem.Array;

/*
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
Example 1:
Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).

Example 2:
Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).

*/

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray_26 {
    public static int[] removeDuplicate(int[] nums){
        ArrayList<Integer> newList = new ArrayList<>();
        for(int x: nums){
            if(!newList.contains(x)){
                newList.add(x);
            }
        }

        int[] result = new int[newList.size()];
        for (int i =0 ; i< newList.size(); i++){
            result[i] = newList.get(i);
        }

        return result;
    }


    // for leetcode ide since they cannot take wrapper obj we need to make it all primitive solution
    public static int[] removeDuplicate1(int[] nums){
        //leetcode cannot have wrapper obj mix with primitive . so this solution stay with primitive
        int pointerArrayElement = 1; // start this as one because it will move along with i
        for(int i = 1; i < nums.length; i++){
            if(nums[i]!=nums[i-1]){
                nums[pointerArrayElement] = nums[i];
                pointerArrayElement++;
            }
        }

        int[] result = new int[pointerArrayElement];
        for (int i = 0; i < pointerArrayElement; i++) {
            result[i] = nums[i];
        }

        return result;
    }

    public static void main(String[] args){
        int[] nums1 = new int[]{1,1,2};
        System.out.println(Arrays.toString(removeDuplicate(nums1)));
        System.out.println(Arrays.toString(removeDuplicate1(nums1)));
    }
}
