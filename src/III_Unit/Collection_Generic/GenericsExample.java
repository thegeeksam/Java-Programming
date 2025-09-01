/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * This is a follow-up of ListExample.java
 * * Since we List supports Object type, we can add
 * * any type of object (Wrapper Classes) to the list
 * * to include specific data type we are moving to Generics
 * *
 * * This Java snippet illustrates:
 * * - Example of Generics in Java
 * * - Type Safety with Generics
 * * - Compile-time type checking
 * *
 * * Type safety:
 * * program enforces the correct usage of data types
 * * at compile time, preventing you from accidentally
 * * inserting or accessing incompatible types. 
 * * This avoids runtime errors and makes your code more
 * * predictable and maintainable.
 * *
 * @package III_Unit.Collection_Generic;
 * @author Dr. S. Sampath Kumar
 * @since 01-09-2025
 * @version 2.0
 */

package III_Unit.Collection_Generic;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) {
        List<String> values = new ArrayList<>();
        values.add("Hello");
        values.add("II CSE B!");
        // values.add(38); // Compile-time error
        // values.add(true); // Compile-time error
        values.add(1,", "); 
        printValues(values);

        List<Integer> intValues = new ArrayList<>();
        intValues.add(10);
        intValues.add(20);
        intValues.add(14);
        intValues.add(7);
        intValues.add(1,30);
        // Sort
        Collections.sort(intValues);
        // Reverse sort
        Collections.reverse(intValues);
        // Since we can change values of List
        // It is mutable
        Collections.shuffle(intValues);
        printValues(intValues);
    }

    static <T> void printValues(List<T> values) {
        for (T element : values) {
            // Experimental code
            if (element instanceof String) {
                System.out.print(element);
            } else if (element instanceof Integer) {
                System.out.print(element + " ");
            }
        }
        System.out.println();
    }
}