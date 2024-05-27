package person;

import country.countryinfo;
import state.stateinfo;

public class personinfo {
	
	private String pname;
	private int psalary;
	private int page;
	private countryinfo c1;
	private stateinfo s1;



	public personinfo(String pname, int psalary, int page, countryinfo c1, stateinfo s1) {

		this.pname = pname;
		this.psalary = psalary;
		this.page = page;
		this.c1 = c1;
		this.s1 = s1;
	}



	public String getPname() {
		return pname;
	}



	public void setPname(String pname) {
		this.pname = pname;
	}



	public int getPsalary() {
		return psalary;
	}



	public void setPsalary(int psalary) {
		this.psalary = psalary;
	}



	public int getPage() {
		return page;
	}



	public void setPage(int page) {
		this.page = page;
	}



	public countryinfo getC1() {
		return c1;
	}



	public void setC1(countryinfo c1) {
		this.c1 = c1;
	}



	public stateinfo getS1() {
		return s1;
	}



	public void setS1(stateinfo s1) {
		this.s1 = s1;
	}



	@Override
	public String toString() {
		return "personinfo [pname=" + pname + ", psalary=" + psalary + ", page=" + page + ", c1=" + c1 + ", s1=" + s1
				+ "]";
	}



//	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		countryinfo c1 = new countryinfo("INDIA");
//		stateinfo s1 = new stateinfo("GUJARAT");
//		personinfo p1 = new personinfo("LEELA",10000,20,c1,s1);
		
//		System.out.println(p1);
		

//	}

}
