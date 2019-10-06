import static org.junit.Assert.*;

import org.junit.Test;

public class PowerDigitTest {

	@Test
	public void test() {
		PowerDigit pw=new PowerDigit();
		assertEquals(32, pw.Power(2, 5));
	}

}
