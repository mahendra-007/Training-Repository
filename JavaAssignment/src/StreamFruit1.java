import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Fruit{
	String name;
	int calories;
	int price;
	String color;
	public Fruit(String name, int calories, int price, String color) {
		super();
		this.name = name;
		this.calories = calories;
		this.price = price;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Fruit [name=" + name + ", calories=" + calories + ", price=" + price + ", color=" + color + "]";
	}
	
	
}
public class StreamFruit1 {

	public static void main(String[] args) {
	List<Fruit> list=new ArrayList<>();
	list.add(new Fruit("apple",50,100,"red"));
	list.add(new Fruit("guava",30,600,"green"));
	list.add(new Fruit("grapes",70,200,"green"));
	list.add(new Fruit("orange",100,500,"orange"));
	list.add(new Fruit("pineapple",150,200,"yellow"));
	list.add(new Fruit("cherry",80,150,"red"));
	
   //1
	/*List<Fruit> calories=list.stream().filter(c->c.getCalories()<100).sorted(Comparator.comparing(Fruit::getCalories).reversed()).collect(Collectors.toList());
	calories.forEach(System.out::println);*/
	
Map<String,List<Fruit>> color=list.stream().filter(p->p.getColor().equals("green")).collect(Collectors.groupingBy(Fruit::getName));
	color.forEach((name,p1)->{
		System.out.println(name);
		//p1.forEach(System.out::println);
		//System.out.println();
	});
	Map<String,List<Fruit>> color1=list.stream().filter(p->p.getColor().equals("red")).collect(Collectors.groupingBy(Fruit::getName));
	color1.forEach((name,p1)->{
		System.out.println(name);
	});
	Map<String,List<Fruit>> color2=list.stream().filter(p->p.getColor().equals("orange")).collect(Collectors.groupingBy(Fruit::getName));
	color2.forEach((name,p1)->{
		System.out.println(name);
	});
	List<Fruit> red=list.stream().filter(p->p.getColor().equals("red")).sorted(Comparator.comparing(Fruit::getPrice)).collect(Collectors.toList());
	red.forEach(System.out::println);
	}
}