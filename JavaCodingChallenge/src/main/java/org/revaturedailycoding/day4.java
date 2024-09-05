package org.revaturedailycoding;

import java.util.HashMap;
import java.util.Scanner;

public class day4 {

        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);

            String sampleInput;

            sampleInput = sc.nextLine();
            int number;
            //write your Logic here
            HashMap<String, Integer> result = new HashMap<>();
            String[] words = sampleInput.split(" ");

            for(String i : words){
                if(result.containsKey(i)){
                    number = result.get(i);
                    result.replace(i,number,(number+1));
                }else{
                    number = 1;
                    result.put(i,number);
                }

            }


            //OUTPUT [uncomment & modify if required]
            System.out.println(result);

        }
    }

