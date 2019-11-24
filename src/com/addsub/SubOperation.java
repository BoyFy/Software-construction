package com.addsub;

public class SubOperation extends BinaryOperation_1_1{
	SubOperation(){
		generateBinaryOperation(0);
	}
	int calculate(int left,int right) {//两数相减结果
		return left-right;
	}
	boolean checking(int value) {//检查两数相减是否小于0
		return value<down;
	}
}
