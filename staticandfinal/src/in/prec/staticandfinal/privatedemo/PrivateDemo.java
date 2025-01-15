package in.prec.staticandfinal.privatedemo;

public class PrivateDemo {
	private int var1;
	private int var2;
	private PrivateDemo() {
		var1=1;
		var2=1;
	}
	private void setvariable() {
		var1=1;
		var2=1;
	}
	public PrivateDemo(int var1,int var2) {
		if(var1<0 && var2<0)
			setvariable();
		else {
			this.var1=var1;
			this.var2=var2;
		}
	}
	public static void main(String[]args) {
		PrivateDemo objdemo=new PrivateDemo(-25,-20);
		System.out.println("var1:"+ objdemo.var1);
		System.out.println("var2:"+ objdemo.var2);
		
		
	}

}
