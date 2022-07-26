import java.util.Scanner;

public class SimpleAndCompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter principal");
		double pr=scan.nextInt();
		System.out.println("Enter rate ");
		double r=scan.nextInt();
		System.out.println("Enter time");
		double t=scan.nextInt();
		
		double Si=(pr*t*r)/100;
		double ci=pr*Math.pow(1.0+r/100.0,t)-pr;
		
		System.out.println("simple intrest is"+ Si);
		System.out.println("simple intrest is"+ ci);
		


	}

}
