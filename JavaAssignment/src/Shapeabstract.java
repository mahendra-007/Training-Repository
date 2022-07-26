abstract class Shape {
	abstract void draw();
}
class Rectangle extends Shape{

	@Override
	void draw() {
		System.out.println("Rectangle");
	}
	
	
}
 class Line extends Shape{

	@Override
	void draw() {
		System.out.println("Line");
		
	}
	
	
	
}
class Cube extends Shape{

	@Override
	void draw() {
		System.out.println("Cube");
		
	}
	
}
public class Shapeabstract {

	public static void main(String[] args) {
		Shape s=new Line();
	s.draw();
		Shape s1=new Cube();
		s1.draw();
		Shape s2=new Rectangle();
		s2.draw();

	}

}