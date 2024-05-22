package country;

public class countryinfo {
	
	private String cname;

	public countryinfo(String cname) {
		
		this.cname = cname;
	}

	
	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}


	@Override
	public String toString() {
		return "countryinfo [cname=" + cname + "]";
	}

	
}
