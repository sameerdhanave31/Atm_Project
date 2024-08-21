package AtmProject01;

import java.util.Scanner;

public class atms {
		private int bankAccNo;
		private int pin;
		private double balance;
		
		public int getbankAccNo() {
			return bankAccNo;
		}
		public void setBankAccNo(int bankAccNo) {
			this.bankAccNo=bankAccNo;
			
		}
		public int getpin() {
			return pin;
			
		}
		public void setpin(int pin) {
			this.pin = pin;
			
		}
		public double getbalance() {
			return balance;
		}
		public void setbalance(double balance) {
			this.balance = balance;
		}
	    	public atms() {
				Scanner sc=new Scanner(System.in);
				System.out.println("enter acc no");
				bankAccNo=sc.nextInt();
				System.out.println("enter pin no");
				pin=sc.nextInt();
				System.out.println("enter  balance");
				balance=sc.nextDouble();
						
				
			}
			public atms(int bankAccNo, int pin, double balance) {
			super();
			this.bankAccNo = bankAccNo;
			this.pin = pin;
			this.balance = balance;
		}
			@Override
			public String toString() {
				return "atms [bankAccNo=" + bankAccNo + ", pin=" + pin + ", balance=" + balance + "]";
			}
			
		}





