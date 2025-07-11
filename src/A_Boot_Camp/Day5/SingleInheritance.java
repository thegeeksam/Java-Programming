//Base class
class Person
{
		String name="Sakthi";
		public void show()
		{
			System.out.println("Student inheriting properties from Person");
		}
}
//child class
class Student extends Person
{
  	// defining additional properties to child class
		String course = "OOPs with Java";
	  public void show1()
	  {
		System.out.println("I am a Student who belongs to Person class");
	  }
}
public class SingleInheritance{
	  public static void main(String args[])
	  {
		Student obj = new Student();
		obj.show();
		obj.show1();
		System.out.println("Name of student: " + obj.name);
		System.out.println("Course opted by the student: " + obj.course);
	  }
}