

 package DIP.apres;

import javax.xml.crypto.Data;

public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	Data database;
		database = new Data();
	var order = new OrderProcessor(database);
	order.processOrder("'Données à sauvegarder'");
	
	database = new MongoDBDatabase();
	OrderProcessor order1 = new OrderProcessor(database);
	order1.processOrder("'Données à sauvegarder'");
}	







}
