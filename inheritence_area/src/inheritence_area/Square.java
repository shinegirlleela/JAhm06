package inheritence_area;

public class Square extends Rectangle {
	
	private double side;
	
	public Square(int lenth, int breadth, double side) {
		super(lenth, breadth);
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle r1 = new Rectangle(4, 5);
		
		System.out.println(r1.calculatearea());

	}


}