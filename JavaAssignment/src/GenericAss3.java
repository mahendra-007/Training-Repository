import java.util.Arrays;

 class GenericAss3
{
static  void swap(String[] a,int i,int j) //if we make it instance method we have to create object 
	{
		String temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	public static void main(String args[])
	{
		String[] s= {"hii","hello","Everyone"};
		System.out.println("before swap :"+Arrays.toString(s));
	       swap(s,0,2);
//	       swap(s,0,2);
	       System.out.println("after swap :"+Arrays.toString(s));
	}
	
	

}