package ejercicios.declases;
/**
* Esta clase define objetos de tipo Avión con un fabricante y número de
* motores como atributos.
* @version 1.2/2020
*/
public class Avión {
private String fabricante; /* Atributo que define el nombre del fabricante
del avión */
private int númeroMotores; /* Atributo que define el número de motores
del avión */
/**
* Constructor de la clase Avión
* @param fabricante Parámetro que define el nombre del fabricante
* de un avión
* @param númeroMotores Parámetro que define el número de
* motores que tiene un avión

*/
private Avión(String fabricante, int númeroMotores) {
this.fabricante = fabricante;
this.númeroMotores = númeroMotores;
}
/**
* Método que devuelve el nombre del fabricante de un avión
* @return El nombre del fabricante de un avión
*/
public String getFabricante() {
return fabricante;
}
/**
* Método que establece el nombre de un fabricande de un avión
* @param fabricante Parámetro que define el nombre del fabricante
* de un avión
*/
private void setFabricante(String fabricante) {
this.fabricante = fabricante;
}
/**
* Método que cambia el fabricante de un avión pasado como
* parámetro por el valor "Lockheed"
* @param a Parámetro que define un avión
*/
private void cambiarFabricante(Avión a) {
a.setFabricante("Lockheed");
}
/**
* Método que devuelve el número de motores de un avión
* @return El número de motores de un avión
*/
public int getNúmeroMotores() {
return númeroMotores;
}

/**
* Método que establece el número de motores de un avión
* @param númeroMotores Parámetro que define el número de
* motores de un avión
*/
private void setNúmeroMotores(int númeroMotores) {
this.númeroMotores = númeroMotores;
}
/**
* Método que imprime en pantalla el fabricante de un avión
*/
public void imprimirFabricante() {
System.out.println("El fabricante del avión es: " + fabricante);
}
/**
* Método main que crea dos aviones y modifica sus fabricantes
*/
public static void main(String args[]) {
Avión a1 = new Avión("Airbus",4);
Avión a2;
Avión a3 = new Avión("Boeing",4);
a2 = a1;
a1.imprimirFabricante();
a2.imprimirFabricante();
a1.setFabricante("Douglas");
a1.imprimirFabricante();
a2.imprimirFabricante();
a1.cambiarFabricante(a2);
a2.imprimirFabricante();
}



}