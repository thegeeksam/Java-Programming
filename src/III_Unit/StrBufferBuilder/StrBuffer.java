/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * This Java snippet illustrates:
 * * - the use of StringBuffer for mutable strings
 * * - the difference between StringBuffer and String   
 * *
 * @package III_Unit.StrBufferBuilder
 * @author Dr. S. Sampath Kumar
 * @since 29-08-2025
 * @version 1.0
 */
package III_Unit.StrBufferBuilder;

public class StrBuffer {
    public static void main(String[] args) {
        // StringBuffer is mutable
        // Creating a StringBuffer with no initial content. 
        //Capacity is 16 by default.
        StringBuffer sSB1 = new StringBuffer();
        sSB1.append("SECE");
        // Creating a StringBuffer with initial content.
        // Capacity is 16 + 4 = 20, where 4 is the length of "SECE".
        StringBuffer sSB2 = new StringBuffer("SECE");
        System.out.println(sSB1 == sSB2); // false, different references
        // System.out.println("Capacity of sSB1: " + sSB1.capacity());
        // System.out.println("Length of sSB1: " + sSB1.length()); // Length is 4
        // System.out.println("Capacity of sSB2: " + sSB2.capacity()); 
        // System.out.println("Length of sSB2: " + sSB2.length());
        // Error: Can't convert StringBuffer to String
        // s = "Hi"
        // s = s + "Hello";
        
        // String s1 = s;
        // String s1 = s.toString(); // Convert StringBuffer to String
        // Append some content to StringBuffer
        System.out.println(sSB1.append("!\nHello, II CSE B!"));
        System.out.println(sSB1.capacity());
        System.out.println(sSB1.length());

        // If the capacity of StringBuffer gets full after adding
        // an extra String, the new capacity of StringBuffer will be
        // (previousCapacity + 1) * 2
        // System.out.println(sSB1.append("!"));
        // System.out.println(sSB1.length());
        // System.out.println(sSB1.capacity());

    }
}