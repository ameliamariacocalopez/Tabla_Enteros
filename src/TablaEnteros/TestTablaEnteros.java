package TablaEnteros;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestTablaEnteros {
	
	TablaEnteros tabla;
	Integer[]arrayNums = new Integer [4];

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		arrayNums[0]= 10;
		arrayNums[1]= 20;
		arrayNums[2]= 30;
		arrayNums[3]= 40;
		tabla = new TablaEnteros (arrayNums);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testTablaEnterosNull() {
		Integer []arrayNull = new Integer [0];
		assertThrows(IllegalArgumentException.class,() ->new TablaEnteros(arrayNull));
	}
	//Da un fallo lógico, porque aunque esta bien hecha la clase no tiene un toString
	@Test
	void testTablaEnteros() {
		assertEquals(arrayNums, new TablaEnteros(arrayNums));
	}
	@Test
	void testSumaTabla() {
		int suma = 10;
		assertEquals(suma, tabla.sumaTabla());
	}
	@Test
	void testMayorTabla1() {
		int max = -999;
		Integer [] arrayNums2 = new Integer[3];
		arrayNums2[0] = -2000;
		arrayNums2[1] = -3000;
		arrayNums2[2] = -4000;
		
		TablaEnteros tabla2 = new TablaEnteros(arrayNums2);
		assertEquals(max, tabla2.mayorTabla());
	}
	@Test
	void testMayorTabla2() {
		assertEquals(40, tabla.mayorTabla());
	}

	@Test
	void testPosicionTabla1() {
		assertEquals(3, tabla.posicionTabla(40));
	}
	@Test
	void testPosicionTablaNull() {
		assertThrows(NoSuchElementException.class,() -> tabla.posicionTabla(200));
	}

}
