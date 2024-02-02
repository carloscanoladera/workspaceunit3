package ejercicios.declases.ejericicio29;

import java.util.Objects;

public class Fraccion extends Numerica {

	private int numerador;
	private int denominador;

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

	@Override
	public Numerica sumar(Numerica numero) {
		// TODO Auto-generated method stub

		Fraccion fparam = (Fraccion) numero;

		return null;
	}

	@Override
	public Numerica restar(Numerica numero) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Numerica multiplicar(Numerica numero) {
		// TODO Auto-generated method stub

		Fraccion fparam = (Fraccion) numero;

		Fraccion resultado = new Fraccion(this.numerador * fparam.getNumerador(),
				this.numerador * fparam.getDenominador());

		return resultado;
	}

	@Override
	public Numerica dividir(Numerica numero) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "Fraccion [numerador=" + numerador + ", denominador=" + denominador + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(denominador, numerador);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fraccion other = (Fraccion) obj;
		return denominador == other.denominador && numerador == other.numerador;
	}

}
