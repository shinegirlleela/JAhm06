package static_example;

public class calculation {
	
	static int count = 0;
	int ct = 0;
	
	public calculation() {
		
		count++;
		ct++;
	}

	@Override
	public String toString() {
		return "calculation [ct=" + ct + "]";
	}

}
