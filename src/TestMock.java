import static org.junit.Assert.*;

import org.junit.Test;

public class TestMock {

	@Test
	public void testRight1() {
		//testare cu produs care nu este la reducere
		ProdusMock prod = new ProdusMock();
		prod.setOnSale(false);
		prod.setPrice(120);
		
		float expectedValue=120;
		float actualValue  = CTSMath.getPretProdus(prod);
		assertEquals(expectedValue, actualValue,0.01);
		}

	@Test
	public void testRight2() {
		//testare cu produs care este la reducere cu pret <100
		ProdusMock prod = new ProdusMock();
		prod.setOnSale(true);
		prod.setPrice(80);
		
		float expectedValue=64;
		float actualValue  = CTSMath.getPretProdus(prod);
		assertEquals(expectedValue, actualValue,0.01);
		}
	
	@Test
	public void testRight3() {
		//testare cu produs care este la reducere cu pret <100
		ProdusMock prod = new ProdusMock();
		prod.setOnSale(true);
		prod.setPrice(120);
		
		float expectedValue=70;
		float actualValue  = CTSMath.getPretProdus(prod);
		assertEquals(expectedValue, actualValue,0.01);
		}
}
