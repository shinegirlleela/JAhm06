package person;

public class calculatetax {
	
	
	public void calculate(personinfo p1) {
		
		double tax=0.0;
		
		if(p1.getPage() >=18) {
			
			if(p1.getPsalary() >=40000  && p1.getPsalary() <60000) {
				
				tax  = p1.getPsalary() * 0.05;
				
			}
			else if(p1.getPsalary() >=60000  && p1.getPsalary() <100000) {
				
				tax  = p1.getPsalary() * 0.10;
				
			}
			else if(p1.getPsalary() >=100000) {
				
				tax  = p1.getPsalary() * 0.15;
				
			}
			else {
				System.out.println("no tax");
			}
		}
		else {
		
		System.out.println("your age is lessthan 18");
		
		}
		System.out.println("tax is : "+tax);
	
}

}
