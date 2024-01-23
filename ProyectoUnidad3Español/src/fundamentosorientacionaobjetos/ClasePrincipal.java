package fundamentosorientacionaobjetos;

public class ClasePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		Coche miTesla = new SUV ("rojo","Tesla","Model S High Performace", 50000,30000);
		
		System.out.println(miTesla);
		
		Coche miBMWi = new Sedan("azul"," BMW","i5",50000,40000,4);

		System.out.println(miBMWi);
		
		miBMWi.repintar("blanco");
		
		System.out.println("MYBMW despues de repintar " + miBMWi);
		
		System.out.println("color Property access via Method " + miBMWi.getColor());
		
		
		System.out.println("beneficio de BMW despues de venta:" + miBMWi.beneficios(0.10));
		System.out.println("beneficio de  Tesla despu�s de venta:" + miTesla.beneficios (0.10));

		
	}

}
