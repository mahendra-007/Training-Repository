
public class SingleToneClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xyz obj1=Xyz.getInstance();
		Xyz obj2=Xyz.getInstance();
		Xyz obj3=Xyz.getInstance();

	}
	
	static class Xyz{
		static	 Xyz obj=new Xyz();
			 
			 private Xyz() {
				 System.out.println("Hello");
				 
			 }
			  static Xyz getInstance() {
				 return obj;
			 }
		}

}
