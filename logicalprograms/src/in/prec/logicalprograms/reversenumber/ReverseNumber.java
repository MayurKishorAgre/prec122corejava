package in.prec.logicalprograms.reversenumber;

public class ReverseNumber {
	int number;
	public ReverseNumber(){
		
	}
	
	public ReverseNumber(int number ) {
		this.number=number;
		
	}
	
	public void setNumber(int number) {
		this.number=number;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void reverseGivenNumber() {
		int digit;
		
		while(number!=0) {
			digit=number%10;
			number=number/10;
			System.out.println(digit);
		}
	}
}
