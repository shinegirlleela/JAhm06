package students;

public class students {
	
	private String sname;
	
	public students() {
		
		this.sname = "Unknown";
	}

	public students(String sname) {

		this.sname = sname;
	}
	
	
	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}
	
	

	@Override
	public String toString() {
		return "students [sname=" + sname + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		students s1 = new students();
		students s2 = new students("Leela");
		students s3 = new students("Anu");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		

	}

}
