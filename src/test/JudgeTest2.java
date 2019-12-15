package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.addsub.Judge;

public class JudgeTest2 {
	Judge jd;
	ArrayList<String[]> result;
	ArrayList<String[]> answer;
	@Before
	public void setUp() throws Exception {
		jd=new Judge();
		result=new ArrayList<String[]>();
		answer=new ArrayList<String[]>();
	}

	@Test
	public void testEvaluate() {
		result=jd.getResult("C:\\Practice_50.csv");
		answer=jd.getResult("C:\\Add_Result.csv");
		jd.evaluate(answer, result);
	}

	@Test
	public void testGetResult() {
		result=jd.getResult("C:\\Practice_50.csv");
		answer=jd.getResult("C:\\Add_Result.csv");
	}

	@Test
	public void testCheckResult() {
		jd.CheckResult();
	}

}
