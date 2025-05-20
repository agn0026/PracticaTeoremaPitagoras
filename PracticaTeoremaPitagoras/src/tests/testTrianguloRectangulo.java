package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import clases.TrianguloRectangulo;

class testTrianguloRectangulo {
	static TrianguloRectangulo tr1;
	static TrianguloRectangulo tr2;
	
	@BeforeAll
	static void setup() {
		tr1 = new TrianguloRectangulo ();
		tr2 = new TrianguloRectangulo (2,4);
	}

	@Test
	void testArea() {
		double areaObtenida = Math.round(tr1.area()*100)/100;
		double areaEsperada = Math.round(0.5*100)/100;
		assertEquals(areaEsperada, areaObtenida);
	}

	@Test
	void testHipotenusa() {
		double hipObtenida = Math.round(tr1.hipotenusa()*100)/100;
		double hipEsperada = Math.round(1.41*100)/100;
		assertEquals(hipEsperada, hipObtenida);
	}
	
	@Test
	void testPerimetro() {
		double periObtenida = Math.round(tr1.perimetro()*100)/100;
		double periEsperada = Math.round(3.414*100)/100;
		assertEquals(periEsperada, periObtenida);
	}

	@Test
	void testPerimetro2() {
		double periObtenida = Math.round(tr2.perimetro()*100)/100;
		double periEsperada = Math.round(10.47*100)/100;
		assertEquals(periEsperada, periObtenida);
	}
	
	@Test
	void testArea2() {
		double areaObtenida = Math.round(tr2.area()*100)/100;
		double areaEsperada = Math.round(4.0*100)/100;
		assertEquals(areaEsperada, areaObtenida);
	}

	@Test
	void testHipotenusa2() {
		double hipObtenida = Math.round(tr2.hipotenusa()*100)/100;
		double hipEsperada = Math.round(4.42*100)/100;
		assertEquals(hipEsperada, hipObtenida);
	}
	
	@Test
	void testException() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> new TrianguloRectangulo (2,-1));
		String mensajeEsperado = "Los valores no pueden ser igual o inferior a 0";
		String mensajeObtenido = exception.getMessage();
		assertEquals(mensajeEsperado, mensajeObtenido);
	}                     

}
