package JAVA_DSA.BASIC;

public class AutoTypePromotion {
    public static void main(String[] args) {
        // Automatic Type Promotion in java is a feature that automatically converts smaller data types to larger data types when they are used in expression or method calls

        // byte a =(byte) 258;   // 258-256 = 2
        // System.out.println(a);  // 2

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 5000;
        float f = 5.67f;
        double d = .1234;
        
        double result = (f*b)+(i*c)-(d*s);   // resultant value of the expression is of type "double", therefore program will run error-free
        System.out.println(result);
    }
}
