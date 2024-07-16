package org.codechallange;
import java.util.HashSet;
import java.util.Scanner;
/*
*You are given an array having N elements and an integer K.
You have to write a program to find the smallest number greater than K which is not present in the given array
 Example If the array is a = [ 2, 5, 7, 9, 21, 34] and k = 20 The output will be 22 22 will be the smallest number greater than K-20 which is not present in the given array.
 Function Description In the provided code snippet, implement the provided notInArray(... method using the variables to print the smallest number greater than K which is not present in the given array. You can write your code in the space below the phrase "WRITE YOUR LOGIC HERE"
 There will be multiple test cases running so the Input and Output should match exactly as provided The base Output variable result is set to a default value of -404 which can be modified Additionally, you can add or remove these output variables
 Input Format The code provided handles the input and stores them in variables for you. The first line contains an integer N denoting the size of the array The next N lines contain elements of array A The next line contains an integer K.
 Sample Input - denotes N - denotes elements of Array N 4 S 2 7 P - denotes K Constraints I-Nc=105 A[i] < 105 c=KS= 105
 Output Format The output contains an integer denoting the smallest number greater than K which is not present in the given array
 Sample Output 6 Explanation The array is [1,4,5,2,7] and K=4 The smallest element which is greater than K - 4 and not present in the array is 6. Hence the output is 6.
* */
public class NotInArray {
    public static int notInArray(int[] array, int K) {
        int smallestNumber = K + 1;
        HashSet<Integer> set = new HashSet<>();
        for (int num : array) {
            set.add(num);
        }

        while (set.contains(smallestNumber)) {
            smallestNumber++;
        }

        return smallestNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        int K = scanner.nextInt();

        int result = notInArray(array, K);
        System.out.println(result);
    }
}
