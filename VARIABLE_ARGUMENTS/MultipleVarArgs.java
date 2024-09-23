package JAVA_DSA.VARIABLE_ARGUMENTS;

import java.util.*;

public class MultipleVarArgs {
    public static void main(String[] args) {
        fun(20,54,"Mantosh","Santosh","Amit");
    }

    static void fun(int a,int b,String ...v){    // variable arguments should be in the end of all the arguments
        System.out.println(a);
        System.out.println(b);
        for(String s:v){
            System.out.print(s+" ");
        }
    }
}
