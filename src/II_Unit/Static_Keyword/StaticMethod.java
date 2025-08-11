/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * A static method belongs to the class, not to any specific object.
 * * It can be accessed directly using the class name, 
 * * and it can only interact with static members.
 * *
 * * This Java snippet illustrates:
 * * - How the 'super' keyword accesses parent class constructor
 * *
 * @package II_Unit.Static_Keyword;
 * @author Dr. S. Sampath Kumar
 * @since 11-08-2025
 * 
 * @version 1.0
 */
package II_Unit.Static_Keyword;

// Java code to demonstrate the use of static methods in a program
class MathUtils {
    int a = 10;
    static int square(int x) {
        // this will throw an error since 'a' is not static member
        // a++;
        return x * x;
    }
    void printValue() {
        System.out.println("Value of instance variable a: " + a);
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        // Calling the static method square from MathUtils class
        // using the class name directly
        int result = MathUtils.square(5);
        System.out.println("Square of 5 is: " + result);

        // Cannot access non-static members directly in static context
        // This will throw an error
        // System.out.println("Value of a: " + MathUtils.a); 
        
        // Creating an instance of MathUtils to call the non-static method
        MathUtils mathUtils = new MathUtils();
        mathUtils.printValue();
    }
}
