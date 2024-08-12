package dev.jmv.enm;

import java.util.EnumMap;

// Like a constant
enum G7 {
    JAPAN, USA, GERMANY, UK, FRANCE, ITALY, CANADA

}

public class EnumTest {
    public static void main(String[] args) {

        // Loop through the enum elements
        for(G7 c: G7.values())
            System.out.println(c);


        // Switch/Case
        G7 country = G7.JAPAN;

        switch (country) {
            case JAPAN:
                System.out.println("Chosen " + country);
                break;
            case UK:
                System.out.println("Chosen " + country);
                break;
            case USA:
                System.out.println("Chosen " + country);
                break;
            case ITALY:
                System.out.println("Chosen " + country);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + country);
        }
    }
}
