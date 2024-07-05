package dev.jmv.dsa.easy;

public class ReverseWords {
    public static void main(String[] args) {
        String input = "This is the new world";
        String result = new ReverseWords().reverseWords(input);
        System.out.println(result);
    }

    private String reverseWords(String input) {
        StringBuilder sb = new StringBuilder();
        String []words = input.split(" ");
        for(int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
