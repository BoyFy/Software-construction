package com.addsub;

public class BinaryOperationTest {

	public static void main(String[] args) {
		BinaryOperation_1_1 aop;
		System.out.println("�ӷ�ϰ��Ϊ��");
		for (int i = 0; i < 10; i++) {
			aop=new AddOperation();
			System.out.println(aop);
		}
		System.out.println("����ϰ��Ϊ��");
		for (int i = 0; i < 10; i++) {
			aop=new SubOperation();
			System.out.println(aop);
		}
	}

}
