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
	//�ԼӼ������м���
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
	//���ɼӷ���ʽ
	public BinaryOperation_1_0 generateAddOperation() {
		Random random=new Random();
		int left,right,value;
		left=random.nextInt(up+1);//left��ߵ���ȡ100���ڵ������
		do {
			right=random.nextInt(up+1);//ʹ��do...while�������֮�ͽ����ж�
			value=left+right;
		}while(value>100);
		BinaryOperation_1_0 op=new BinaryOperation_1_0();
		op.construct(left, right, 1);
		return op;
	}
	//���ɼ�����ʽ
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
	//���ɻ����ʽ
	public BinaryOperation_1_0 generateBinaryOperation() {
		Random random=new Random();	
		BinaryOperation_1_0 op=new BinaryOperation_1_0();
		flag=random.nextInt(down+2);
		//flagΪ1ʱ����ȡ�ӷ��ķ������������ȡ�����ķ���
		if(flag==1) {
			op.generateAddOperation();
		}else {
			op.generateSubOperation();
		}
		return op;
	}
	//����ֵ
	public String toString() {
		return ""+left_operand+operator+right_operand+"=";
	}
}
