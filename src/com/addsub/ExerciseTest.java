package com.addsub;

public class ExerciseTest {
	public static void main(String[] args) {
		Exercise_1_0 anExerciseTest=new Exercise_1_0();
		System.out.println("��ʮ���ӷ�����:");
		anExerciseTest.generateAddExercise();
		anExerciseTest.formateAndDisplay();
		System.out.println("\n"+"��ʮ����������:");
		anExerciseTest.generateSubExercise();
		anExerciseTest.formateAndDisplay();
		System.out.println("\n"+"��ʮ��ϼ���:");
		anExerciseTest.generateBinaryExercise();
		anExerciseTest.formateAndDisplay();
	}
}
