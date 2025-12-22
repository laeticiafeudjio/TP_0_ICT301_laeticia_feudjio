package LSP.apres;
	
	
interface Shape {
	int getArea();
 }
	class Square implements Shape {
	private final int side;
	public Square(int side) {
	this.side = side;
	}

@Override
	public int getArea() {
	return side * side;
	}
 }

