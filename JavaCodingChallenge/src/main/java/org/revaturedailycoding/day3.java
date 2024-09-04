package org.revaturedailycoding;

import java.util.Scanner;

public class day3 {
    public static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the size of the array
        int n = scanner.nextInt();
        int[] array = new int[n];

        // Reading the elements of the array
        int sum = 0;
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            sum += array[i];
        }

        // Calculate factorial of the size of the array
        int factorialOfN = factorial(n);

        // Check if the sum of the array equals the factorial of its size
        if (sum == factorialOfN) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
