import java.util.*;

class Contact{
	long PhoneNumber;
	String name;
	String email;
	public Contact(long phoneNumber, String name, String email) {
		PhoneNumber = phoneNumber;
		this.name = name;
		this.email = email;
	}
	public long getPhoneNumber() {
		return PhoneNumber;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	
}

public class CollectionTreeMap {
public static void main(String[] args) {
	TreeMap<Long,Contact> map=new TreeMap<>();
	Contact c1=new Contact(12345L,"Rahul","rahul@122");
	Contact c2=new Contact(35355,"Mahesh","mahesh@1322");
	Contact c3=new Contact(22525,"Abhijit","ajinkya@1252");
	Contact c4=new Contact(27725,"Abhishek","abhishek@1322");
	Contact c5=new Contact(82552,"Ajinkya","ajinkya@1223");
	map.put(1L,c1);
	map.put(2L,c2);
	map.put(3L,c3);
	map.put(4L,c4);
	map.put(5L,c5);

	for(long L:map.keySet()) {
		System.out.print(L+" ");
	}
	
	
}

}