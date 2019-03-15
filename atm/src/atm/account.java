package atm;

public class account {
	public static boolean check;
	public static double  Balance=0;
	Options options;
	TransactionHistory h;
		
	
	public double getBalance() {
		return Balance;
		
		
	}
	public void setBalance(double balance) {
		Balance = balance;
		
		
	}
	public account(double intialbalance) {
		if (intialbalance>=0.0)
			Balance=intialbalance;
		
		
	}
	public void Deposite(double amount) {
	
		Balance+=amount;
		h.s.push(amount);
	}
	public void withdrawl(double amount ) {
	
		Balance-=amount;
	h.s.push(amount);

}}
