package com.addsub;

import java.io.File;

public class ExerciseSheet_1_1 {
	public static void main(String[] args) {
		Exercise_2_0 anExercise=new Exercise_2_0();
		Exercise_2_0 ex=new Exercise_2_0();
		System.out.println("50���ӷ�ϰ��:");
		anExercise.generateAddExercise(50);
		
		anExercise.writeCSVAddExercise(50);
		System.out.println("���ļ��ж�������");
	//	ex=anExercise.readCSVExercise(new File("C:\\Add_exercise_50.csv"));
		anExercise.formateAndDisplay(5);
		anExercise.writeCsvResult(new File("C:\\Add_Result.csv"));
		System.out.println("50������ϰ��:");
		anExercise.generateSubExercise(50);
		anExercise.writeCSVSubExercise(50);
		System.out.println("���ļ��ж�������");
		anExercise.readCSVExercise(new File("C:\\Sub_exercise_50.csv"));
		anExercise.formateAndDisplay(5);
		System.out.println("50���������ϰ��:");
		anExercise.generateBinaryExercise(50);
		anExercise.writeCSVBinaryExercise(50);
		System.out.println("���ļ��ж�������");
		anExercise.readCSVExercise(new File("C:\\Binary_exercise_50.csv"));
		anExercise.formateAndDisplay(5);
	}
}
