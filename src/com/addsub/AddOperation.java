package com.addsub;

public class AddOperation extends BinaryOperation_1_1{
	public AddOperation() {
		generateBinaryOperation(1);
	}
	int calculate(int left,int right) {//�ӷ��������
		return left+right;
	}
	boolean checking(int value) {//���������ӽ���Ƿ����100
		return value>up;
	}
}
