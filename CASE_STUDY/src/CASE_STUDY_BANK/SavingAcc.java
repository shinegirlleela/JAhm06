package CASE_STUDY_BANK;

public abstract class SavingAcc extends BankAcc{

	private boolean isSalaried;
	private static final  float MINBAL=500.0f;
	
	
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
	}
	
	@Override
	public void withdraw (float amt) {
		
		if(getAccBal() - amt>=MINBAL) {
			super.deposite(-amt);
		}
		else {
			System.out.println("sorry to withdraw maintain min bal");
		}	
}

	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + "]";
	}
	
}
