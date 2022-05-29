package Unit_02;
/*
-extends keyword
-Subclass
-Superclass
-"Code Re-usablity"
class derived-class-name "extends" base-class
{
    //methods and fields
}
Types of inheritance:
-Single inheritance
-Multilevel inheritance
-"Multiple inheritance" :- Java does not support multiple inheritance with classes
    -It handles this feature by implementing more than one interface instead of extending more than one class
-Hierarchial inheritance(Tree?)?: Yes!
-Hybrid inheritance? No!
-Constructor calls flow in inheritance:
    -Default constructor
    -Parameterized constructor
*/

public class P8_Task01_InheritanceInJava{
	public static void main(String[] args) {
		Three  g = new Three();
		g.methodOne();
		g.methodTwo();
		g.methodThree();
		
        D obj = new D(2);
        obj.methodFour();
	}
}

class One{
	int a;
	
	One(int x){
		System.out.println("One constructor");
		System.out.println(x);
	}
	
	public void methodOne(){
		System.out.println("FirstMethod!");
	}	
}

class Two extends One {
	int b;
	
	Two(int x){
		super(3);//it is used to superclass constructor
		b = x;
		System.out.println("Two: paremeterized constructor");
	}
	public void methodTwo(){
		System.out.println("SecondMethod!");
	}
}

class Three extends Two{
	int c;
	
	Three(){
		super(1);
		System.out.println("Three Constructor!");
	}
	Three(int x){
		super(1);
		c=x;
		System.out.println(c);
	}
	public void methodThree() {
		System.out.println("ThirdMethod!");
	}
}

class A{
	int a;
	
	A(int a1){
		a = a1;
	}
	public void methodOne() {
		System.out.println(a);
	}
}

class B extends A {
	int b;
	B(int x){
		super(10);
		b = x;
	}
		public void methodTwo() {
			System.out.println(b);
		}
}
 
class C extends A {
	int c;
	
	C(){
		super(10);
		c = 10;
	}
}

class D extends A{
	int d;
	
	D(int d1){
		super(d1);
		d = d1;
	}
	public void methodFour() {
		System.out.println(d);
	}
}