package test;
import java.util.Scanner;

public class EvenNumber {
  public static void main(String[] args){
	  Scanner input=new Scanner(System.in);
	  System.out.println("ÇëÊäÈëÊı×Ö£º");
	  int i=input.nextInt();
	  if(i%2==0)
		  System.out.println("This is even number!");
	  else System.out.println("This is odd number!");
	  input.close();	  
		  
  }
}
