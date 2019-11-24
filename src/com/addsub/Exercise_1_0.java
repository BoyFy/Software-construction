package com.addsub;

import java.util.HashSet;
import java.util.Set;

public class Exercise_1_0 {
	private BinaryOperation_1_0[] Formula=new BinaryOperation_1_0[50];
	Set<Object> set=new HashSet<Object>();//����set����������ȥ��
	//���ɼӼ����������ʽ
	public void generateBinaryExercise() {
		BinaryOperation_1_0 anOperation,opCreator=new BinaryOperation_1_0();
		for (int i = 0; i < Formula.length; i++) {
			anOperation=opCreator.generateBinaryOperation();
			Formula[i]=anOperation;
			/*
			 * ��ÿ�ηŽ������ֵ����set�����У�
			 *������ظ���ȥ����ν����
			 */
			set.add(Formula[i]);
			if(set.size()!=i+1) {
				i--;
			}
		}
		set.clear();//�ͷ�set����Ԫ��
	}
	//���ɼӷ���ʽ
	public void generateAddExercise() {
		BinaryOperation_1_0 anOperation,opCreator=new BinaryOperation_1_0();
		for (int i = 0; i < Formula.length; i++) {
			anOperation=opCreator.generateAddOperation();
			Formula[i]=anOperation;
			set.add(Formula[i]);
			if(set.size()!=i+1) {
				i--;
			}
		}
		set.clear();
	}
	//���ɼ�����ʽ
	public void generateSubExercise() {
		BinaryOperation_1_0 anOperation,opCreator=new BinaryOperation_1_0();
		for (int i = 0; i < Formula.length; i++) {
			anOperation=opCreator.generateSubOperation();
			Formula[i]=anOperation;
			set.add(Formula[i]);
			if(set.size()!=i+1) {
				i--;
			}
		}	
		set.clear();
	}
	void formateAndDisplay() {
		for (int i = 0; i < Formula.length; i++) {
			System.out.print(Formula[i]+"\t");
			if((i+1)%6==0) {
				System.out.println();
			}
		}
	}
}
