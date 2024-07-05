package dev.jmv.dsa.easy;

public class PalindromeString {
    public static void main(String[] args) {
        String input = "abcnooncba";
        boolean result = new PalindromeString().palindromeString(input);
        System.out.println(result);
    }

    private boolean palindromeString(String input) {
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) != input.charAt(input.length() - (i +1)))
                return false;
        }
        return true;
    }
}
