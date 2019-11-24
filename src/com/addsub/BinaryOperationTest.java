package com.addsub;

public class BinaryOperationTest {

	public static void main(String[] args) {
		BinaryOperation_1_1 aop;
		System.out.println("加法算式为:");
		for (int i = 0; i < 10; i++) {
			aop=new AddOperation();
			System.out.println(aop);
		}
		System.out.println("减法算式为:");
		for (int i = 0; i < 10; i++) {
			aop=new SubOperation();
			System.out.println(aop);
		}
	}

}
