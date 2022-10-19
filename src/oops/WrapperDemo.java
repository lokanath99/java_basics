package oops;

class Display{
	public void displayNumber(Number i) {
		System.out.println("number is : " + i);
	}
}


public class WrapperDemo 
{
	public static void main(String[] args) 
	{
		Integer i = 7;//wrapper
		Float j = 5.3f;
		Double k = 6.23666355;
		Display d = new Display();
		d.displayNumber(k);
		
		
		
//		int i = 5;//primitive datatype
//		Integer a = new Integer(i);//wraping  boxing
//		
//		int j = a.intValue();//unwrapping unboxing 
//		
//		Integer b = i;//autowrapping auto boxing 
//		int k = b;//autounwrapping 
//		
//		
//		System.out.println(i+" "+a + " "+ j);
		
	}
}
