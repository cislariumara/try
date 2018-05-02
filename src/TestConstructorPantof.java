import static org.junit.Assert.*;

import org.junit.Test;

public class TestConstructorPantof {

	@Test
	public void testRight() {
		try {
			Pantof p=new Pantof("Ana Cori", 10, ECuloare.ROSU, 429);
			//se vor verifica toate valorile
			assertEquals("verif denumire", "Ana Cori",p.getDenProdus());
			assertEquals("verif cantitate", 10,p.getCantitate());
			assertEquals("verif culoare", ECuloare.ROSU,p.getCuloare());
			//pret este float trebuie folosit si un epsilon=0.01 noi alegem valoarea lui
			assertEquals("verif pret", 429,p.getPret(),0.01);
		} catch (ExceptieConstructorPantof e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(false);
		}
	}
	
	@Test
	public void testException() {
		try {
			Pantof p=new Pantof("Ana Cori", -10, ECuloare.ROSU, 429);
			assertTrue(false);
		} catch (ExceptieConstructorPantof e) {
			// TODO Auto-generated catch block
			//metoda trebuie sa arunce exceptie asa ca daca sunt aici trebuie sa returneze true
			e.printStackTrace();
			assertTrue(true);
		}
	}
	
	@Test
	public void testExistence() {
		try {
			Pantof p=new Pantof("Ana Cori", 10, ECuloare.ROSU, 429);
			//verific daca obiectul a fost creat
			assertNotNull(p);
		} catch (ExceptieConstructorPantof e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(false);
		}
	}
	
	@Test(timeout=10)
	public void testPerformance() throws ExceptieConstructorPantof {
		Pantof p=new Pantof("Ana Cori", 10, ECuloare.ROSU, 429);
	}

}
