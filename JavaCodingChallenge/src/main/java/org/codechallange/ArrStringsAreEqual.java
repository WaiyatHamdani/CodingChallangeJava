package org.codechallange;

/*
*Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise
 A string is represented by an array if the array elements concatenated in order forms the string.
Function Description In the provided code snippet, implement the provided arraystringsAreEqual(... ) method using the variables to print the result that signifies whether the concatenated strings are equal or not. You can write your code in the space below the phrase "WRITE YOUR LOGIC HERE"
 There will be multiple test cases running so the input and Output should match exactly as provided The base output variable result is set to a default value of false which can be modified Additionally, you can add or remove these output variables
 Input Format The first line contains a String array word1 The second line contains a String array word2
 Sample Input ab "c" -- denotes wordi a" "bc" -- denotes wơrd2
 Output Format The output contains an integer value 1 or 0 denoting whether the concatenated arrays are equal or not
 Sample Output
Explanation
word1 represents string "ab' word2 represents string "a" The strings are the same, So
 "c" abc "bc" abc" V return true
* */

public class ArrStringsAreEqual {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (String word : word1) {
            sb1.append(word);
        }

        for (String word : word2) {
            sb2.append(word);
        }
        return sb1.toString().equals(sb2.toString());
    }

    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};

        boolean result = arrayStringsAreEqual(word1, word2);
        System.out.println(result ? true : false);
    }
}
