package Unit_02;
/*
  Abstract Class:
   An abstract class must be declared with the abstract keyword.
   -Abstraction is a process of hiding the implementation details and showing only functionality to the user
    (function declaration) t6o the user .
   - we can not make object of abstract class directly ,but through derived class with the help of which we can
     access members of the abstract class by creating its object .
   -their are two ways to achieve  abstraction
     1. abstract(0 to 100%)
     2.Interface(100%)
   - interface is  a 100% abstract class
   
   FINAL CLASS
   -In java, a class declared with final keyword is called as final class. Inheritance is not possible with final class
   -Main purpose of final class is to prevent a class extend another class 
 */
abstract class Bike{
	int a;
	
	Bike(){
		System.out.println("Inside Bike constructor:"+ a +"\n");
		}
	abstract void run();//ABSTRACT METHOD
	
	void display() {
		System.out.println("this is display method!");
	}
}

class Honda4 extends Bike {
   void run() {
	   
   }
}


public class P9_Task01_AbstractAndFinalClassInJava {
	public static void main(String[] args) {
		Bike obj =new Honda4();
		//obj.run();
		obj.display();
		//we can not instantiated obj of bike like
		//Bike obj2 = new Bike();
	}

}
final class Super{
	public int data =30;
	
	void display() {
		System.out.println(data);
	}
}

/*
public class Sub extends Super{
	void display2() {
		display()
	}
}
*/