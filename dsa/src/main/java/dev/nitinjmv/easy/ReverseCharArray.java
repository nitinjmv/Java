package dev.nitinjmv.easy;

public class ReverseCharArray {
    public static void main(String[] args) {
        char []s = {'h', 'e', 'l', 'l', 'o'};
        new ReverseCharArray().reverseString(s);
    }

    public void reverseString(char[] s) {
        for(int i = 0; i < s.length / 2; i++){
            char temp;
            temp = s[i];
            s[i] = s[s.length - (i + 1)];
            s[s.length - (i + 1)] = temp;
        }
        System.out.println(s);
    }
}
