package AtmProject01;

public class AtmControllers1 implements AtmController {
	
		atms aa;
		public AtmControllers1(atms a) {
			aa =a;
		}
		double balance=0.0;
		@Override
		public double  withdraw(double amount) {
		 balance=aa.getbalance();
		 if(balance>=500) {
			 balance=balance-amount;
				aa.setbalance(balance);
				System.out.println("amount after withdarw="+balance);
		 }
		 else System.out.println("you cannot withdraw amount..->");
		return amount;
			
		}
		@Override
		public double deposit(double amount) {
			 balance =aa.getbalance();
			balance=balance+amount;
			aa.setbalance(balance);
					return balance;
					
		}
		
		public double checkbalance() {
	 	  return aa.getbalance();
		}
		@Override
		public void checkbalance(int pin) {
			// TODO Auto-generated method stub
			
		}


	}
