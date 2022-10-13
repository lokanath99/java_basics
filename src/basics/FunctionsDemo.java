package basics;

public class FunctionsDemo {
/*
 * function / methods 
 * predefined 
 * user defined 
 * 
 * recursive functions
 * 
 */
	public static int add(int a, int b) {//function deffination 
		return a+b;
	}
	
	public static int factorial(int a){
		if(a <= 1) {
			return 1;
		}
		else {
			return a*factorial(a-1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "talkalot";
		int a = 2, b = 5;
		System.out.println( Math.pow(a, b) );//8
		int res = add(a,b);//function call 
		System.out.println(res);//5
		int res2 = factorial(b);//120
		System.out.println(res2);
		
		
	}

}
