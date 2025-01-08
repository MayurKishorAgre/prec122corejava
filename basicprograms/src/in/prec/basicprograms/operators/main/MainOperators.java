package in.prec.basicprograms.operators.main;
import in.prec.basicprograms.operators.Operators;

public class MainOperators {
	public static void main(String[]args) {
		Operators operator1 = new Operators();
		Operators operator2 = new Operators();
		
		
		int result=operator1.performLeftShiftOn(1);
		System.out.println(result);
		
		operator2.setOperand1(250);
		operator2.setOperand2(250);
		
		int result2=operator2.performAddition();
		System.out.println(result2);
	}

}
