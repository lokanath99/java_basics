package oops;

//abstract

abstract class A{//abstrace class
	public abstract void show();
	public void disp() {
		System.out.println("inside a disp of A");
	}
}

class B extends A{//concrete class 
	public void show() {
		System.out.println("inside a show of B");
	}
	
	@Override
	public void disp() {
		
	}
}

public class AbstractDemo 
{
	public static void main(String[] args) 
	{
		A obj = new B();
		obj.show();

	}

}
