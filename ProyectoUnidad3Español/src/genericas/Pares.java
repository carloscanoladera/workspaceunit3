package genericas;

public class Pares<K, V> {
	private K clave;
	private V valor;

	public Pares() {
	}

	public Pares(K c, V v) {
		clave = c;
		valor = v;
	}

	public K getClave() {
		return clave;
	}

	public V getValor() {
		return valor;
	}

	public String toString() {
		return "Pares: [" + getClave() + "," + getValor() + "]";
	}
	
	
	public static void main(String[] args) {
		
		Pares<Integer,String>  parNumeros = new Pares<Integer,String>(1,"uno");
		
		System.out.println(parNumeros);
		
		
		
	}
	
}