import java.util.Scanner;

public class SubjectMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter student marks for SubjectA");
		int a1=scan.nextInt();
		int a2=scan.nextInt();
		int a3=scan.nextInt();
		System.out.println("enter student marks for SubjectB");
		int b1=scan.nextInt();
		int b2=scan.nextInt();
		int b3=scan.nextInt();
		System.out.println("enter student marks for SubjectC");
		int c1=scan.nextInt();
		int c2=scan.nextInt();
		int c3=scan.nextInt();
   double totalsubjectMarks=a1+a2+a3+b1+b2+b3+c1+c2+c3;
   double avg=totalsubjectMarks/9.0;
   System.out.println(totalsubjectMarks);
   System.out.println(avg);
   
   double ATotal=a1+a2+a3;
   double Aavg=ATotal/3.0;
   System.out.println(ATotal);
   System.out.println(Aavg);
   
   
   double BTotal=a1+a2+a3;
   double Bavg=ATotal/3.0;
   System.out.println(BTotal);
   System.out.println(Bavg);
   
   double CTotal=a1+a2+a3;
   double cavg=ATotal/3.0;
   System.out.println(CTotal);
   System.out.println(cavg);


	}

}
