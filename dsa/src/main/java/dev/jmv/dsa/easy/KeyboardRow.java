package dev.jmv.dsa.easy;

import java.util.List;
import java.util.Stack;

public class KeyboardRow {

    public static void main(String[] args) {
        String[] words = {"dad"};

        String[] r = new KeyboardRow().findWords(words);
        System.out.println(r);
    }

    public String[] findWords(String[] words) {
        String rowOne = "qwertyuiop";
        String rowTwo = "asdfghjkl";
        String rowThree = "zxcvbnm";

        for (String word : words) {
            char[] ch = word.toCharArray();
            for (int i = 0; i < ch.length; i++) {
                if (rowOne.indexOf(ch[i]) != -1) {

                }

            }
        }


        return new String[]{};
    }

}
