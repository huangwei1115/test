package test;

import java.util.Scanner;

public class IsLeapYear {
    public static void main(String[] args){
    	Scanner input=new Scanner(System.in);
    	System.out.println("ÇëÊäÈëÄê·İ£º");
    	int i=input.nextInt();
    	if(i%100==0){
    		if (i%400==0)
    		System.out.println(i+" is leap year!");
    		else System.out.println(i+" is not leap year!");
    		}
    	
    	else if(i%4==0)
    		System.out.println(i+" is leap year!");
    	else System.out.println(i+" is not leap year!");
    	
    	input.close();
    }
}
