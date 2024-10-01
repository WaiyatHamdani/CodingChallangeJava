package org.LeetcodeProblem.Array;

import java.util.Arrays;

public class MergeSortedArray_88 {
    public void merge(int[] nums1 , int m , int[] nums2, int n ){
        int[] mergearr = new int[m+n];

        for(int i = 0; i < m; i++){
            mergearr[i] = nums1[i];
        }

        for (int i = 0; i< n; i++){
            mergearr[m+i] = nums2[i];
        }
        Arrays.sort(mergearr);

        for(int i = 0; i<m+n; i++){
            nums1[i] = mergearr[i];
        }
    }

    public static void main(String[] args) {
        MergeSortedArray_88 sol = new MergeSortedArray_88();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        sol.merge(nums1, m, nums2, n);

        // Print the merged nums1 array
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }

}
