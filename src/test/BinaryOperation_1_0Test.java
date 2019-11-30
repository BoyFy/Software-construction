package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.addsub.BinaryOperation_1_0;

public class BinaryOperation_1_0Test {
	BinaryOperation_1_0 bo;
	@Before
	public void setUp() throws Exception {
		bo=new BinaryOperation_1_0();
	}
	BinaryOperation_1_0 bo2=new BinaryOperation_1_0();
	@Test
	public void testconstruct1(){
		bo.construct(34, 49, 1);
		assertEquals(bo.getResult(),83);
	}
	@Test
	public void testconstruct2() {
		bo.construct(90, 50, 1);
		assertEquals(bo.getResult(),140);
	}
	@Test
	public void testconstruct3() {
		bo.construct(-1, 50, 1);
		assertEquals(bo.getResult(),49);
	}
	@Test
	public void testconstruct4() {
		bo.construct(1, -1, 1);
		assertEquals(bo.getResult(),0);
	}
	@Test
	public void testconstruct5() {
		bo.construct(-1, -1, 1);
		assertEquals(bo.getResult(),-2);
	}
	@Test
	public void testconstruct6() {
		bo.construct(39, 49, 0);
		assertEquals(bo.getResult(),-10);
	}
	@Test
	public void testconstruct7() {
		bo.construct(90, 50, 0);
		assertEquals(bo.getResult(),40);
	}
	@Test
	public void testconstruct8() {
		bo.construct(-1, 50, 0);
		assertEquals(bo.getResult(),-51);
	}
	@Test
	public void testconstruct9() {
		bo.construct(1, -1, 0);
		assertEquals(bo.getResult(),2);
	}
	@Test
	public void testconstruct10() {
		bo.construct(-1, -1, 0);
		assertEquals(bo.getResult(),0);
	}
	@Test
	public void testconstruct11() {
		bo.construct(1, 1, 23);
		assertEquals(bo.getResult(),0);
	}
	@Test
	public void testGenerateAddOperation() {
		System.out.println("生成十道加法习题测试");
		for (int i = 0; i < 10; i++) {
			System.out.print(bo.generateAddOperation()+"\t");
			if((i+1)%5==0) {
				System.out.println();
			}
		}
	}
	@Test
	public void testGenerateSubOperation() {
		System.out.println("生成十道减法习题测试");
		for (int i = 0; i < 10; i++) {
			System.out.print(bo.generateSubOperation()+"\t");
			if((i+1)%5==0) {
				System.out.println();
			}
		}
	}
	@Test
	public void testGenerateBinaryOperation() {
		System.out.println("生成十道混合运算习题测试");
		for (int i = 0; i < 10; i++) {
			System.out.print(bo.generateBinaryOperation()+"\t");
			if((i+1)%5==0) {
				System.out.println();
			}
		}
	}
	@Test
	public void testToString() {
		bo.construct(45,30,1);
		assertEquals(bo.toString(),"45+30=");
	}

}
