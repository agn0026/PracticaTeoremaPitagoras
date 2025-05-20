package app;

import clases.TrianguloRectangulo;

public class Principal {

	public static void main(String[] args) {
		TrianguloRectangulo tr1 = new TrianguloRectangulo(2, 4);
		TrianguloRectangulo tr2 = new TrianguloRectangulo();
		
		double area1 = tr1.area();
		double perimetro1 = tr1.perimetro();
		
		double area2 = tr2.area();
		double perimetro2 = tr2.perimetro();
		
 
	}

}
