package dev.nitinjmv.easy;


import java.util.List;

public class RemoveVowels {

    public static void main(String[] args) {
        String input = "elephant";
        String result = new RemoveVowels().removeVowels(input);
        System.out.println(result);
    }

    private String removeVowels(String input) {
        List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u');

        StringBuilder sb = new StringBuilder();

//         type#1
//        for (int i = 0; i < input.length(); i++) {
//            if (input.charAt(i) != 'a' && input.charAt(i) != 'e' && input.charAt(i) != 'i' && input.charAt(i) != 'o' && input.charAt(i) != 'u')
//              sb.append(input.charAt(i));
//        }

        for (int i = 0; i < input.length(); i++) {
            if (!vowels.contains(input.charAt(i)))
                sb.append(input.charAt(i));
        }

        return sb.toString();
    }

}
