package JAVA_DSA.LOOP;

import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("Enter operator: ");
        char op = n.next().trim().charAt(0);

        if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
            System.out.print("Enter operands: ");
            float num1 = n.nextFloat();
            float num2 = n.nextFloat();

            if (op == '+')
                System.out.println("Result = " + (num1 + num2));
            if (op == '-')
                System.out.println("Result = " + (num1 - num2));
            if (op == '*')
                System.out.println("Result = " + (num1 * num2));
            if (op == '/')
                System.out.println("Result = " + (num1 / num2));
            if (op == '%')
                System.out.println("Result = " + (num1 % num2));
        }
    }
}
