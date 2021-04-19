package Java14.School.cst_3519;
import java.util.Scanner;



public class ATM_Machine {

	public static void main(String[] args) {
        
        double balance = 1000;
        char option, A = 0;
        double temp;
        
        while(true) {
        Scanner input= new Scanner(System.in);
        
        	
        	System.out.println("A = Deposite\nB = Withdraw\nC = Balance\nD = Exit");
        	
        	
        	option = input.next().toUpperCase().charAt(0);
        	
        	switch(option) {
        	case  'A' :
        		System.out.println("Enter the amount of your deposite");
        		temp = input.nextDouble();
        		balance = balance + temp;
        		System.out.println("you balance have " + balance);
        		break;
        		
        	case 'B':

        		System.out.println("Enter the amount to withdraw");
        		temp = input.nextDouble();
        		balance -= temp;
        		System.out.println("you have "+balance+ " left");
        		break;
        	
        	case 'C': 
        		System.out.println("your current balance" + balance);
        		break;
        		
        	case 'D':
        		System.out.println("Thank you and see you next time");
        		System.exit(0);
        	}
                
        
        	
}
}
}