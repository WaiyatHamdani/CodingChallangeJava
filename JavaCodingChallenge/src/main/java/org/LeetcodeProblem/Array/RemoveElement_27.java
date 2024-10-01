package org.LeetcodeProblem.Array;

import java.util.ArrayList;
import java.util.Arrays;

/*
Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores).
 */
public class RemoveElement_27 {

    // our solve problem return array instead
    public static int[] removeElement(int[] nums, int val){
        ArrayList<Integer> temp = new ArrayList<>();

        for(int x: nums){
            if(x!=val){
                temp.add(x);
            }
        }

        int[] result = new int[temp.size()];
        for(int i = 0; i< temp.size(); i++){
            result[i]= temp.get(i);
        }

        return result;
        //return new int[]{};
    }


    // for leet code test case , cause it return int we going to make it return array in the top
    public static int removeElement1(int[] nums, int val){
        int result = 0;
        for (int i =0; i < nums.length; i++){
            if(nums[i] != val){
                nums[result] = nums[i];
                result++;
            }
        }
        return result;
    }


    public static void main(String[] args){
        int[] nums = new int[]{3,2,2,3};
        int target = 3;
        System.out.println("this ide solution return array----------------------");
        System.out.println(Arrays.toString(removeElement(nums,target)));

        System.out.println("----------------leetcode solution-------------------");
        System.out.println(removeElement1(nums,target));
    }
}
