/**
 * * This file is part of the Java Programming Lecture project.
 * * It demonstrates the concept of `this` keyword in Java.
 * * The `this` keyword is a reference to the current object.
 * * It can be used to access instance variables and methods of the current object.
 * * In this example, the `Code` class uses `this` to refer to its instance variable.
 * *
 * @package II_Unit.This_Super
 * @author Dr. S. Sampath Kumar
 * @since 03-08-2025
 * @version 1.0
 */
package II_Unit.This_Super;

class Code {
    int value = 10;

    Code(int var) {
        // this.value = var;
        this.value = var;
    }

    void print() {
        System.out.println("Value of Current instance Variable : " + value);
    }
}

public class This {
    public static void main(String[] args) {
        // creating an instance of Illustration class
        Code obj = new Code(20);
        obj.print();
        Code obj1 = new Code();
        obj1.print();
    }
}