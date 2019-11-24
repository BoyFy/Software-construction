package com.addsub;

public class ExerciseSheet_1_1 {
	public static void main(String[] args) {
		Exercise_1_1 anExercise=new Exercise_1_1();
		System.out.println("50道加法习题");
		anExercise.generateAddExercise(50);
		anExercise.formateAndDisplay(5);
		System.out.println("50道减法习题");
		anExercise.generateSubExercise(50);
		anExercise.formateAndDisplay(5);
		System.out.println("50道混合运算习题");
		anExercise.generateBinaryExercise(50);
		anExercise.formateAndDisplay(5);
	}
}
