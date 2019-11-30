package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.addsub.AddOperation;
import com.addsub.BinaryOperation_1_1;
import com.addsub.SubOperation;

public class BinaryOperation_1_1Test {
	BinaryOperation_1_1 aop;
	BinaryOperation_1_1 sop;
	Class<BinaryOperation_1_1> cla=BinaryOperation_1_1.class;
	
	@Before
	public void setUp() throws Exception {
		aop = new AddOperation();
		sop = new SubOperation();
	}
	
	@Test
	public void testCalculate1() {
		assertEquals(aop.calculate(2, 2), 4);
	}
	
	@Test
	public void testCalculate2() {
		assertEquals(sop.calculate(3,2), 1);
	}
	
	@Test
	public void testChecking1() {
		assertEquals(aop.checking(50), false);
	}

	@Test
	public void testChecking2() {
		assertEquals(sop.checking(-2), true);
	}
	@Test
	public void testGenerateBinaryOperation() {
		System.out.println("加法习题为：");
		for (int i = 0; i < 10; i++) {
			aop=new AddOperation();
			System.out.println(aop);
		}
		System.out.println("减法习题为：");
		for (int i = 0; i < 10; i++) {
			aop=new SubOperation();
			System.out.println(aop);
		}
	}
}
