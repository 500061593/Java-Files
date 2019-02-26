package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClassSumTest {

	@Test
	public void TestSum() {
		ClassSum ob =new ClassSum();
		assertEquals(9,ob.getSum(3,6));
	}

}
