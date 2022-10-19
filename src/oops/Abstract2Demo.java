package oops;

abstract class Printer{
	abstract public void printing();
}

class HpPrinter extends Printer{
	public void printing() {
		System.out.println("Hp is Printing ........");
	}
}

class CanonPrinter extends Printer{
	public void printing() {
		System.out.println("Canon is Printing ........");
	}
}

class PrintHelper{
	public void prints(Printer i) {
		i.printing();
	}
}

public class Abstract2Demo 
{

	public static void main(String[] args) 
	{
		HpPrinter h = new HpPrinter();
		CanonPrinter c = new CanonPrinter();
		PrintHelper p = new PrintHelper();
		p.prints(h);
	
	}

}
