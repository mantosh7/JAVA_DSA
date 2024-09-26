package JAVA_DSA.LINEAR_SEARCH;

import java.util.*;

public class CharInString {
    public static void main(String[] args) {
        String str = "Mantosh";
        char ch = 's';
        check(str, ch);
    }

    static void check(String str, char ch) {
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                System.out.print(ch + " is present in the given string at index " + i);
                flag = true;
                break;
            }
        }
        if (flag == false) {
            System.out.print(ch + " is not present in the given array");
        }
    }
}