package basics;

public class OperatorDemo {
/*
 * logical operators 
 * 
 * && -> and 
 * || -> or
 * ! -> not
 * 
 * 
 */
	
	
	public static void main(String[] args) {
//		int a = 5, b = 7;
//							   p             q	
//		System.out.println(  (a==b)   ||    (a>b)  );
//							 fasle    and   false
		
//		System.out.println(!(a==b));
		
		/*
		 * bitwise operators 
		 * 
		 * | -> or 
		 * & -> and 
		 * ^ -> xor
		 * ~ -> not
		 * 
		 */
		
		
		
//		System.out.println( Integer.toBinaryString(a) );
////		System.out.println( Integer.toBinaryString(b) );
//		System.out.println("---------------");
//		System.out.println( Integer.toBinaryString(~a) );
//		System.out.println();
//		System.out.println(~a);
//		
		/*
		 * shift operators 
		 * << -> left shift    formula a * 2^b
		 * >> -> right shift   formula a / 2^b	
		 * 
		 */
		
		
		int a = 10, b = 2;
		
		System.out.println(a>>b);
		System.out.println(a / Math.pow(2, b));
		
	
	}

}
