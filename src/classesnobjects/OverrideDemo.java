package classesnobjects;
class A {//super
	public void show() {
		System.out.println("Inside the show of A");
	}
}

class B extends A{//sub
	
	@Override
	public void show() {//logical error
		System.out.println("Inside the show of B");
	}
//	
	public void disp() {
		
	}
}

class C extends A{
	
}

public class OverrideDemo 
{

	public static void main(String[] args) 
	{
//		A obj = new A();
//		obj.show();
//		
		B objB = new B();
		objB.show();
		
//		int a = 4+6;
//		String str = "talk a " + " lot";//compile time poly morphysm 
		
		
//		A obj        =    new B();
////		referencing      object creation
//		obj.show();
//		
//		A obj1 = new C();//runtime polymorphism
//		obj1.show();//dynamic dispatch 
//		
		
	}

}
