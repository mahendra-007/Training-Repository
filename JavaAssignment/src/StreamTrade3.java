import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
class Transaction{
	Trade trade;
	int year;
	int value;
	public Transaction(Trade trade, int year, int value) {
		super();
		this.trade = trade;
		this.year = year;
		this.value = value;
	}
	public Trade getTrade() {
		return trade;
	}
	public void setTrade(Trade trade) {
		this.trade = trade;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Transaction [trade=" + trade + ", year=" + year + ", value=" + value + "]";
	}
	
}
class Trade{
	String name;
	String city;
	public Trade(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Trade [name=" + name + ", city=" + city + "]";
	}
	
}
public class StreamTrade3 {

	public static void main(String[] args) {
		List<Trade> list=new ArrayList<>();
		list.add(new Trade("Raj","Bangalore"));
		list.add(new Trade("Ram","Mumbai"));
		list.add(new Trade("Pavan","Pune"));
		list.add(new Trade("Omkar","Goa"));
		list.add(new Trade("Sham","Pune"));
		
		List<Transaction> list1=new ArrayList<>();
		list1.add(new Transaction(new Trade("Raj","Bangalore"), 2011,2000));
		list1.add(new Transaction(new Trade("Ram","Mumbai"), 2010,3000));
		list1.add(new Transaction(new Trade("Pavan","Pune"), 2011,1000));
		list1.add(new Transaction(new Trade("Omkar","Goa"), 2011,3000));
		list1.add(new Transaction(new Trade("Sham","Pune"), 2019,6000));
		
		List<Trade> l=list.stream().distinct().collect(Collectors.toList());
		l.forEach(System.out::println);
		
		List<Trade> t=list.stream().filter(p->p.getCity().equals("Pune")).sorted(Comparator.comparing(Trade::getName)).collect(Collectors.toList());
		t.forEach(System.out::println);
		
	Map<String, List<Trade>> r=list.stream().sorted(Comparator.comparing(Trade::getName)).collect(Collectors.groupingBy(Trade::getName));
		r.forEach((name,p1)->{
			System.out.println(name);
		});
   Map<Integer,  List<Transaction>> s=list1.stream().filter(p->p.getTrade().getCity().equals("Pune")).collect(Collectors.groupingBy(Transaction::getValue));
   s.forEach((value,p1)->{
	   System.out.println(value);
   });
   
   Optional<Transaction> u=list1.stream().max(Comparator.comparing(Transaction::getValue));
   System.out.println(u);
   
   Optional<Transaction> u1=list1.stream().min(Comparator.comparing(Transaction::getValue));
   System.out.println(u1);
   
   List<Transaction> v=list1.stream().filter(p->p.getYear()==2011).sorted(Comparator.comparing(Transaction::getValue)).collect(Collectors.toList());
   v.forEach(System.out::println);
   
	}

}