package CASE_STUDY_BANK;

public abstract class CurrentAcc extends BankAcc{
	
	 private final float creditLimit;

	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}
	
	@Override
	 public void withdraw (float amt) {
		
		if(getAccBal() + creditLimit >=amt) {
			super.deposite(-amt);
		}
		else {
			System.out.println("sorry to withdraw exteeds credit limit");
		}	
		
	}

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + "]";
	}

}
