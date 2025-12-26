package DIP.avant;
	
	class MySQLDatabase {
	public void save(String data) {
	System.out.println("Saving to MySQL: " + data);
	}
 }

public class OrderProcessor {
	private final MySQLDatabase database;
	public OrderProcessor() {
	this.database = new MySQLDatabase();
	}
	public void processOrder(String order) {
	database.save(order);
	}
	public MySQLDatabase getDatabase() {
		return database;
	}
 }


