package classesnobjects;

//import java.util.Scanner;

public class ObjectsDemo 
{
	public static void main(String[] args) 
	{
		
//		num = {1,3,5,7,9}
//		       0 1 2 3 4 
		
//		int num[] = {1,3,5,7,9};
		
//		for(int i = 0 ; i < num.length  ; i++) {
//			System.out.print(num[i] + " ");
//		}
//		enhanced for loops 
//		for(int k : num) {
//			System.out.print(k + " ");
//		}
		
		
//		int num[] = new int[5];//1D
//		Scanner sc = new Scanner(System.in);
//		
//		for(int i = 0 ; i < 5 ; i++) {
//			System.out.println("enter the "+i+"th element");
//			num[i] = sc.nextInt();
//		}
//		sc.close();
//		
//		
//		int num[][] = new int[2][5];
		int num[][] = {
				{1,3,5,7,9},//0
//				 0 1 2 3 4 
				{0,2,4,6,8,10}	//1 //jagged array
//				 0 1 2 3 4 
		};//2D array

//		enhanced for loop 
		for(int k[] : num) {//k {1,3,5,7,9}1st , {0,2,4,6,8}2nd	
			for(int l : k ) {// l =  1 3 5 7 9 1st, 0 2 4 6 8 2nd
				System.out.print(l + " ");
			}
			System.out.println();
		}
		
		
//		for(int i = 0; i < num.length; i++) {
//			for(int j= 0; j < num[i].length; j++) {
//				System.out.print( num[i][j] + " " );
//			}
//			System.out.println();
//		}
		
		
		
		
		
		
		
		
//		{0,0,0,0,0}
//		num[0] = 1;
//		num[1] = 3;
//		num[2] = 5;
//		num[3] = 7;
//		num[4] = 9;

		
		// code redundency 
//		System.out.println(num[0]);
//		System.out.println(num[1]);
//		System.out.println(num[2]);
//		System.out.println(num[3]);
//		System.out.println(num[4]);
//		
		
		
		
		

//	
//		Scanner sc = new Scanner(System.in);
//		String name = sc.next();
//		sc.close();
//		System.out.println("welcome to java "+name);
//		
		
		
//		Emp loki = new Emp();
//		loki.name = "lokesh";
//		loki.id = 5658;
//		loki.sal = 500000;
////		loki.ceo = "mark";
//		
//		Emp abhi = new Emp();
//		abhi.name = "abhishek";
//		abhi.id = 5686;
//		abhi.sal = 450000;
////		abhi.ceo = "mark";
//		Emp.ceo = "john";
//		
//	
//		
//		loki.showEmp();
//		System.out.println("----------------------");
//		abhi.showEmp();
//		
		
//		Person p1 = new Person();
//		Person p2 = new Person("talkalot", 90);//overloding const
		
//		p1.showPerson();
//		p2.showPerson();
		
//		p1.walk();
//		p1.walk("Slowly");//overloading

		
	}
}
