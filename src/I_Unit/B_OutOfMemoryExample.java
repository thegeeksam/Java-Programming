/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * It demonstrates the concept of StackOverflowError in Java.
 * * A StackOverflowError occurs when a program recurses too deeply
 * * and exhausts the stack space allocated for the thread.
 * * In this example, the `recursiveMethod` calls itself indefinitely,
 * * leading to a StackOverflowError.
 * *
 * @package I_Unit
 * @author Dr. S. Sampath Kumar
 * @since 23-07-2025
 * @version 1.0
 */

package I_Unit;

import java.util.ArrayList;
import java.util.List;

public class B_OutOfMemoryExample {
    static int iA;
    public static void main(String[] args) {
        try {
            List<Object> objectList = new ArrayList<>();

            while (true) {
                System.out.println("Adding object to list..." + iA++ + " times");
                // Continuously add objects to the list to exhaust memory
                objectList.add(new Object());
            }
        } catch (OutOfMemoryError e) {
            System.out.println("OutOfMemoryError caught: " + e.getMessage());
        }
    }
}
