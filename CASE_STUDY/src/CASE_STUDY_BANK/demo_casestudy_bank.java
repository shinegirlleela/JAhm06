package CASE_STUDY_BANK;

public class demo_casestudy_bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankFactory factory = new MMBankFactory();
		
		SavingAcc savingAcc = factory.getNewSavingAcc(1, "Leela rathod", 100.0f, true);
		
		 CurrentAcc currentAcc = factory.getNewCurrentAcc(2, "Bela rathod", 100.0f, 500.0f);

	        // Step d: Invoke withdraw() method on CurrentAcc
	   //     currentAcc.withdraw(1000); // Assuming withdraw method takes amount as parameter

	        System.out.println("Saving Account Details:");
	        
	        System.out.println(savingAcc);
	        savingAcc.withdraw(600);
	        System.out.println(savingAcc);
	        

	        System.out.println("Current Account Details:");
	        
	        System.out.println(currentAcc);
	        savingAcc.withdraw(500);
	        System.out.println(currentAcc);
	       

	}

}
