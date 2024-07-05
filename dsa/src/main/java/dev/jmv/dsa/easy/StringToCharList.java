package dev.jmv.dsa.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringToCharList {
    
    public static void main(String[] args) {
        String s = "somestring";
        List<Character> chars = new ArrayList<>();
        //#1
        for (char c : s.toCharArray())
            chars.add(c);
        System.out.println(chars);

        //#2
        chars = s.codePoints().mapToObj(c -> (char) c).collect(Collectors.toList());
        System.out.println(chars);

        //#3
        chars = s.chars().mapToObj(c -> (char) c).toList();
        System.out.println(chars);

    }
}
