package AtmProject01;

import java.util.Scanner;

public class mainatm {

	public static void main(String[] args) {

				int pin=1234;
			atms a=new atms();
			AtmControllers1 atcm = new AtmControllers1(a);
				int key=a.getpin();
				while (pin==key) {
					System.out.println("enter choices");
					System.out.println("choice 1 deposite");
					System.out.println("choice 2 withdraw");
					System.out.println("choice 3 checkbalance");
				
					Scanner s=new Scanner(System.in);
					int choice=s.nextInt();
					switch (choice) {
					case 1: {
						
						System.out.println("enter amount to deposite");
						double balance = atcm.deposit(s.nextDouble());
						System.out.println("amount after deposite="+balance);
						break;
					}
					case 2: {
						System.out.println("enter amount to withdraw");
						atcm.withdraw(s.nextDouble());
			
						break;
					}
					case 3 : {
						
						double balence=atcm.checkbalance();
						System.out.println("balence="+balence);
						break;
					}
					default:
					}
				}
				System.out.println("incorrect pin");
			}
	}


