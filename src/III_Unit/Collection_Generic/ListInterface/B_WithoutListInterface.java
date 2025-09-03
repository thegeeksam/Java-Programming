/**
 * * This file is part of the Java Programming Lecture project
 * *
 * * This Java snippet illustrates:
 * * - Create list Without using the List interface (Concrete Implementation)
 * *
 * @package III_Unit.Collection_Generic.ListInterface;
 * @author Dr. S. Sampath Kumar
 * @since 03-09-2025
 * @version 2.0
 */

package III_Unit.Collection_Generic.ListInterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class B_WithoutListInterface {
    public static void main(String[] args) {
        // Creating the list of Integer references using ArrayList
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println("ArrayList: " + list1);
        // Creating the list of Integer reference using LinkedList class
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        System.out.println("LinkedList: " + list2);

        // Creating the list of Integer references using the stack
        Stack<Integer> list3 = new Stack<Integer>();

        // Creating the list of Integer reference using the vector class
        Vector<Integer> list4 = new Vector<Integer>();
    }
}