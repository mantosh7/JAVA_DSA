package JAVA_DSA.ARRAY_ARRAYLIST;

import java.util.*;

public class NestedArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        Scanner in = new Scanner(System.in);

        // initialisation
        for(int i=0;i<3;i++)
        {
            list.add(new ArrayList<>());
        }
        System.out.print("Enter elements: ");
        
        // adding elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }

        System.out.print(list);
    }
}
