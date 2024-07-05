package dev.nitinjmv.easy;

import java.util.Arrays;

public class LCP {
    public static void main(String[] args) {
        String[] words = {"flight", "flower", "fleet"};
        //System.out.println(lcp(words));
        System.out.println(longestCommonPrefix(words));
    }

    private static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int loopLength = Math.min(strs[0].length(), strs[strs.length - 1].length());
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < loopLength; i++) {
            if (strs[0].charAt(i) != strs[strs.length - 1].charAt(i))
                break;
            result.append(strs[0].charAt(i));
        }
        return result.toString();
    }

    private static String lcp(String[] words) {
        int smallestWordLen = Integer.MAX_VALUE;

        for (String word : words) {
            if (word.length() < smallestWordLen) {
                smallestWordLen = word.length();
            }
        }
        if (smallestWordLen <= 0) return "";

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < smallestWordLen; j++) {
                System.out.print(words[i].charAt(j));
            }
        }
        return "";
    }
}
