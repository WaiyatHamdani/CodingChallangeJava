package org.StackChallange;

public class pharenteshes {

    public static boolean ismatch(String s) {
        int head = 0;
        int tail = s.length() - 1;
        while (head < tail) {
            // we going from left and right meet in the middle
            char l = s.charAt(head);
            char r = s.charAt(tail);

            if (l == '(' && r == ')' || l == '[' && r == ']' || l == '{' && r == '}') {
                head++;
                tail--;
            } else {
                return false; 
            }
        }
        return true;
    }
}
