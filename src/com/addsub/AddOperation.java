package com.addsub;

public class AddOperation extends BinaryOperation_2_0{
	public AddOperation() {
		generateBinaryOperation(1);
	}
	public int calculate(int left,int right) {//加法两数相加
		return left+right;
	}
	public boolean checking(int value) {//检查两数相加结果是否大于100
		return value>up;
	}
}
