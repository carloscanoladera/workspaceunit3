package ejercicios.declases.ejercicio37;

public class PuertaCoche extends ComponenteDeCoche implements PuertaBloqueada, Alarma {
	
	private boolean estaAbierta=false;
	private boolean estaBloqueada=false;
	private boolean estaActivada=false;
	

	public PuertaCoche(boolean estaAbierta, boolean estaBloqueada, boolean estaActivada) {
		super();
		this.estaAbierta = estaAbierta;
		this.estaBloqueada = estaBloqueada;
		this.estaActivada = estaActivada;
	}

	@Override
	public void Abrir() {
		// TODO Auto-generated method stub
		
		System.out.println("Puerta Abierta");
		estaAbierta=true;
		
	}

	@Override
	public void Cerrar() {
		// TODO Auto-generated method stub
		System.out.println("Puerta Cerrada");
		estaAbierta=false;
		
	}

	@Override
	public boolean alarmaActivada() {
		// TODO Auto-generated method stub
		return estaActivada;
	}

	@Override
	public void activarAlarma() {
		// TODO Auto-generated method stub
		System.out.println("ring ring ring");
		estaActivada=true;
		
	}

	@Override
	public void desactivarAlarma() {
		// TODO Auto-generated method stub
		System.out.println("Alarma parada");
		estaActivada=false;
		
	}

	@Override
	public void bloquea() {
		// TODO Auto-generated method stub
		System.out.println("Puerta Bloqueada");
		
		estaBloqueada=true;
		
	}

	@Override
	public void desbloquea() {
		
		
		System.out.println("Puerta Desbloqueada");
		
		estaBloqueada=false;
		
		// TODO Auto-generated method stub
		
	}

}
