
@FunctionalInterface
interface Addable{
	int arithmetic(int a,int b);
}

public class Lamda_Arithmetic {
public static void main(String[] args) {
	Addable ad1=(a,b)->(a+b);
	System.out.println("The addition of two numbers is "+ad1.arithmetic(10, 20));
	
	Addable multi1=(a,b)->(a*b);
	System.out.println("The multiplication of two numbers "+multi1.arithmetic(60, 10));
	
    Addable div1=(a,b)->(a/b);
	System.out.println("The division of two numbers is "+div1.arithmetic(1000, 10));
	
	Addable sub1=(a,b)->(a-b);
	System.out.println("The subtraction of two numbers is "+sub1.arithmetic(100, 1));
}
}
