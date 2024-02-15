package ejercicios.declases.figurasinterfaces;

public class PentagonoRegular extends FiguraGeometrica {
	
	private double longitudLado=0.0;
	
	public PentagonoRegular() {
		
		this.tipoFigura= EnumFigura.POLIGONOS;
		
	}	
	
	public PentagonoRegular(double longitudLado) {
		
		this();		
		this.longitudLado = longitudLado;
		
	}

	@Override
	public double calcularArea() {
		
		return longitudLado*apotema()*5/2;
	}

	@Override
	public double calcularPerimetro() {
b
		return longitudLado*5;
	}

	private double apotema () {
		
		return longitudLado/(2*Math.tan((1.0/5)*Math.PI));
	}
}
