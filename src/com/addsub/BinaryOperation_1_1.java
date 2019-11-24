package com.addsub;

import java.util.Random;

public abstract class BinaryOperation_1_1 {
	static final int up=100;
	static final int down=0;
	private char operator='+';
	private int left_operand,right_operand;
	private int result; 
	static int flag=1;
	public int getLeftOperand() {
		return left_operand;
	}
	public int getRightOperand() {
		return right_operand;
	}
	public char getOperation() {
		return operator;
	}
	public int getResult() {
		return result;
	}
	//两个抽象方法，生成结果与检查输入正确性
	abstract int calculate(int left,int right);
	abstract boolean checking(int value);
	//fg为1生成加法算式，fg为其他数生成减法算式
	protected void generateBinaryOperation(int fg) {
		int left,right,value;
		Random random=new Random();
		left=random.nextInt(up+1);
		do {
			right=random.nextInt(up+1);
			value=calculate(left, right);
		}while(checking(value));//do...while语句保证两数相加小于100，相减大于0
		if(fg==1) {
			operator='+';
		}
		else {
			operator='-';
		}
		left_operand=left;
		right_operand=right;
		result=value;
	}
	//重写toString方法
	public String toString() {
		return ""+left_operand+operator+right_operand+"=";
	}
}
