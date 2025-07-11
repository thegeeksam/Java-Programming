class Bike{  
    int speed;  
    //Constructor
    Bike(){
		System.out.println("speed is "+speed);
		}  
	//Instance Initializer block
    {
		speed=100;
	}  
}  
Public Class InitializerBlock2{
    public static void main(String args[]){  
		Bike b1 = new Bike();  
		Bike b2 = new Bike();  
    }      
}  