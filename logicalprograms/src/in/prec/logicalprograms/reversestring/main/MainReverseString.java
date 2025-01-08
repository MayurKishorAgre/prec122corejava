package in.prec.logicalprograms.reversestring.main;
import in.prec.logicalprograms.reversestring.ReverseString;
import java.util.Scanner;

public class MainReverseString {
	public static void main(String[]args) {
		ReverseString reversestring=new ReverseString();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a name to reverse:-");
		String temp=scanner.nextLine();
		
		
		
		reversestring.setVariable(temp);
		//String result = reversestring.reverseString();
		String result = reversestring.reverseStringLine();
		System.out.println(result);
		
		scanner.close();
	}

}
