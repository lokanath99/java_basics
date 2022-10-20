package oops;

abstract class Writing{
	abstract public void write();
}

class Pen extends Writing{
	public void write() {
		System.out.println("pen ........");
	}
}

class Pencil extends Writing{
	public void write() {
		System.out.println("pencil ........");
	}
}

class WriteHelper{
	public void writs(Writing i) {
		i.write();
	}
}

public class Abstract2Demo 
{

	public static void main(String[] args) 
	{
		Writing p = new Pen();
		Writing pe = new Pencil();
		WriteHelper wh = new WriteHelper();
		wh.writs(pe);
	
	}

}
