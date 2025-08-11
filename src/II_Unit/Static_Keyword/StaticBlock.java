/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * *
 * * 
 * * This Java snippet illustrates:
 * * - How the 'super' keyword accesses parent class constructor
 * *
 * @package II_Unit.Static_Keyword;
 * @author Dr. S. Sampath Kumar
 * @since 11-08-2025
 * @version 1.0
 */
package II_Unit.Static_Keyword;

public class StaticBlock {
    // static variable declaration
    static int area;
    static int radius;
    
    // static block declaration
    static {
        System.out.println("Invoked java static block!");
        // initializing radius and area static variable
        radius = 4;
        area = radius * radius;
    }

    public static void main(String[] args) {
        System.out.println("In the main() function");
        System.out.println("Area of square with radius " + radius + ": " + area);
    }
}
