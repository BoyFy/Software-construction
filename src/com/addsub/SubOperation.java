package com.addsub;

public class SubOperation extends BinaryOperation_1_1{
	SubOperation(){
		generateBinaryOperation(0);
	}
	int calculate(int left,int right) {
		return left-right;
	}
	boolean checking(int value) {
		return value<down;
	}
}
