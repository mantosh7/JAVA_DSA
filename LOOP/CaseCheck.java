package JAVA_DSA.LOOP;

import java.util.*;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner letter = new Scanner(System.in);

        System.out.print("Enter any character: ");
        char ch = letter.next().trim().charAt(0);

        if(ch>='a'&&ch<='z')
        {
            System.out.print("Lower case");
        }
        else if (ch>='A'&&ch<='Z'){
            System.out.print("Upper case");
        }
        else{
            System.out.print("Not a character");
        }
    }
}
