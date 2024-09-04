package org.revaturedailycoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args){
        List<Integer> mynumber = new ArrayList<>();
        mynumber.add(1);
        mynumber.add(2);
        mynumber.add(3);

        Integer[] num = mynumber.toArray(new Integer[0]);
        System.out.println(Arrays.toString(num));

    }

}
