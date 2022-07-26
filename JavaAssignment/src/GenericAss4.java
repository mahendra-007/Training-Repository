import java.util.Date;
import java.util.Map;

class Pair<K,V> implements Map.Entry<K,V>{
	private K key;
	private V value;
	public Pair(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public K setKey(K key) {
	 return	this.key = key;
	}
	public V getValue() {
		return value;
	}
	public V setValue(V value) {
		return this.value = value;
	}
	
	
}
public class GenericAss4 {

	public static void main(String[] args) {
		Pair<String,String> p=new Pair("hii","hello");
		String s1=p.getKey();
		String s2=p.getValue();
		System.out.println(s1);
		System.out.println(s2);
		Pair<String,java.util.Date> p1=new Pair("hii","new java.util.Date()");
		String s3=p1.getKey();
		java.util.Date d=p1.getValue();
		System.out.println(s3);
		System.out.println(d);

	}

}
