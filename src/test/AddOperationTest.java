package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.addsub.AddOperation;
import com.addsub.BinaryOperation_2_0;

public class AddOperationTest {
	BinaryOperation_2_0 aop;
	@Before
	public void setUp() throws Exception {
		aop = new AddOperation();
	}
	@Test
	public void testCalculate() {
		assertEquals(aop.calculate(3, 1), 4);
	}

	@Test
	public void testChecking() {
		assertEquals(aop.checking(35), false);
	}

}
