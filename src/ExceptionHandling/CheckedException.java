package ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedException {
    public static void main(String args[]) throws FileNotFoundException {
        String dir = "missingfile.txt";
        Scanner sc = new Scanner(new File(dir));
    }
}
