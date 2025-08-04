// Interface
interface Animal {
  public void animalSound(); // interface method (does not have a body)
  public void sleep(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
class Lion implements Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The Lion Roars!\n");
  }
  public void sleep() {
    // The body of sleep() is provided here
    System.out.println("Lion: Zzz....\n");
  }
}

class InterfaceExample {
  public static void main(String[] args) {
    Lion myLion = new Lion();  // Create a Lion object
    myLion.animalSound();
    myLion.sleep();
  }
}