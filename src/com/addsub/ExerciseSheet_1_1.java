package com.addsub;

public class ExerciseSheet_1_1 {
	public static void main(String[] args) {
		Exercise_1_1 anExercise=new Exercise_1_1();
		System.out.println("50���ӷ�ϰ��");
		anExercise.generateAddExercise(50);
		anExercise.formateAndDisplay(5);
		System.out.println("50������ϰ��");
		anExercise.generateSubExercise(50);
		anExercise.formateAndDisplay(5);
		System.out.println("50���������ϰ��");
		anExercise.generateBinaryExercise(50);
		anExercise.formateAndDisplay(5);
	}
}
