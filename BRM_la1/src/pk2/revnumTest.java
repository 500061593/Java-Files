package pk2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class revnumTest {

	@Test
	public void revnumTest() {
		revnum ob=new revnum();
		assertEquals(123,ob.rev(321));
	}

}
