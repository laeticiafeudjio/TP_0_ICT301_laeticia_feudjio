package OCP.avant;

public class AreaCalculator {
	public double calculateArea(Object shape) {
	if (shape instanceof Rectangle rectangle) {
	return rectangle.getHeight() * rectangle.getWidth();
	} else if (shape instanceof Circle) {
	Circle circle = (Circle) shape;
	return Math.PI * circle.getRadius() * circle.getRadius();
		}
		throw new IllegalArgumentException("Unknown shape");

 }	}	
