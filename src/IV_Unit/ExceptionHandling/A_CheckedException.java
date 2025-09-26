package IV_Unit.ExceptionHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class A_CheckedException {
    public static void main(String args[]) throws FileNotFoundException {
        // Checked exceptions are exceptions that are
        // checked at compile-time
        File file = new File("E:\\My Documents\\MEGA\\Geek\\Java Workspace\\CSE C\\MyProject\\src\\IV_Unit\\missingfile.txt");
        try {
            // This line can throw a FileNotFoundException, which is a checked exception.
            FileReader reader = new FileReader(file);
            System.out.println("File opened successfully.");
        } catch (FileNotFoundException e) {
            // We MUST catch it or declare it to be thrown.
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
