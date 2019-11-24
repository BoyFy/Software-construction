package com.addsub;

import java.util.HashSet;
import java.util.Set;

public class Exercise_1_0 {
	private BinaryOperation_1_0[] Formula=new BinaryOperation_1_0[50];
	Set<Object> set=new HashSet<Object>();//定义set集合来进行去重
	//生成加减混合运算算式
	public void generateBinaryExercise() {
		BinaryOperation_1_0 anOperation,opCreator=new BinaryOperation_1_0();
		for (int i = 0; i < Formula.length; i++) {
			anOperation=opCreator.generateBinaryOperation();
			Formula[i]=anOperation;
			/*
			 * 把每次放进数组的值放入set集合中，
			 *如果有重复则去掉这次结果。
			 */
			set.add(Formula[i]);
			if(set.size()!=i+1) {
				i--;
			}
		}
		set.clear();//释放set集合元素
	}
	//生成加法算式
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
	//生成减法算式
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
