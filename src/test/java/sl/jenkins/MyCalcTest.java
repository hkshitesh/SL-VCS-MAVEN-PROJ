package sl.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

import mypkg.MyCalc;

public class MyCalcTest {

	@Test
	public void test() {
		
		MyCalc calc = new MyCalc();
		
		assertEquals(40, calc.sum(30,10));
	}
}
