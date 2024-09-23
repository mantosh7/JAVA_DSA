package JAVA_DSA.FUNCTION_METHOD;

public class function {
    public static void main(String[] args) {
        String name = "Mantosh";

        fun(name);
        System.out.println(name);
    }

    static void fun(String naam){
        naam = "Amit";    // not changing the original object,creating a new object that's why name does not have any effect due to this change
        System.out.println(naam);
    }
}

// If we will change the original object in some other function by passing object,then changes will reflect.
