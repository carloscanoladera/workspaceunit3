package ejemplosenclase.mamiferos;
public class Ornitorrinco extends Mamífero implements Oviparo {
/**
* Método que implementa el método abstracto amamantarCrías
* heredado de la clase Mamífero que define un texto específico sobre
* el ornitorrinco que amamanta crías
*/
public void amamantarCrías() {
System.out.println("El ornitorrinco amamanta a sus crías.");
}
/**
* Método que implementa el método ponerHuevos de la interfaz
* Ovíparo que define un texto específico sobre el ornitorrinco que
* puede poner huevos
*/
public void ponerHuevos() {
System.out.println("El ornitorrinco pone huevos.");
}
}