package com.addsub;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Scanner;

import com.csvreader.CsvWriter;

public class Practice {
	public static int num=50;
	private Integer myresult[]=new Integer[num]; 
	public void writeResult(){//����Ļ������ʽ���
		Scanner input=new Scanner(System.in);
		System.out.println("������Ĵ𰸣�(����д��д-1)");
		for (int i = 0; i < myresult.length; i++) {
			myresult[i]=input.nextInt();
		}
		System.out.println("���������");
		input.close();
	}
	public void writeCSVPractice(int operationCount) {//д����ʽ��д���ļ���
		try {
			String pathCSVWrite = "C:\\Practice_"+operationCount+".csv";
			CsvWriter csvWriter = new CsvWriter(pathCSVWrite,',',Charset.forName("gb2312"));
			for (int i = 0; i < myresult.length; i++) {
				csvWriter.write(myresult[i]+"");
			}
			csvWriter.flush();
			csvWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Exercise_2_0 Exercises=new Exercise_2_0();
		Practice exercises=new Practice();
		System.out.println("50���ӷ�ϰ��Ϊ:");
		Exercises.readCSVExercise(new File("C:\\Add_exercise_50.csv"));
		Exercises.formateAndDisplay(5);
		exercises.writeResult();
		exercises.writeCSVPractice(50);
	}
}
