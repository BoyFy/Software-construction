package com.addsub;

import java.util.Random;

public class BinaryOperation_1_0 {                    
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
	//对加减法进行计算
	private void construct(int left,int right,int fg) {
		left_operand=left;
		right_operand=right;
		flag=fg;
		if(flag==1) {
			operator='+';
			result=left+right;
		}else {
			operator='-';
			result=left-right;
		}
	}
	//生成加法算式
	public BinaryOperation_1_0 generateAddOperation() {
		Random random=new Random();
		int left,right,value;
		left=random.nextInt(up+1);//left左边的数取100以内的随机数
		do {
			right=random.nextInt(up+1);//使用do...while语句对相加之和进行判断
			value=left+right;
		}while(value>100);
		BinaryOperation_1_0 op=new BinaryOperation_1_0();
		op.construct(left, right, 1);
		return op;
	}
	//生成减法算式
	public BinaryOperation_1_0 generateSubOperation() {
		Random random=new Random();
		int left,right,value;
		left=random.nextInt(up+1);
		do {
			right=random.nextInt(up+1);
			value=left-right;
		}while(value<0);
		BinaryOperation_1_0 op=new BinaryOperation_1_0();
		op.construct(left, right, 0);
		return op;
	}
	//生成混合算式
	public BinaryOperation_1_0 generateBinaryOperation() {
		Random random=new Random();	
		BinaryOperation_1_0 op=new BinaryOperation_1_0();
		flag=random.nextInt(down+2);
		//flag为1时调用取加法的方法，否则调用取减法的方法
		if(flag==1) {
			op.generateAddOperation();
		}else {
			op.generateSubOperation();
		}
		return op;
	}
	//返回值
	public String toString() {
		return ""+left_operand+operator+right_operand+"=";
	}
}
