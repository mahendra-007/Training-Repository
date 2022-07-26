public class StringBufferAss {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		sb.append("String Buffer");
		sb.append(" is a peer of String class");
		sb.append(" that provides much of functionality");
		
		StringBuffer sb1=new StringBuffer("It is used to  at specified position");
		sb1.insert(14,"insert text");
				System.out.println(sb1);
				
	StringBuffer sb2=new StringBuffer("This method returns the reverse object on which it was called");
     System.out.println(sb2.reverse());
	}

}