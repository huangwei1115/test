package test;

import java.util.Scanner;

public class Puppy{
	int puppyAge;
	static String name;
//	static int age;
	public Puppy(String name){
		
		
	 System.out.println("Passed Name is:"+name);
	
	}
	
//	public void setAge(int age){
//		puppyAge =age;
//	}
//	public int getAge(){
//		System.out.println(name+"'age is "+age);
//		return puppyAge;
//	}
	public static void main(String[] args){
		Scanner input1=new Scanner(System.in);
		name=input1.nextLine();
//		Scanner input2=new Scanner(System.in);
//		age=input2.nextInt();
		Puppy myPuppy= new Puppy(name);
//		myPuppy.setAge(age);
//		myPuppy.getAge();
//		
		
		 input1.close();
//		 input2.close();
	}
}

