class Student {
  Student(int id, String name) {
    System.out.println("Student ID is "+ id + " and name is "+ name );
  }
}

public class ArrayObject {
  public static void main (String[] args) {
    // declaring an array of Object
    Student obj[] = new Student[3];
    
    obj[0] = new Student(1,"Bharat");
    obj[1] = new Student(5,"Vivaan");
    obj[2] = new Student(6,"Smith");
    
  }
}