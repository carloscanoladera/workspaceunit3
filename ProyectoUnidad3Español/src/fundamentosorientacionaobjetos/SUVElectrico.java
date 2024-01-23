package fundamentosorientacionaobjetos;


public class SUVElectrico extends Coche implements InterfaceElectrico, IAsientos{
	private static final String  TYPE_SUV_ELECTRICO="SUVElectrico";
	private double capacidadBateria=0;
	private double consumo=0;
	private int numAsientos=0;
	
	
	public SUVElectrico(String color, String marca, 
			String modelo, double precio, double coste,
			double capacidadBateria, double consumo, int numAsientos) {
		super(color, marca, modelo, precio, coste);
		
		this.capacidadBateria= capacidadBateria;
		this.consumo= consumo;
		this.numAsientos= numAsientos;
		
	}
	
	

	public String getTipoCoche() {
		// TODO Auto-generated method stub
		return TYPE_SUV_ELECTRICO;
	}





	@Override
	public double capacidadBateria() {
		// TODO Auto-generated method stub
		return capacidadBateria;
	}





	@Override
	public double consumoParaCienKilometros() {
		// TODO Auto-generated method stub
		return consumo;
	}



	@Override
	public int numeroDeAsientos() {
		// TODO Auto-generated method stub
		return numAsientos;
	}
	
	@Override
	public String toString() {
		return "SUV [color=" + this.getColor() +   ", brand=" + this.getMarca() +
				", model=" + this.getModelo() + 	", capacidadBateria=" +
				capacidadBateria +  ", consumo=" +  consumo +   
				", numAsientos=" + numAsientos + "]";
	}

}

