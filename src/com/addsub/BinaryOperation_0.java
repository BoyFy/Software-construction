package com.addsub;
import java.util.Random;;
public class BinaryOperation_0 {
	public static void main(String[] args) {
		int[] mArry=new int[50];
		int[] nArry=new int[50];
		int[] flagArry=new int[50];
		int[] result=new int[50];
		char[] symbol=new char[50];   //symbol�������
		Random rand=new Random();
		System.out.println("�������50��100���ڵļӼ�����");
		for (int i = 0; i < 50; i++) {
			flagArry[i]=rand.nextInt(2);
			mArry[i]=rand.nextInt(101);
			nArry[i]=rand.nextInt(101);
			if (flagArry[i]==1) {
				result[i]=mArry[i]+nArry[i];
				symbol[i]='+';
			}
			else{
				result[i]=mArry[i]-nArry[i];
				symbol[i]='-';
			}
			System.out.println((i+1)+":\t"+mArry[i]+symbol[i]+nArry[i]+'=');
		}
		System.out.println("������ϰ��ο���:");
		for (int i = 0; i < 50; i++) {
			System.out.     println((i+1)+":\t"+result[i]);
		}
	}

}
