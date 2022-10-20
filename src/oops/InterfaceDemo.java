package oops;
//normal interface
interface A{
	public void show();
	default public void disp() {
		System.out.println("inside the disp of A");
	}
}
//SAM interface -> functional interface 
interface B{
	default public void disp() {
		System.out.println("i am an idot .....");
	}
}
class C implements A,B{
	public void show(){
		System.out.println("inside the show of B");
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		B.super.disp();
	}
	
}

public class InterfaceDemo 
{

	public static void main(String[] args) 
	{
		C obj = new C();
//		obj.show();
		obj.disp();
	}

}
