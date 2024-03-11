package operaciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testSuma() {
		Calculadora cal= new Calculadora(20,10);
		int result=cal.suma();
		assertEquals(30,result);
	}

	@Test
	void testResta() {
		Calculadora cal= new Calculadora(20,10);
		int result=cal.resta();
		assertEquals(10,result);
	}

	@Test
	void testResta2() {
		Calculadora cal= new Calculadora(20,10);
		boolean result=cal.resta2();
		assertTrue(result);
	}
	
	@Test
	void testResta2_1() {
		Calculadora cal= new Calculadora(10,20);
		boolean result=cal.resta2();
		assertFalse(result);
	}

	@Test
	void testMultiplica() {
		Calculadora cal= new Calculadora(20,10);
		int result=cal.multiplica();
		assertEquals(200,result);
	}

	@Test
	void testDivide() {
		Calculadora cal= new Calculadora(20,10);
		int result=cal.divide();
		assertEquals(2,result);
	}

	@Test
	void testDivide2() {
		Calculadora cal= new Calculadora(20,10);
		int result=cal.divide2();
		assertEquals(2,result);
	}
	
	@Test
	void testDivide2_1() {
		Calculadora cal= new Calculadora(0,20);
		Integer result=cal.divide2();
		assertNull(result);
	}

}
