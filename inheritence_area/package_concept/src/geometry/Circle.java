package geometry;

public class Circle {
	
	private double radius;

	public Circle(double radius) {
		
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double calculatearea() {
		return 3.14*radius*radius;
	}
	
	public double calculateperameter() {
		return 2*3.14*radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

}
