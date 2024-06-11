package geometry;

import geometry.Circle;
import geometry.Rectangle;
import geometry.triangle;


public class geometrypackagedemo {
	
	private Circle radius;
	private Rectangle length;
	private Rectangle width;
	private triangle side1;
	private triangle side2;
	private triangle side3;
	
	public geometrypackagedemo(Circle radius, Rectangle length, Rectangle width, triangle side1, triangle side2,
			triangle side3) {
		
		this.radius = radius;
		this.length = length;
		this.width = width;
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	

	public Circle getRadius() {
		return radius;
	}
	
	public void setRadius(Circle radius) {
		this.radius = radius;
	}

	public Rectangle getLength() {
		return length;
	}

	public void setLength(Rectangle length) {
		this.length = length;
	}

	public Rectangle getWidth() {
		return width;
	}

	public void setWidth(Rectangle width) {
		this.width = width;
	}

	public triangle getSide1() {
		return side1;
	}

	public void setSide1(triangle side1) {
		this.side1 = side1;
	}

	public triangle getSide2() {
		return side2;
	}

	public void setSide2(triangle side2) {
		this.side2 = side2;
	}

	public triangle getSide3() {
		return side3;
	}

	public void setSide3(triangle side3) {
		this.side3 = side3;
	}

	@Override
	public String toString() {
		return "geometrypackagedemo [radius=" + radius + ", length=" + length + ", width=" + width + ", side1=" + side1
				+ ", side2=" + side2 + ", side3=" + side3 + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c1 = new Circle(5);
		Rectangle r1 = new Rectangle(5,5);
		triangle t1 = new triangle(5,5,5);
		
		System.out.println("Circle");
		System.out.println("Circle of Area is : " +c1.calculatearea());
		System.out.println("Circle of Perimeter is : " +c1.calculateperameter());

		System.out.println("\nRectangle");
		System.out.println("Rectangle of Area is : " +r1.calculatearea());
		System.out.println("Rectangle of Perimeter is : " +r1.calculateperameter());
		
		System.out.println("\nTriangle");
		System.out.println("Triangle of Area is : " +t1.calculatearea());
		System.out.println("Triangle of Perimeter is : " +t1.calculateperameter());
	}

}
