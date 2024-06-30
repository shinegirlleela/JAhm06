package CASE_STUDY_BANK;

public class MMSavingAcc extends SavingAcc{

	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
	}
	 
	@Override
	 public void withdraw(float amt) {
		
		System.out.println("it is withdraw function class of MMSavingAcc");
		super.withdraw(amt);
		
	}

	@Override
	public String toString() {
		return "MMSavingAcc: " + super.toString();
	}

}
