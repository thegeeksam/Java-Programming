class Employee {
    
    // private variables
    private String name;
    private int age;
    private int salary;
}

class DataHiding {

    public static void main(String[] args) {
    //object of class Employee
    Employee newObj = new Employee();
    newObj.name = "James";
    System.out.println(newObj.name);
    }
}
