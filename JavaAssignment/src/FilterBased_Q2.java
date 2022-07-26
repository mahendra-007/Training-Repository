import java.util.*;
import java.util.stream.Collectors;
class Order{
	int orderprice;
	String ordername;
	String orderStatus;
	public Order(int orderprice, String ordername,String orderStatus) {
		this.orderprice = orderprice;
		this.ordername = ordername;
		this.orderStatus=orderStatus;
	}
	public int getOrderprice() {
		return orderprice;
	}
	public String getOrdername() {
		return ordername;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	@Override
	public String toString() {
		return "Order [orderprice=" + orderprice + ", ordername=" + ordername + ", orderStatus=" + orderStatus + "]";
	}
}
public class FilterBased_Q2 {
public static void main(String[] args) {
	List<Order> orders=new ArrayList<>();
	orders.add(new Order(7000,"Burger","Accepted"));
	orders.add(new Order(12000,"Pizzas","Completed"));
	orders.add(new Order(13000,"Coke","Processing"));
	orders.add(new Order(12000,"Ice-Cream","Accepted"));
	orders.add(new Order(2000,"Frankie","Completed"));
	
	List <Order> orderbyname=orders.stream()
	                //.filter(p->p.orderprice>10000)
	               .filter(q->q.orderprice>10000)
	               .filter(x->x.getOrderStatus().equals("Accepted")||x.getOrderStatus().equals("Completed"))
	               .collect(Collectors.toList());
   System.out.println(orderbyname);
}
}
