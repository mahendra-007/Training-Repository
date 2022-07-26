public class StringAss {

	public static void main(String[] args) {
		String str1="Hello World";
		System.out.println(str1.length());
		
		String str2="Hello";
		String str3="How are you";
		System.out.println(str2.concat(" "+str3));
		String str5="java string pool refers to collection of strings which are stored in heap memory";
		String str4="Java String pool refers to collection of Strings which are stored in heap memory";
		System.out.println(str4.toLowerCase());
		System.out.println(str4.toUpperCase());
		System.out.println(str4.replace("a","$"));
		System.out.println(str4.contains("collection"));
		System.out.println(str5.equals(str4));
		System.out.println(str5.equalsIgnoreCase(str4));
		
		
	}
}