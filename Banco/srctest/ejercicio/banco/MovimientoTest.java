package ejercicio.banco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MovimientoTest {
	
	final int IMPORTE_1 = 100;
	final String CONCEPTO_1 ="Esto es un String";
	
	Movimiento mov;
	@BeforeEach
	void creacion() {
		mov = new Movimiento();
	}

	@Test
	void testMovimiento() {
		fail("Not yet implemented");
	}

	@Test
	void testGetConcepto() {
		mov.setConcepto(CONCEPTO_1);
		assertEquals(CONCEPTO_1,mov.getConcepto());
	}

	@Test
	void testGetFecha() {
		fail("Not yet implemented");
	}

	@Test
	void testGetImporte() {
		mov.setImporte(IMPORTE_1);
		assertEquals(IMPORTE_1,mov.getImporte());
	}

	@Test
	void testSetConcepto() {
		fail("Not yet implemented");
	}

	@Test
	void testSetFecha() {
		fail("Not yet implemented");
	}

	@Test
	void testSetImporte() {
		fail("Not yet implemented");
	}

}
