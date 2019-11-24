package com.addsub;

public class BinaryOperationTest {
	public static void main(String[] args) {
		BinaryOperation_1_0 anOperation,opCreater=new BinaryOperation_1_0();
		System.out.println("十道加法算式:");
		for (int i = 0; i < 10; i++) {
			anOperation=opCreater.generateAddOperation();
			System.out.print(anOperation+"\t");
			if((i+1)%5==0) {
				System.out.println();
			}
		}
		System.out.println("十道减法算式:");
		for (int i = 0; i < 10; i++) {
			anOperation=opCreater.generateSubOperation();
			System.out.print(anOperation+"\t");
			if((i+1)%5==0) {
				System.out.println();
			}
		}
		System.out.println("十道混合算式:");
		for (int i = 0; i < 10; i++) {
			anOperation=opCreater.generateBinaryOperation();
			System.out.print(anOperation+"\t");
			if((i+1)%5==0) {
				System.out.println();
			}
		}
	}

}
