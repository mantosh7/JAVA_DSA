package JAVA_DSA.BASIC;

import java.util.*;

public class Input {
    public static void main(String[] args) {
        // taking integer as input
        System.out.print("Enter any number:");
        Scanner num = new Scanner(System.in);
        num.nextInt();

        // taking 1 word as input
        System.out.print("Enter any word:");
        Scanner word = new Scanner(System.in);
        word.next();

        // taking sentence as input
        System.out.print("Enter any sentence:");
        Scanner sentence = new Scanner(System.in);
        sentence.nextLine();
    }
}
