package generics;

public class Pair<K, V> {
	private K key;
	private V value;

	public Pair() {
	}

	public Pair(K c, V v) {
		key = c;
		value = v;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}
	
	

	@Override
	public String toString() {
		return "Pair [key=" + key + ", value=" + value + "]";
	}

	public static void main(String[] args) {

		Pair<Integer, String> pairNumber  = new Pair<Integer, String>(1, "one");

		System.out.println(pairNumber);

	}
}