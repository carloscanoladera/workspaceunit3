package ejercicios.declases;

import ejercicios.declases.CuentaBancaria.tipo;

public class MainCuentaBancaria {

	/**
	 * Método main que crea dos cuentas bancarias sobre las cuales se realizan las
	 * operaciones de consignar, comparar, transferir y consultar saldos
	 */

	public static void main(String args[]) {
		CuentaBancaria cuenta1 = new CuentaBancaria("Pedro", "Pérez", 123456789, tipo.AHORROS);
		CuentaBancaria cuenta2 = new CuentaBancaria("Pablo", "Pinzón", 44556677, tipo.AHORROS);
		cuenta1.consignar(200000);
		cuenta2.consignar(100000);
		cuenta1.compararCuentas(cuenta2);
		cuenta1.transferencia(cuenta2, 50000);
		cuenta1.consultarSaldo();
		cuenta2.consultarSaldo();
	}
	
}
