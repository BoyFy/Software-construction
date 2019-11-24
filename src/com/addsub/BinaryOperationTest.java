package com.addsub;

public class BinaryOperationTest {

	public static void main(String[] args) {
		BinaryOperation_1_0 anOperation,opCreater=new BinaryOperation_1_0();
		System.out.println("十道加法算式:");
		for (int i = 0; i < 10; i++) {
			anOperation=opCreater.generateAddOperation();
			System.out.println(anOperation);
		}
		System.out.println("十道减法算式:");
		for (int i = 0; i < 10; i++) {
			anOperation=opCreater.generateSubOperation();
			System.out.println(anOperation);
		}
		System.out.println("十道混合算式:");
		for (int i = 0; i < 10; i++) {
			anOperation=opCreater.generateBinaryOperation();
			System.out.println(anOperation);
		}
	}

}
