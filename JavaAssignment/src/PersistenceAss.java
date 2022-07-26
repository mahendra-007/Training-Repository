abstract class Persistence {
	abstract void persist();
}

class FilePersistence extends Persistence{

	@Override
	void persist() {
	System.out.println("Data is saved in file");	
	}


}
class DatabasePersistence extends Persistence{

	@Override
	void persist() {
		System.out.println("Data saved in database");
	}
	
	
	
}


public class PersistenceAss {

	public static void main(String[] args) {
		Persistence p=new FilePersistence();
        p.persist();
		Persistence p1=new DatabasePersistence();
		p1.persist();

	}

}