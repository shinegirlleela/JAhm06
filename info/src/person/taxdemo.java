package person;

import country.countryinfo;
import state.stateinfo;

public class taxdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		countryinfo c1 = new countryinfo("INDIA");
		stateinfo s1 = new stateinfo("GUJARAT");
		personinfo p1 = new personinfo("LEELA",100000,20,c1,s1);
		
		System.out.println(p1);
		
		calculatetax ct  = new calculatetax();
		ct.calculate(p1);
		
		countryinfo c2 = new countryinfo("INDIA");
		stateinfo s2 = new stateinfo("PUNJAB");
		personinfo p2 = new personinfo("KRISHAV",50000,24,c1,s1);
		
		System.out.println(p2);
		
		calculatetax ct1  = new calculatetax();
		ct.calculate(p2);
		
		

	}

}
