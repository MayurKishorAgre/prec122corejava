package in.prec.logicalprograms.presentationlayer.main;
import java.util.Scanner;
import in.prec.logicalprograms.presentationlayer.Helper;

public class MainMenuDriven {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		Helper helper= new Helper();
		int option=0;
		do {
			int option1=helper.printMenu(scanner);
			System.out.println(option1);
			switch(option1) {
	//		case 1: helper.checkPallindromeNumber();
	//				break;
			case 2: helper.checkForArmStrongNumber(scanner);
					break;
	//		case 3: helper.checkPerfectNumber();
	//				break;
		//	case 4: helper.checkPrimeNumber();
			//		break;
			//default: System.out.println("Invalid Input.....");
			}
		}
		while(option!=0);
		scanner.close();
	}

}
