package test;

import java.util.Random;
import java.util.Scanner;

public class Guess {
	public static void main(String[] args){
		System.out.println("------猜拳游戏------");
		System.out.println("请出拳（1.剪刀 2.石头 3.布）");
		Scanner input =new Scanner(System.in);
		int i=input.nextInt();
		Random random=new Random();
		int j=random.nextInt(3)+1;//生成1-3之间的随机数
//		if(i==j)
//			System.out.println("平局");
//  	if(i==1&&j!=1){
//			if(j==2)
//				System.out.println("你出的是剪刀，电脑出的是石头，你输了");
//			else 
//				System.out.println("你出的是剪刀，电脑出的是布，你赢了");
//		}
//		if(i==2&&j!=2){
//			if(j==3)
//				System.out.println("你出的是石头，电脑出的是布，你输了");
//			else 
//				System.out.println("你出的是石头，电脑出的是剪刀，你赢了");
//		}
//		if(i==3&&j!=3){
//			if(j==1)
//				System.out.println("你出的是布，电脑出的是剪刀，你输了");
//			else 
//				System.out.println("你出的是布，电脑出的是石头，你赢了");
//		}
//		input.close();
		String Marks="拳头";
		String Marks2="拳头"; //是个标记
		switch(i){
		case 1:
			Marks="剪刀";
			break;
		case 2:
			Marks="石头";
			break;
		case 3:
			Marks="布";
			break;
		}
		switch(j){
		case 1:
			Marks2="剪刀";
			break;
		case 2:
			Marks2="石头";
			break;
		case 3:
			Marks2="布";
			break;
		}
		if(i==j)
			System.out.println("你出的是"+Marks+"，电脑出的是"+Marks2+"   "+"^_^平局！");
		else if(i==1&&j==2||i==2&&j==3||i==3&&j==1)
			System.out.println("你出的是"+Marks+"，电脑出的是"+Marks2+"   "+"^_^sorry，你输了！");
		else System.out.println("你出的是"+Marks+"，电脑出的是"+Marks2+"   "+"^_^good，你赢了！");
		input.close();
	}

	}
