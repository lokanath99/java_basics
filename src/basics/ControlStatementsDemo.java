package basics;

public class ControlStatementsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * selection statements 
		 * 
		 * if if else 
		 * else if 
		 * switch
		 * 
		 */
//		int a = 5;
//		
//		//even or odd 
//		if(a==0) {//a/2 getting the rem ==  0 -> true | false 
//			System.out.println(a + " is a whole num");
//		}
//		else if(a%2==0) {
//				System.out.println(a + " is an even num");
//		}
//		else if(a==5) {
//			System.out.println(a + " is a wonderfull num");
//		}
//		else {
//				System.out.println(a + " is an odd num");
//		}
//		
		
// switch 
		
//		int i = 3;
//		
//		switch(i) {
//		case 1:// 1 == 3 ->false 
//			System.out.println("one");
//			break;
//		case 2://->false 
//			System.out.println("two");
//			break;
//		case 3://3 == 3 -> true 
//			System.out.println("three");
//			break;
//		case 4:
//			System.out.println("four");
//			break;
//		case 5:
//			System.out.println("five");
//			break;
//		default:
//			System.out.println("The number dosnt match with the cases");
//		}
//	
 
		
//		ternary operator
		int a = 5;
		int b = 0;
		
//		if(a>2)
//			b = 2;
//		else 
//			b = a;
//			condi	?	  exp1   :    exp2
		b = a>2     ?     2     :      a   ; 
//		   true -> exp 1 
//			false -> exp2
		
		System.out.println(a);
		System.out.println(b);
	
	}

}
