package JAVA_DSA.BASIC;

import java.util.*;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

        System.out.print("Enter temperature in °C : ");
        float cel = c.nextFloat();

        float f = ((cel*9/5 + 32 ));
        System.out.print("Temperature in Fahrenheit : "+f);
        
    }
}
