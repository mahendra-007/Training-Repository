
public class ArmstrongNumberRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp, r1,r2,r3,res;
		 for(int n=100;n<=999;n++) {
			 temp=n;
			 r1=temp%10;
			 temp=temp/10;
			
			 r2=temp%10;
			 temp=temp/10;
			 
			 r3=temp%10;
			res=(r1*r1*r1)+(r2*r2*r2)+(r3*r3*r3);
			
			if(n==res) {
				System.out.println(n +"is Armstrong number");
			}
			 
			 
			 
		 }

	}

	}


