package dev.jmv.dsa.easy;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(new Anagram().isAnagram(s, t));
    }

    //312 ms
//    public boolean isAnagram(String s, String t) {
//        if (s.length() != t.length())
//            return false;
//
//        List<Character> chars = s.codePoints().mapToObj(c -> (char)c).collect(Collectors.toList());
//        for(Character c: t.toCharArray()){
//            chars.remove(c);
//        }
//        return chars.isEmpty();
//    }

    // 3ms
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        char []s1 = s.toCharArray();
        char []s2 = t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);
        return Arrays.equals(s1, s2);
    }


}
