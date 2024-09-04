package org.revaturedailycoding;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class day2 {
    public class Main
    {
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);

            int sampleInput;
            int number;
            int result;
            sampleInput = sc.nextInt();

            //write your Logic here
            if(sampleInput <2){
                System.out.println("we need more sample input ");
            }

            Integer[] arr = new Integer [sampleInput];
            for(int i =0; i< sampleInput ; i++){
                number = sc.nextInt();
                arr[i]= number;
            }
            result = (arr[0]+arr[1]+arr[2]) /3;


            //OUTPUT [uncomment & modify if required]
            System.out.println(result);

        }
    }
}
