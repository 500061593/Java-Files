package pk2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testcube {

	@Test
	void test() {
		cube ob=new cube();
		assertEquals(64,ob.cubic(4));
	}

}
