package CASE_STUDY_BANK;

public class MMCurrentAcc extends CurrentAcc {
	
	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
	}

	@Override
	 public void withdraw(float amt) {
		
		System.out.println("it is withdraw function class of MMCurrentAcc");
		super.withdraw(amt);
		
	}

	@Override
	public String toString() {
		return "MMCurrentAcc: " + super.toString();
	}
	
}
