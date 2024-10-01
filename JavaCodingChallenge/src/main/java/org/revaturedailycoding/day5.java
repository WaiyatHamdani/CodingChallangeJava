package org.revaturedailycoding;

import java.util.Scanner;

public class day5 {

        public static void main(String[] args)
        {
            Scanner s = new Scanner(System.in);
            //INPUT [uncomment & modify if required]
            int sampleInput = s.nextInt();
            String result ="" ;


            //write your Logic here:
            if(sampleInput%3 == 0){
                result = "Fizz";
            }
            else if(sampleInput%5 == 0){
                result ="Buzz";
            }
            //if(sampleInput%3 == 0 || sampleInput%5 == 0){
            else{
                result ="FizzBuzz";
            }

            System.out.println(result);

        }

}
