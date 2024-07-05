package dev.nitinjmv.easy;

import java.io.CharArrayReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Pangram {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        boolean result = new Pangram().checkIfPangram(input);
        System.out.println(result);
    }

    public boolean checkIfPangram(String sentence) {
        char []alphabets = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        List<Character> list = new ArrayList<>();
        for(Character c: alphabets)
            list.add(c);

        for(Character c: sentence.toCharArray())
            list.remove(c);

        return list.isEmpty();
    }
}
