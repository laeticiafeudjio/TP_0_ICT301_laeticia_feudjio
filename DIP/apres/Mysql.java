package DIP.apres;


  public   class Mysql implements Database {
	public void save(String data) {
	System.out.println("Saving to MySQL: " + data);
	}

	@Override
	public String toString() {
		return "Mysql []";
	}
 }


