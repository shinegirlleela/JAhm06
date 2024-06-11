package exception_handling;

public class bank_exception {
	
	private String accname;
	private int balance;
	
	
	public String getAccname() {
		return accname;
	}
	public void setAccname(String accname) {
		this.accname = accname;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "bank_exception [accname=" + accname + ", balance=" + balance + "]";
	}
	
	public void withdrawal(int amt) {
		
		try {
			this.balance=this.balance-amt;
			if(balance < 1000) {
				
				this.balance=this.balance+amt;
				throw new BalanceChecker(" balance must be >1000");
				
				
			}
		}catch(BalanceChecker be) {
			System.out.println(be.getMessage());
		}
	}		
}
