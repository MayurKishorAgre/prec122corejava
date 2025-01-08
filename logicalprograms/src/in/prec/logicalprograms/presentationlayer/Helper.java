package in.prec.logicalprograms.presentationlayer;
import java.util.Scanner;

import in.prec.logicalprograms.armstrongnumber.ArmStrongNumber;

public class Helper {
	public int printMenu(Scanner scanner) {
		System.out.println("1. to check if number is palindrome");
		System.out.println("2. to check if number is armstrong");
		System.out.println("3. to check if number is perfect");
		System.out.println("4. to check if number is prime");
		System.out.println("0. To Exit....");
		return scanner.nextInt();
		
	}
	public void checkForArmStrongNumber(Scanner scanner) {
		ArmStrongNumber number= new ArmStrongNumber();
		System.out.println("Enter a number:");
		int variable=scanner.nextInt();
		number.setNumber(variable);
		if(number.isArmstrongNumber())
			System.out.println(variable + "number is  armstrong number");
		else
		System.out.println(variable + "number is not armstrong number");
	
	}

}
