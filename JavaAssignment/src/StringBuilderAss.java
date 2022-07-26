public class StringBuilderAss {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		sb.append("String Builder");
		sb.append(" is a peer of String class");
		sb.append(" that provides much of functionality");
		
		StringBuilder sb2=new StringBuilder("It is used to  at specified position");
		sb2.insert(14,"insert text");
				System.out.println(sb2);
				
	StringBuilder sb3=new StringBuilder("This method returns the reverse object on which it was called");
     System.out.println(sb3.reverse());
	}

	}
