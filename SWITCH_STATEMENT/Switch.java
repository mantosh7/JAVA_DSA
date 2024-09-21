package JAVA_DSA.SWITCH_STATEMENT;

import java.util.*;

public class Switch {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter a fruit:");
        String fruit = s1.next();

        switch (fruit) {
            case "mango":
                System.out.println("king of fruits");
                break;

            case "apple":
                System.out.println("keeps the doctor away");
                break;

            case "grapes":
                System.out.println("bunch of grapes");
                break;

            case "watermelon":
                System.out.println("when its too hot");
                break;

            default:
                System.out.println("please enter a valid fruit name");
        }
    }
}
