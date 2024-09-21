package JAVA_DSA.SWITCH_STATEMENT;

import java.util.*;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter number:");
        int num = s1.nextInt();

        switch (num) {
            case 1:
                System.out.println("Mantosh Kumar");
                break;

            case 2:
                System.out.println("Santosh Kumar");
                break;

            case 3:
                System.out.println("Amit Kumar");
                break;

            case 4:
                System.out.print("Enter department:");
                String department = s1.next();
                switch (department) {
                    case "IT":
                        System.out.println("IT department");
                        break;

                    case "Manager":
                        System.out.println("Manager department");
                        break;

                    default:
                        System.out.println("Other department");
                }
                break;

            default:
                System.out.println("please enter a valid number");
        }
    }
}
