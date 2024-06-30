package jdbc_curd;

public class Student_info {
	
	private int Enrollno;
	private String Name , Stream;
	
	public Student_info() {
		
	}
	
	public Student_info(int Enrollno, String Name, String Stream) {
		
		this.Enrollno = Enrollno;
		this.Name = Name;
		this.Stream = Stream;
			
	}

	public int getEnrollno() {
		return Enrollno;
	}

	public void setEnrollno(int enrollno) {
		Enrollno = enrollno;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getStream() {
		return Stream;
	}

	public void setStream(String stream) {
		Stream = stream;
	}

	@Override
	public String toString() {
		return "Student_info [Enrollno=" + Enrollno + ", Name=" + Name + ", Stream=" + Stream + "]";
	}
	
}


