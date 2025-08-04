interface FirstInterface {
  public void myMethod(); // interface method
  int voide = 10; // Member
}

interface SecondInterface {
  public void myOtherMethod(); // interface method
}

class DemoClass implements FirstInterface, SecondInterface {
  public void myMethod() {
    System.out.println("Some text..");
  }
  public void myOtherMethod() {
    //voide++;
    System.out.println("Some other text..." + voide);
  }
}

class MultipleInterface {
  public static void main(String[] args) {
    DemoClass myObj = new DemoClass();
    myObj.myMethod();
    myObj.myOtherMethod();
  }
}