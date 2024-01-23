package ejercicios.declases;

public class CuentaBancaria {
// Atributo que define los nombres del titular de la cuenta bancaria
	String nombresTitular;
// Atributo que define los apellidos del titular de la cuenta bancaria
	String apellidosTitular;
// Atributo que define el número de la cuenta bancaria
	int númeroCuenta;

// Tipo de cuenta como un valor enumerado
	enum tipo {
		AHORROS, CORRIENTE
	}

// Atributo que define el tipo de cuenta bancaria
	tipo tipoCuenta;
	/*
	 * Atributo que define el saldo de la cuenta bancaria con valor inicial cero
	 */
	float saldo = 0;

	/**
	 * Constructor de la clase CuentaBancaria
	 * 
	 * @param nombresTitular   Parámetro que define los nombres del titular de una
	 *                         cuenta bancaria
	 * @param apellidosTitular Parámetro que define los apellidos del titular de una
	 *                         cuenta bancaria
	 * @param numeroCuenta     Parámetro que define el número de una cuenta bancaria
	 * @param tipoCuenta       Parámetro que define el tipo de una cuenta bancaria
	 *                         (puede ser ahorros o corriente)
	 */

	CuentaBancaria(String nombresTitular, String apellidosTitular, int numeroCuenta, tipo tipoCuenta) {
		/*
		 * Tener en cuenta que no se pasa como parámetro el saldo ya que inicialmente es
		 * cero.
		 */
		this.nombresTitular = nombresTitular;
		this.apellidosTitular = apellidosTitular;
		this.númeroCuenta = numeroCuenta;
		this.tipoCuenta = tipoCuenta;
	}

	/**
	 * Método que imprime en pantalla los datos de una cuenta bancaria
	 */
	void imprimir() {
		System.out.println("Nombres del titular = " + nombresTitular);
		System.out.println("Apellidos del titular = " + apellidosTitular);
		System.out.println("Número de cuenta = " + númeroCuenta);
		System.out.println("Tipo de cuenta = " + tipoCuenta);
		System.out.println("Saldo = " + saldo);
	}

	/**
	 * Método que imprime en pantalla el saldo actual de una cuenta bancaria
	 */
	void consultarSaldo() {
		System.out.println("El saldo actual es = " + saldo);
	}

	/**
	 * Método que actualiza y devuelve el saldo de una cuenta bancaria a partir de
	 * un valor a consignar
	 * 
	 * @param valor Parámetro que define el valor a consignar en la cuenta bancaria.
	 *              El valor debe ser mayor que cero
	 * @return Valor booleano que indica si el valor a consignar es válido o no
	 */

	boolean consignar(int valor) {
		// El valor a consignar debe ser mayor que cero
		if (valor > 0) {
			saldo = saldo + valor; /*
									 * Se actualiza el saldo de la cuenta con el valor consignado
									 */
			System.out.println("Se ha consignado $" + valor + " en la	cuenta. El nuevo saldo es $" + saldo);
			return true;
		} else {
			System.out.println("El valor a consignar debe ser mayor que 	cero.");
			return false;
		}
	}

	/**
	 * Método que actualiza y devuelve el saldo de una cuenta bancaria a partir de
	 * un valor a retirar
	 * 
	 * @param valor Parámetro que define el valor a retirar en la cuenta bancaria.
	 *              El valor debe ser mayor que cero y el saldo de la cuenta debe
	 *              quedar con un valor positivo o igual a cero
	 * @return Valor booleano que indica si el valor a retirar es válido o no
	 */
	boolean retirar(int valor) {
		/*
		 * El valor debe ser mayor que cero y no debe superar el saldo actual
		 */
		if ((valor > 0) && (valor <= saldo)) {
			saldo = saldo - valor; /*
									 * Se actualiza el saldo de la cuenta con el valor retirado
									 */
			System.out.println("Se ha retirado $" + valor + " en la cuenta. El nuevo saldo es $" + saldo);
			return true;
		} else {
			System.out.println("El valor a retirar debe ser menor que el	saldo actual.");
			return false;
		}
	}

	/**
	 * Método que compara los saldos de dos cuentas bancarias y muestra el resultado
	 * en pantalla
	 * 
	 * @param cuenta Parámetro que define otra cuenta bancaria con la cual se va a
	 *               comparar la cuenta bancaria actual
	 */
	void compararCuentas(CuentaBancaria cuenta) {
		/*
		 * Determina si el saldo de la cuenta actual es mayor o igual que el saldo de la
		 * otra cuenta
		 */
		if (saldo >= cuenta.saldo) {
			System.out.println(
					"El saldo de la cuenta actual es mayor o igual al saldo de la cuenta pasada como parámetro.");
		} else {
			System.out.println("El saldo de la cuenta actual es menor al saldo de la cuenta pasada como parámetro.");
		}
	}

	/**
	 * Método que transfiere un valor de una cuenta a otra
	 * 
	 * @param cuenta Parámetro que define otra cuenta bancaria a la cual se le va a
	 *               transferir un valor
	 * @param valor  Parámetro que define el valor a transferir
	 */
	void transferencia(CuentaBancaria cuenta, int valor) {
		if (retirar(valor)) { // Si se puede retirar el valor de la cuenta actual
			cuenta.consignar(valor); /*
										 * Se realiza la consignación en la otra cuenta
										 */
		}
	}

	

}
