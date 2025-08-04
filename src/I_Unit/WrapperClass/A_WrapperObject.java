/**
 * * This file is part of the Java Programming Lecture project.
 * * This file demonstrates the creation and usage of wrapper 
 * * objects in Java.
 * *
 * @package I_Unit
 * @author Dr. S. Sampath Kumar
 * @since 03-08-2025
 * @version 1.0
 */

package I_Unit.WrapperClass;

public class A_WrapperObject {
    public static void main(String xyz[]) {
        Integer num = new Integer(77); // int
        Integer num2 = new Integer("Hello"); // String
        Double num3 = new Double(77.0); // double argument
        Float num4 = new Float(77.0f); // float argument
        Character c1 = new Character('s'); // character
        Boolean b = new Boolean(true); // value stored - true

        System.out.println(num + " " + num2 + " " + num3
                + " " + num4 + " " + c1 + " " + b);
    }
}