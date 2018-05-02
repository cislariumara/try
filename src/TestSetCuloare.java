import static org.junit.Assert.*;

import org.junit.Test;

public class TestSetCuloare {

	@Test
	public void testInverse() {
		try {
			Pantof p=new Pantof("Ana Cori", 10, ECuloare.ROSU, 429);
			p.setCuloare(ECuloare.NEGRU);
			assertNotEquals(ECuloare.ALB, p.getCuloare());
			assertNotEquals(ECuloare.ROSU, p.getCuloare());
			assertNotEquals(ECuloare.VERDE, p.getCuloare());
		} catch (ExceptieConstructorPantof e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(false);
		}
	}

}
