package org.LeetcodeProblem.Array;

import java.util.Arrays;

/*
Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4

* */
public class SearchInsertPosition_35 {
    // same as binary search
    public int searchElement(int[] nums , int target){
        int left = 0;
        int right= nums.length - 1; // because array start with 0

        while(left <= right){
            int mid = left+(right-left)/2;
            if(nums[mid] == target){
                return mid;
            }else if(target > nums[mid]){
                left = mid+1;
            }else{
                right = mid -1;
            }
        }
        return left;
    }


    public static void main(String[] args){
        int[] nums = new int[]{1,3,5,6};
        int target = 5;

        SearchInsertPosition_35 searchInsertPosition35 = new SearchInsertPosition_35();
        System.out.println(searchInsertPosition35.searchElement(nums,target));
    }
}
