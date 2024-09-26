package JAVA_DSA.LINEAR_SEARCH;
import java.util.*;
public class NumIn2DArray {

    // 1st method
    // public static void main(String[] args) {
    // int[][] arr = { { 1, 2, 3 }, { 40, 57, 36 }, { 41, 65, 25 } };
    // int target = 65;
    // check(arr, target);
    // }

    // static void check(int[][] arr, int target) {
    // boolean flag = false;
    // for (int i = 0; i < arr.length; i++) {
    // for (int j = 0; j < arr[i].length; j++) {
    // if (arr[i][j] == target) {
    // System.out.print(target + " is present at index (" + i + "," + j + ")");
    // flag = true;
    // break;
    // }
    // }
    // }

    // if (flag == false) {
    // System.out.print(target + " is not present.");
    // }

    // }

    // 2nd method (by returning a new array)
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 40, 57, 36 }, { 41, 65, 25 } };
        int target = 65;
        int[] ans = check(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] check(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

}
