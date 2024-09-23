package JAVA_DSA.METHOD_OVERLOADING;

public class Overloading {
    public static void main(String[] args) {
        fun();
        fun(2);
        fun(2,10);
        fun("Amit Kumar");
    }

    static void fun(){
        System.out.println("Argument is empty");
    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(int a,int b){
        System.out.println(a);
        System.out.println(b);
    }

    static void fun(String name){
        System.out.println(name);
    }
}
