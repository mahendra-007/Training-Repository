import java.util.Scanner;

public class Subject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter S1 marks");
		double s1=scan.nextDouble();
		System.out.println("Enter S2 marks");
		double s2=scan.nextDouble();
		System.out.println("Enter S3 marks");
		double s3=scan.nextDouble();
		if(s1>60 && s2>60 && s3>60) {
			System.out.println("Passed");	
		}
		
		else	 if(s1>60 && s2>60  || s2>60 && s3>60 || s3>60 && s1>60) {
			System.out.println("Promoted");
		}
		else if(s1>60 || (s1<60 && s2<60&&s3<60) || (s2>60 || (s1<60&&s2<60&&s3<60))  ||(s3>60 ||(s1<60&&s2<60&&s3<60))) {
			System.out.println("failed");
		}

	}

}
