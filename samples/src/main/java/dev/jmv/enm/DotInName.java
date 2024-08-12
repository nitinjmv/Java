package dev.jmv.enm;

import static dev.jmv.enm.Phone.IPHONE;

enum Phone {
    IPHONE(232.32);
    final double weight;
    Phone(double weight) {
        this.weight = weight;
    }
}

public class DotInName {
    public static void main(String[] args) {
        System.out.println(IPHONE);
    }
}
