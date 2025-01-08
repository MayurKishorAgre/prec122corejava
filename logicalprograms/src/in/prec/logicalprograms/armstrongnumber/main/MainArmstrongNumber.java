package in.prec.logicalprograms.armstrongnumber.main;
import in.prec.logicalprograms.armstrongnumber.ArmStrongNumber;
import java.util.Scanner;

public class MainArmstrongNumber {
	public static void main(String[] args) {
		ArmStrongNumber number = new ArmStrongNumber();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number for checking ArmStrong :");
		int variable = scanner.nextInt();
		number.setNumber(variable);
		if (number.isArmstrongNumber()) {
			System.out.println(variable + " is a ArmStrong Number");
		} else {
			System.out.println(variable + " is not a ArmStrong Number");
		}
		scanner.close();
	}

}
