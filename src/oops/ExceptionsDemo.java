package oops;

import java.util.Scanner;

public class ExceptionsDemo {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		int i = 5,j = 0;
		int b[] = {1,3};
		int c[] = null ;
		
		System.in.read();//accepts chars -> AScii
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println(c[0]);
			sc.close();
			System.out.println(b[3]);
			int a = i/j;
		}
		catch(ArithmeticException e) {
			System.out.println("caught the exception.." + e.getMessage() );
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("caught the exception.." + e.getMessage() );
		}
		catch(Exception e) {
			System.out.println("caught the exception.." + e.getMessage() );
		}
		finally {
			sc.close();
			System.out.println("in the finally block");
		}
	}

}
