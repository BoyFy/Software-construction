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
	//�������󷽷������ɽ������������ȷ��
	abstract int calculate(int left,int right);
	abstract boolean checking(int value);
	//fgΪ1���ɼӷ���ʽ��fgΪ���������ɼ�����ʽ
	protected void generateBinaryOperation(int fg) {
		int left,right,value;
		Random random=new Random();
		left=random.nextInt(up+1);
		do {
			right=random.nextInt(up+1);
			value=calculate(left, right);
		}while(checking(value));//do...while��䱣֤�������С��100���������0
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
	//��дtoString����
	public String toString() {
		return ""+left_operand+operator+right_operand+"=";
	}
}
