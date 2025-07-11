class Automobile {
    // Constructor
    Automobile() {
        System.out.println("Parent class constructor invoked");
    }
}

class Bike extends Automobile {
    // Constructor
    Bike() {
        super();
        System.out.println("child class constructor invoked");
    }

    // Instance Initializer block
    {
        System.out.println("instance initializer block is invoked");
    }
}

public class InitializerBlock {
    public static void main(String args[]) {
        Bike b1 = new Bike();
    }
}

/*
In the above example, it seems that the instance initializer block 
is invoked first, but NO. The instance initializer block is invoked
at the time of object creation. The Java compiler copies the 
instance initializer block in the constructor after the 
first statement super(). So firstly, the constructor is invoked. 
*/
