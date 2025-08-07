package mypack;
import mypack.*;
public class MultiLevel{
    public static void main(String args[]){
         ClassC c = new ClassC();
         
         c.dispC();
         c.dispB();
         c.dispA();
    }
}

/*
javac MyPackageClass.java
javac -d . MyPackageClass.java
java mypack.MyPackageClass
*/