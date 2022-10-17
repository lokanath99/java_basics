package classesnobjects;
//1900 + 
class Calc {
	public int add(int a, int b ) {
		return a+b;
	}
}

//1930 -
class CalcV2 extends Calc {
	public int sub(int a, int b) {
		return a-b;
	}
}// single level inheritance 

//1970 * /
class CalcV3 extends CalcV2{
	public int mul(int a, int b ) {
		return a*b;
	}
	public int div(int a, int b ) {
		return a/b;
	}
}// multi level inhertitance 

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalcV3 cv3 = new CalcV3();
		System.out.println(cv3.add(5, 5));
		
	}

}
