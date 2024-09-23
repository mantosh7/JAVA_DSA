package JAVA_DSA.VARIABLE_ARGUMENTS;

import java.util.*;

public class VarArg {
    public static void main(String[] args) {
        fun(2,7,3,7,9,8,7,10,25,48,32,13);
    }

    static void fun(int ...v){     // (int ..v) will take any numbber of arguments
        System.out.println(Arrays.toString(v));
    }
}
