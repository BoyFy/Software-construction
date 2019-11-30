package com.addsub;

public class SubOperation extends BinaryOperation_1_1{
	public SubOperation(){
		generateBinaryOperation(0);
	}
	public int calculate(int left,int right) {//两数相减结果
		return left-right;
	}
    public	boolean checking(int value) {//检查两数相减是否小于0
		return value<down;
	}
}
