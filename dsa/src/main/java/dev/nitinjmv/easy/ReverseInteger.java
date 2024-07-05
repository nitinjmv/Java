package dev.nitinjmv.easy;

public class ReverseInteger {
    public static void main(String[] args) {
        int input = 12;
        int result = new ReverseInteger().reverseInteger(input);
        System.out.println(result);
    }

    private int reverseInteger(int input) {
        int result = 0;
        int lastDigit;

        while(input > 0){
            lastDigit = input % 10;
            result = result * 10 + lastDigit;
            input = input / 10;
        }
        return result;
    }
}
