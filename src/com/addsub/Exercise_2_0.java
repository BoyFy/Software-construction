package com.addsub;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import com.csvreader.CsvWriter;



public class Exercise_2_0 {
	//利用ArryList动态数组封装成Exercise的私有成员
	private ArrayList<BinaryOperation_2_0> operationList=new ArrayList<BinaryOperation_2_0>();
	Set<Object> set=new HashSet<Object>();//定义set集合来进行去重
	public void generateBinaryExercise(int operationCount) {
		operationList.clear();//每次生成计算题时把之前的计算题清空
		BinaryOperation_2_0 anOperation;
		for (int i = 0; i < operationCount; i++) {
			anOperation=genBinaryOperation();
			operationList.add(anOperation);
			set.add(operationList.get(i));//把operationList中的值加入set元素中
			if(set.size()!=i+1) {
				i--;
			}
		}
		set.clear();//清空set集合
	}
	private BinaryOperation_2_0 genBinaryOperation() {//辅助生成混合计算题
		Random random=new Random();
		int flag=random.nextInt(2);
		if(flag==1)
			return new AddOperation();
		else
			return new SubOperation();
	}
	public void generateAddExercise(int operationCount) {//生成加法计算题
		operationList.clear();
		BinaryOperation_2_0 anOperation;
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
	public void generateSubExercise(int operationCount) {//生成减法计算题
		operationList.clear();
		BinaryOperation_2_0 anOperation;
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
	public void add(BinaryOperation_2_0 anOperation){
		operationList.add(anOperation);
	}
	public void writeCSVAddExercise(int operationCount) {
		File exerciseFile=new File("C:\\","Add_exercise_"+operationCount+".csv");
		try {
			exerciseFile.createNewFile();
			String pathCSVWrite = "C:\\Add_exercise_"+operationCount+".csv";
			CsvWriter csvWriter = new CsvWriter(pathCSVWrite,',',Charset.forName("gb2312"));
			for (int i = 0; i < operationList.size(); i++) {
				String csvContent=operationList.get(i).toString();
				csvWriter.write(csvContent);
			}
			csvWriter.flush();
			csvWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void writeCSVSubExercise(int operationCount) {
		File exerciseFile=new File("C:\\","Sub_exercise_"+operationCount+".csv");
		try {
			exerciseFile.createNewFile();
			String pathCSVWrite = "C:\\Sub_exercise_"+operationCount+".csv";
			CsvWriter csvWriter = new CsvWriter(pathCSVWrite,',',Charset.forName("gb2312"));
			for (int i = 0; i < operationList.size(); i++) {
				String csvContent=operationList.get(i).toString();
				csvWriter.write(csvContent);
			}
			csvWriter.flush();
			csvWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void writeCSVBinaryExercise(int operationCount) {
		File exerciseFile=new File("C:\\","Binary_exercise_"+operationCount+".csv");
		try {
			exerciseFile.createNewFile();
			String pathCSVWrite = "C:\\Binary_exercise_"+operationCount+".csv";
			CsvWriter csvWriter = new CsvWriter(pathCSVWrite,',',Charset.forName("gb2312"));
			for (int i = 0; i < operationList.size(); i++) {
				String csvContent=operationList.get(i).toString();
				csvWriter.write(csvContent);
			}
			csvWriter.flush();
			csvWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public Exercise_2_0 readCSVExercise(File aFile) {
		Exercise_2_0 exercise=new Exercise_2_0();
		String eqString;
		BinaryOperation_2_0 op;
		try {
			Scanner sc=new Scanner(aFile);
			sc.useDelimiter(",");
			while(sc.hasNext()) {
				eqString=sc.next().replace("\\s", "");
				op=new AddOperation();
				op.unsafeConstructor(eqString);
				exercise.add(op);
			}
		} catch (IOException e) { 
			e.printStackTrace();
		}
		return exercise;
	}
	public void writeCsvResult(File aFile) {
		BinaryOperation_2_0 op;
		try {
			aFile.createNewFile();
			String pathCSVWrite = "C:\\Add_Result.csv";
			CsvWriter csvWriter = new CsvWriter(pathCSVWrite,',',Charset.forName("gb2312"));
			for (int i = 0; i < operationList.size(); i++) {
				op=operationList.get(i);	
				csvWriter.write(op.getResult()+"");
			}
			csvWriter.flush();
			csvWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	void formateAndDisplay(int columns) {
		for (int i = 0; i < operationList.size(); i++) {
			System.out.print((i+1)+"."+"  ");
			System.out.print(operationList.get(i)+"\t");
			if((i+1)%columns==0) {
				System.out.println();
			}
		}
	}
}
