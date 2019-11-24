package com.addsub;

public class AddOperation extends BinaryOperation_1_1{
	public AddOperation() {
		generateBinaryOperation(1);
	}
	int calculate(int left,int right) {
		return left+right;
	}
	boolean checking(int value) {
		return value>up;
	}
}
