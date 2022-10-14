package classesnobjects;

public class Person {
	String name;//null
	int age;//0
	double hight;//0.0
	
	//const
	Person(){
		name = "john doe";
		age = 18;
		hight = 5.5;
//		System.out.println("Inside the constructor");
	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
		hight = 5.5;
//		System.out.println("Inside the constructor with 2 args");
	}
	
	public void showPerson() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(hight);
	}
	
	public void walk() {
		System.out.println("The person is walking");
	}
	
	public void walk(String pace) {
		System.out.println("The person is walking "+pace);
	}
	
	public void study() {
		System.out.println("The person is busy studing");
	}
}
