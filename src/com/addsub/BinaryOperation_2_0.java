package com.addsub;

import java.util.Random;

public abstract class BinaryOperation_2_0 {
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
	public void unsafeConstructor(int left,int right,char symble) {
		left_operand=left;
		right_operand=right;
		operator=symble;
		if (symble=='+') {
			result=left+right;
		}else {
			result=left-right;
		}
	}
	public void unsafeConstructor(String eqString) {
		int length=eqString.length();
		int symblepo=eqString.indexOf("+");
		if(symblepo<=0)
			symblepo=eqString.indexOf("-");
		unsafeConstructor(Integer.parseInt(eqString.substring(0,symblepo)),
				Integer.parseInt(eqString.substring(symblepo+1,length-1)), eqString.charAt(symblepo));
	}
	//�������󷽷������ɽ������������ȷ��
	public abstract int calculate(int left,int right);
	public abstract boolean checking(int value);
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
