package com.addsub;

public class SubOperation extends BinaryOperation_1_1{
	public SubOperation(){
		generateBinaryOperation(0);
	}
	public int calculate(int left,int right) {//����������
		return left-right;
	}
    public	boolean checking(int value) {//�����������Ƿ�С��0
		return value<down;
	}
}
