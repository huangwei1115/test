package test;

import java.util.Random;
import java.util.Scanner;

public class Guess {
	public static void main(String[] args){
		System.out.println("------��ȭ��Ϸ------");
		System.out.println("���ȭ��1.���� 2.ʯͷ 3.����");
		Scanner input =new Scanner(System.in);
		int i=input.nextInt();
		Random random=new Random();
		int j=random.nextInt(3)+1;//����1-3֮��������
//		if(i==j)
//			System.out.println("ƽ��");
//  	if(i==1&&j!=1){
//			if(j==2)
//				System.out.println("������Ǽ��������Գ�����ʯͷ��������");
//			else 
//				System.out.println("������Ǽ��������Գ����ǲ�����Ӯ��");
//		}
//		if(i==2&&j!=2){
//			if(j==3)
//				System.out.println("�������ʯͷ�����Գ����ǲ���������");
//			else 
//				System.out.println("�������ʯͷ�����Գ����Ǽ�������Ӯ��");
//		}
//		if(i==3&&j!=3){
//			if(j==1)
//				System.out.println("������ǲ������Գ����Ǽ�����������");
//			else 
//				System.out.println("������ǲ������Գ�����ʯͷ����Ӯ��");
//		}
//		input.close();
		String Marks="ȭͷ";
		String Marks2="ȭͷ"; //�Ǹ����
		switch(i){
		case 1:
			Marks="����";
			break;
		case 2:
			Marks="ʯͷ";
			break;
		case 3:
			Marks="��";
			break;
		}
		switch(j){
		case 1:
			Marks2="����";
			break;
		case 2:
			Marks2="ʯͷ";
			break;
		case 3:
			Marks2="��";
			break;
		}
		if(i==j)
			System.out.println("�������"+Marks+"�����Գ�����"+Marks2+"   "+"^_^ƽ�֣�");
		else if(i==1&&j==2||i==2&&j==3||i==3&&j==1)
			System.out.println("�������"+Marks+"�����Գ�����"+Marks2+"   "+"^_^sorry�������ˣ�");
		else System.out.println("�������"+Marks+"�����Գ�����"+Marks2+"   "+"^_^good����Ӯ�ˣ�");
		input.close();
	}

	}
