/**
 * * This file is part of the Java Programming Lecture project.
 * * It demonstrates the concept of `this` keyword in Java.
 * * The `this` keyword is a reference to the current object.
 * @package II_Unit.This_Super
 * @author Dr. S. Sampath Kumar
 * @since 03-08-2025
 * @version 1.0
 */
package II_Unit.This_Super;

// The “this” keyword is used to invoke the methods of 
// the current object or class.     

class Illustration2 {

    // current class method
    void app() {
        System.out.print("My name is ");
    }

    void name() {
        // invoking current class scaler method.
        this.app();
        System.out.println("Ravi.");
    }
}

public class this2 {

    public static void main(String[] args) {
        // creating an instance of Illustration class
        Illustration2 obj = new Illustration2();
        obj.name();
    }
}
