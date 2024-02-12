package ejercicios.declases.ejercicio12;

public class AppFraccion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Fraccion f= new Fraccion();
		
		Fraccion f2= new Fraccion();
		
		f.LeerFraccion();
		f2.LeerFraccion();
		
		Fraccion res = f.sumarFracciones(f, f2);
		
		res.escribirFraccion();

	}

}
