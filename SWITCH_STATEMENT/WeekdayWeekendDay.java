package JAVA_DSA.SWITCH_STATEMENT;

import java.util.*;

public class WeekdayWeekendDay {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter day no.:");
        int day = s1.nextInt();

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;

            case 6:
            case 7:
                System.out.println("Weekend");
                break;

            default:
                System.out.println("please enter a valid day number");
        }
    }
}
