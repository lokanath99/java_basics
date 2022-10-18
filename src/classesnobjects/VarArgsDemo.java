package classesnobjects;

class Calc1{
	public int add(int ... num ) {
		int sum = 0;
		for(int i : num) {
			sum += i;
		}
		return sum;
	}
}



public class VarArgsDemo 
{
	public static void main(String args[]) 
	{
		Calc1 c1 = new Calc1();
		System.out.println(c1.add(5,5,5,5,5,5,5,5,5,5,5,5,5,5));//converted to array -> {5,5,5,5,5}
		
	}
}
