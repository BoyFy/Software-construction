package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.addsub.Exercise_1_0;

public class Exercise_1_0Test {
	Exercise_1_0 anExerciseTest;
	@Before
	public void setUp() throws Exception {
		anExerciseTest=new Exercise_1_0();
	}

	@Test
	public void testGenerateBinaryExercise() {
		System.out.println("��ʮ��ϼ���:");
		anExerciseTest.generateBinaryExercise();
		anExerciseTest.formateAndDisplay();
	}

	@Test
	public void testGenerateAddExercise() {
		System.out.println("\n"+"��ʮ���ӷ�����:");
		anExerciseTest.generateAddExercise();
		anExerciseTest.formateAndDisplay();
	}

	@Test
	public void testGenerateSubExercise() {
		System.out.println("\n"+"��ʮ����������:");
		anExerciseTest.generateSubExercise();
		anExerciseTest.formateAndDisplay();
	}

}
