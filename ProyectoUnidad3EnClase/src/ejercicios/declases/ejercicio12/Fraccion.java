package ejercicios.declases.ejercicio12;

import java.util.Scanner;

public class Fraccion {

	private int numerador;
	private int denominador;

	public Fraccion() {

	}

	public Fraccion(int numerador, int denominador) {
		super();
		this.numerador = numerador;
		this.denominador = denominador;
	}

	public int getNumerador() {
		return numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;

	}

	public int calcularMCD(int a, int b) {
		int max, min, temp;//

		max = a >= b ? a : b;
		min = a < b ? a : b;

		while (min > 0) {
			temp = min;
			min = max % min;
			a = temp;
		}
		return a;
	}

	public void simplificarFraccion(Fraccion f) {

		int divisor = calcularMCD(f.getNumerador(), f.getDenominador());

		f.setDenominador(f.getDenominador() / divisor);
		f.setNumerador(f.getNumerador() / divisor);

	}

	public void simplificarFraccion() {

		int divisor = calcularMCD(numerador, denominador);

		denominador = denominador / divisor;
		numerador = numerador / divisor;

	}

	public Fraccion LeerFraccionFuncion() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el numerador de la fraccion:");

		int numerador = sc.nextInt();

		System.out.println("Introduce el denominador de la fraccion:");

		int denominador = sc.nextInt();

		Fraccion fRes = new Fraccion(numerador, denominador);

		fRes.simplificarFraccion();

		return fRes;

	}

	public void LeerFraccion() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el numerador de la fraccion:");

		numerador = sc.nextInt();

		System.out.println("Introduce el denominador de la fraccion:");

		denominador = sc.nextInt();

		simplificarFraccion();

	}

	public void escribirFraccion() {

		System.out.println(numerador + "/" + denominador);

	}

	public Fraccion sumarFracciones(Fraccion f1, Fraccion f2) {

		int nuevoNumerador = f1.getNumerador() * f2.getDenominador() + f2.getNumerador() * f1.getDenominador();

		int nuevoDenominador = f1.getDenominador() * f2.getDenominador();

		Fraccion resultado = new Fraccion(nuevoNumerador, nuevoDenominador);

		resultado.simplificarFraccion();
		return resultado;

	}

	@Override
	public String toString() {
		return "Fraccion [numerador=" + numerador + ", denominador=" + denominador + "]";
	}

}
