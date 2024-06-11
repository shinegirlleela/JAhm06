package exception_handling;

public class demo_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		bank_exception b = new bank_exception ();
		b.setAccname("leela");
		b.setBalance(5000);
		b.withdrawal(3000);
		System.out.println(b);

	}

}
