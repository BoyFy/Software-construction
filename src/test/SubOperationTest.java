package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.addsub.BinaryOperation_1_1;
import com.addsub.SubOperation;

public class SubOperationTest {
	BinaryOperation_1_1 sop;
	@Before
	public void setUp() throws Exception {
		sop = new SubOperation();
	}
	@Test
	public void testCalculate() {
		assertEquals(sop.calculate(3, 1), 2);
	}

	@Test
	public void testChecking() {
		assertEquals(sop.checking(35), false);
	}


}
