package in.prec.logicalprograms.series;

public class Series {
	
	int limit;
	 public Series() {}
	 public Series(int limit) {
		 this.limit=limit;
	 }
	 public void setlimit(int limit) {
		 this.limit=limit;
	 }
	 public int getLimit() {
		 return limit;
	 }
	 public void printFibonacciSeries() {
		 int number1=0;
		 int number2=1;
		 System.out.println("0 + 1");
		 int sum=0;
		 for(int i=0;i<limit-2;i++) {
			 sum=number1+number2;
			 System.out.println("+"+sum+"");
			 number1=number2;
			 number2=sum;
		 }
	 }
	 public void printQubeFibonacciSeries() {
			for(int i=1;i<limit;i++)
				if(i%2==0)
					System.out.println(i*i + " ");
				else
					System.out.println(i*i*i+" ");
	
	}

}
