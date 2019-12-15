package test;

import java.util.ArrayList;

import com.addsub.Judge;

public class JudgeTest {
	public static void main(String[] args) {
		Judge jd=new Judge();
		ArrayList<String[]> result=new ArrayList<String[]>();
		ArrayList<String[]> answer=new ArrayList<String[]>();
		result=jd.getResult("C:\\Practice_50.csv");
		answer=jd.getResult("C:\\Add_Result.csv");
		jd.evaluate(answer, result);
		jd.CheckResult();
	}
}