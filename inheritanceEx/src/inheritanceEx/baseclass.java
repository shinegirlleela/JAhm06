package inheritanceEx;

public class baseclass {
	
	private int amt;

	public int getAmt() {
		return amt;
	}

	public void setAmt(int amt) {
		this.amt = amt;
	}

	@Override
	public String toString() {
		return "baseclass [amt=" + amt + "]";
	}
	
	

}
