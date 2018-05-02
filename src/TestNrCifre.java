import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TestNrCifre {

	@Test
	public void testRight() {
		try {
			int actualValue = CTSMath.nrCifre(65);
			int expectedValue = 2;
			assertEquals("verif nr cifre",expectedValue, actualValue);
		} catch (ExceptionNrCifre e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(false);
		}
	}
	
	@Test
	public void testException() {
		try {
			int value = CTSMath.nrCifre(-452);
			assertTrue(false);
		} catch (ExceptionNrCifre e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(true);
		}
	}
	
	@Test
	public void testExistence() {
		try {
			int actualValue = CTSMath.nrCifre(65);
			//verific daca e diferit de 0. orice int este diferit de null
			//daca putea sa fie rezultatul 0 nu ma ajuta asa ca o sa pun ceea ce ma astept sa nu fie
			assertNotEquals("verfi ca rezultatul este diferit de 0", 0,actualValue);
		} catch (ExceptionNrCifre e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(false);
		}
	}
	
	@Test
	public void testLimiteExtremeMin() {
		try {
			int actualValue = CTSMath.nrCifre(0);
			assertEquals("verif si pentru cel mai mic nr", 1,actualValue);;
		} catch (ExceptionNrCifre e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(false);
		}
	}
	
	@Test
	public void testLimiteExtremeMax() { //boundry se numesc limitele extreme
		try {
			int actualValue = CTSMath.nrCifre(Integer.MAX_VALUE);
			//System.out.println(Integer.MAX_VALUE); l-am pus ca sa vedem cate cifre are max int
			assertEquals("verif si pentru cel mai mare nr", 10,actualValue);;
		} catch (ExceptionNrCifre e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(false);
		}
	}
	
	@Test
	public void testInverseRelationship() {
		try {
			//pun o stare initiala, apoi modific si verific ca nu mai e valoarea care era inainte
			int actualValue = 0;
			actualValue = CTSMath.nrCifre(134);
			assertNotEquals("nu mai este 0", 0,actualValue);
		} catch (ExceptionNrCifre e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(false);
		}
	}
	
	public static int nrCifreMetodaReferinta(int nr) {
		if(nr==0) return 1;
		else {
		int nrCifre=0;
		while(nr!=0) {
			nrCifre++;
			nr=nr/10;
		}
		return nrCifre;}
	}
	
	@Category(SlowTest.class)
	@Test
	public void testCrossCheck() {
		int nr=564;
		try {
			int actualValue=CTSMath.nrCifre(nr);
			int expectedValue=TestNrCifre.nrCifreMetodaReferinta(nr);
			assertEquals("verif daca ambele metode returneaza acelasi lucru", expectedValue,actualValue);
		} catch (ExceptionNrCifre e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(false);
		}
	}
}
