package clases;

/**
 * Clase que implementa funciones sobre TrianguloRectangulo
 * 
 * @author Adrián
 */

public class TrianguloRectangulo {
	private double a;
	private double b;
	private double c;
	
	/**
	 * Crea un triangulo rectangulo con a y b igualados a 1. El valor de la hipotenusa se calcula automaticamente
	 */
	public TrianguloRectangulo() {
		this.a = 1;
		this.b = 1;
		this.c = hipotenusa();
	}
	
	/**
	 * Crea un triangulo rectangulo con a y b pasados por parametros. El valor de la hipotenusa se calcula automaticamente
	 * @param a
	 * @param b
	 * @throws IllegalArgumentException en caso de que a o b sea menor o igual a 0
	 */
	public TrianguloRectangulo(double a, double b) throws IllegalArgumentException {
		if (a <= 0 || b <= 0) {
			throw new IllegalArgumentException ("Los valores no pueden ser igual o inferior a 0");
		}else {
			this.a = a;
			this.b = b;
			this.c = hipotenusa();
		}
	}
	
	/**
	 * Calcula el area de un triangulo rectangulo
	 * @return el area en decimales
	 */
	public double area() {
		double area = (this.a*this.b)/2;
		return area;
	}
	
	/**
	 * Calcula la hipotenusa de un triangulo rectangulo
	 * @return la hipotenusa en decimales
	 */
	public double hipotenusa() {
		double hipotenusa = Math.sqrt((Math.pow(this.a, 2))+(Math.pow(this.b, 2)));
		double hipotenusa2 = Math.round(hipotenusa*100)/100;
		return hipotenusa2;
	}
	
	/**
	 * Calcula el perimetro de un triangulo rectangulo
	 * @return el perimetro en decimales 
	 */
	public double perimetro() {
		return (this.a+this.b+this.c);
	}
	
	public double getA() {
		return this.a;
	}
	
	public double getB() {
		return this.b;
	}
	
	public double getC() {
		return this.c;
	}
	
	@Override
	public String toString() {
		String mensaje = "";
		mensaje = "Cateto a: " + this.a;
		mensaje = "\n Cateto b: " + this.b;
		mensaje = "\n Hipotenusa: " + this.c;
		return mensaje;
	}
	
	
}
