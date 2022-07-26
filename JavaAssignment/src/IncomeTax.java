import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int r=0;
		System.out.println("enter cTC");
		double ctc=scan.nextDouble();
		if(ctc <= 180001) {
			r=0;	
		}
		else if(ctc <=300001) {
			r=10;
		}
		else if(ctc<=500001) {
			r=20;
		}
		else if(ctc<=1000000) {
			r=30;
		}
      double tax=ctc*r/100;
      System.out.println(tax);

	}

}
