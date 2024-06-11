package inheritence_area;

public class Rectangle {
	
	private int lenth;
	private int breadth;
	
	
	public Rectangle(int lenth, int breadth) {

		this.lenth = lenth;
		this.breadth = breadth;
	}
	public int getLenth() {
		return lenth;
	}
	public void setLenth(int lenth) {
		this.lenth = lenth;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	public double calculatearea() {
		return lenth*breadth;
	}
	
	public double calculateperameter() {
		return 2*(lenth+breadth);
	}
	

	
	@Override
	public String toString() {
		return "Rectangle [lenth=" + lenth + ", breadth=" + breadth + "]";
	}
	
	

}
