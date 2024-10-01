package org.revaturedailycoding;

import java.util.Scanner;

public class day7 {

        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);

            int sampleInput;
            int result;
            sampleInput = sc.nextInt();
            int[] ue = new int[sampleInput];

            //write your logic here
            int prodEven = 1;
            int prodOdd = 1;

            for (int i = 0; i < sampleInput; i++) {
                ue[i] = sc.nextInt();
            }

            for (int x : ue) {
                if (x % 2 == 0) {
                    prodEven *= x;
                } else {
                    prodOdd *= x;
                }
            }

            result = prodEven - prodOdd;

            //OUTPUT (uncomment & modify if required)
            System.out.println(result);
        }

}
