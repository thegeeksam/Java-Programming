class Super {
  Super() {
    System.out.println("Super class constructor called.");
  }
}

class Sub extends Super {
  Sub() {
    super();
    System.out.println("Sub class constructor called.");
  }
}

public class Main {
  public static void main(String[] args) {
    Sub obj = new Sub();
  }
}