package ejercicios.declases.figurasinterfaces;

public class AppFiguras {

	public static void main(String[] args) {
		
		IFigura[] arrayFiguras = new IFigura[5];

		Circulo cir = new Circulo(10);
		Circulo cir2;
		

		

		FiguraGeometrica varSuperCirculo = new Circulo(15);
		FiguraGeometrica varSuperRectangulo = new Rectangulo(5, 10);
		cir.getRadio();

		if (varSuperCirculo instanceof Circulo)
			cir2 = (Circulo) varSuperCirculo;

		// da fallo

		if (varSuperRectangulo instanceof Circulo)
			cir2 = (Circulo) varSuperRectangulo;
		
		//cir2 = (Circulo) varSuperRectangulo;

		arrayFiguras[0] = cir;
		arrayFiguras[1] = new Cuadrado(5);
		arrayFiguras[2] = new Rectangulo(4, 8);
		arrayFiguras[3] = new PentagonoRegular(5);
		arrayFiguras[4] = new TrianguloRectangulo(3, 7);



		System.out.println(cir.calcularArea());
		
		
		for (int i=0; i< arrayFiguras.length; i++ ) {
			
			System.out.println("Area: " + arrayFiguras[i].calcularArea());
			System.out.println("Perimetro: " + arrayFiguras[i].calcularPerimetro());
			System.out.println("Tipo: " + ((FiguraGeometrica) arrayFiguras[i]).getTipo());
			
			
		}		
		

	}

}
