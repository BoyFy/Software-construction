package com.addsub;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Exercise_1_1 {
	//����ArryList��̬�����װ��Exercise��˽�г�Ա
	private ArrayList<BinaryOperation_1_1> operationList=new ArrayList<BinaryOperation_1_1>();
	Set<Object> set=new HashSet<Object>();//����set����������ȥ��
	public void generateBinaryExercise(int operationCount) {
		operationList.clear();//ÿ�����ɼ�����ʱ��֮ǰ�ļ��������
		BinaryOperation_1_1 anOperation;
		for (int i = 0; i < operationCount; i++) {
			anOperation=genBinaryOperation();
			operationList.add(anOperation);
			set.add(operationList.get(i));//��operationList�е�ֵ����setԪ����
			if(set.size()!=i+1) {
				i--;
			}
		}
		set.clear();//���set����
	}
	private BinaryOperation_1_1 genBinaryOperation() {//�������ɻ�ϼ�����
		Random random=new Random();
		int flag=random.nextInt(2);
		if(flag==1)
			return new AddOperation();
		else
			return new SubOperation();
	}
	public void generateAddExercise(int operationCount) {//���ɼӷ�������
		operationList.clear();
		BinaryOperation_1_1 anOperation;
		for (int i = 0; i < operationCount; i++) {
			anOperation=new AddOperation();
			operationList.add(anOperation);
			set.add(operationList.get(i));
			if(set.size()!=i+1) {
				i--;
			}
		}
		set.clear();
	}
	public void generateSubExercise(int operationCount) {//���ɼ���������
		operationList.clear();
		BinaryOperation_1_1 anOperation;
		for (int i = 0; i < operationCount; i++) {
			anOperation=new SubOperation();
			operationList.add(anOperation);
			set.add(operationList.get(i));
			if(set.size()!=i+1) {
				i--;
			}
		}
		set.clear();
	}
	void formateAndDisplay(int columns) {
		for (int i = 0; i < operationList.size(); i++) {
			System.out.print(operationList.get(i)+"\t");
			if((i+1)%columns==0) {
				System.out.println();
			}
		}
	}
}
