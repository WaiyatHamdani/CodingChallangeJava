package org.MappingChallange;

import java.util.HashMap;
import java.util.Map;

public class AlphaToNumCode {
    public static String AlphaToNum(String s) {
        Map<Character, String> code =  new HashMap<>();
        code.put('A',"01");
        code.put('B',"02");
        code.put('C',"03");
        code.put('D',"04");
        code.put('E',"05");
        code.put('F',"06");
        code.put('G',"07");
        code.put('H',"08");
        code.put('I',"09");
        code.put('J',"10");
        code.put('K',"11");
        code.put('L',"12");
        code.put('M',"13");
        code.put('N',"14");
        code.put('O',"15");
        code.put('P',"16");
        code.put('Q',"17");
        code.put('R',"18");
        code.put('S',"19");
        code.put('T',"20");
        code.put('U',"21");
        code.put('V',"22");
        code.put('W',"23");
        code.put('X',"24");
        code.put('Y',"25");
        code.put('Z',"26");
        String modified = s.toUpperCase();
        char[] str =  modified.toCharArray();
        StringBuilder num = new StringBuilder();

        for (char i : str) {
            num.append(code.get(i));
        }
        return num.toString();
    }


    public static void main(String[] args) {
        System.out.println(AlphaToNum("abcd"));
        System.out.println(AlphaToNum("waiyat"));
    }

}
