package org.arraychallange;

import java.util.Arrays;
import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int Find = target - nums[i];
            if (map.containsKey(Find)) {
                return new int[]{map.get(Find),i};
            }
            map.put(nums[i], i);
        }

        return null;
    }

    public static void main(String[] args) {
        int [] no1 = {3,3,6,7};
        System.out.println(Arrays.toString(twoSum(no1,9)));
    }
}