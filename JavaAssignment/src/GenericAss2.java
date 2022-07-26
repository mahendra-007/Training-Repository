import java.util.HashMap;

public class GenericAss2 {

	public static void main(String[] args) {
		HashMap<Integer,Double> h1=new HashMap<>();
		h1.put(3,6.6);
		h1.put(4,6.7);
	//	h1.put(5,6); cannot add another dataype other than int and double
		h1.put(6,6.9);
		h1.put(7,6.0);
		h1.put(8,6.7);
		h1.put(9,6.6);
		h1.put(10,6.6);
		h1.put(11,6.6);
		h1.put(12,6.6);
		System.out.println(h1);
		
	}

}