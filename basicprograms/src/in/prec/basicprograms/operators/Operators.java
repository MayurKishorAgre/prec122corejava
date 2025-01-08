package in.prec.basicprograms.operators;
//operators types
public class Operators {
	int operand1;
	int operand2;
	
	//default constructor
	public Operators() {
		operand1=10;
		operand2=20;
	}
	//parameterized constructor
	public Operators(int operand1, int operand2) {
		this.operand1=operand1;
		this.operand2=operand2;
	}
	//setter method
	public void setOperand1(int operand1) {
		this.operand1=operand1;
	}
	public void setOperand2(int operand2) {
		this.operand2=operand2;
	}
	//getter method 
	public int getOperand1(int operand1) {
		return operand1;
	}
	public int getOperand2(int operand2) {
		return operand2;
	}
	// instance method
	public int performAddition() {
		return operand1+operand2;
	}
	public int performLeftShiftOn(int position) {
		return operand1<<position;
	}
	

}
