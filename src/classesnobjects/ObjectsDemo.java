package classesnobjects;

public class ObjectsDemo {
	public static void main(String[] args) {
		
		Emp loki = new Emp();
		loki.name = "lokesh";
		loki.id = 5658;
		loki.sal = 500000;
		loki.ceo = "mark";
		
		Emp abhi = new Emp();
		abhi.name = "abhishek";
		abhi.id = 5686;
		abhi.sal = 450000;
		abhi.ceo = "mark";
		Emp.ceo = "john";
		
	
		
		loki.showEmp();
		System.out.println("----------------------");
		abhi.showEmp();
		
		
		

		
//		Person p1 = new Person();
//		Person p2 = new Person("talkalot", 90);//overloding const
		
//		p1.showPerson();
//		p2.showPerson();
		
//		p1.walk();
//		p1.walk("Slowly");//overloading

		
	}
}
