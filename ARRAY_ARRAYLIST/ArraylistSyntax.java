package JAVA_DSA.ARRAY_ARRAYLIST;
import java.util.*;
public class ArraylistSyntax {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(5);

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter elements of array: ");
        for(int i=0;i<6;i++)
        {
            list.add(inp.nextInt());
        }

        //output priniting one by one
        for(int i=0;i<6;i++)
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        list.remove(0);
        System.out.println(list);
        list.set(0,25);
        System.out.println(list);
        
    }
}
