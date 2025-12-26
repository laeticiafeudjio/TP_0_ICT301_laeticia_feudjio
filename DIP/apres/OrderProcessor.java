	package DIP.apres

import javax.xml.crypto.Data;

class MongoDBDatabase implements Data{
	public void save(String data) {
	System.out.println("Saving to MongoDB: " + data);
	}
 }

public class OrderProcessor {
	private final  database;
	/**
	 * @param database
	 */
	public OrderProcessor(Data database) {
	this.database = (Database) database;
	}
	public void processOrder(String order) {
	database.save(order);
	}

    public Database getDatabase() {
        return database;
    }
 }
