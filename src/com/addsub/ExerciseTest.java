package com.addsub;

public class ExerciseTest {
	public static void main(String[] args) {
		Exercise_1_0 anExerciseTest=new Exercise_1_0();
		System.out.println("五十道加法计算:");
		anExerciseTest.generateAddExercise();
		anExerciseTest.formateAndDisplay();
		System.out.println("\n"+"五十道减法计算:");
		anExerciseTest.generateSubExercise();
		anExerciseTest.formateAndDisplay();
		System.out.println("\n"+"五十混合计算:");
		anExerciseTest.generateBinaryExercise();
		anExerciseTest.formateAndDisplay();
	}
}
