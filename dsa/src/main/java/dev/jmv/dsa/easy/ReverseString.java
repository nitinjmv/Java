package dev.jmv.dsa.easy;

public class ReverseString {
    public static void main(String[] args) {
        String input = "nitinjmv";
        String result = new ReverseString().reverseString(input);
        System.out.println(result);
    }

    private String reverseString(String input) {
        StringBuilder sb = new StringBuilder();
        for(int i = input.length() -1; i >= 0; i--)
            sb.append(input.charAt(i));
        return sb.toString();
    }
}
