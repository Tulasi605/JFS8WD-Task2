package Task2;

import java.util.Scanner;


public class person {
	private String name;
	private int age;
	
	person(){
		age=18;
	}
	
	person(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	void show(){
		System.out.println(name+" "+age);
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		person obj = new person("Akash",26);
		obj.show();
		person obj1 = new person();
		obj1.show();
	}
}
