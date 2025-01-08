package in.prec.logicalprograms.practiceseries;
//1 5 3 7 5 9 11 
public class FibSeries {
	int limit;
	 public FibSeries() {}
	 public FibSeries(int limit) {
		 this.limit=limit;
	 }
	 public void setlimit(int limit) {
		 this.limit=limit;
	 }
	 public int getLimit() {
		 return limit;
	 }
	 public void printFibSeries() {
		 int odd1=1;
		 int odd2=5;
		 for(int i=0;i<limit;i++) {
			 if(i%2==0) {
				 System.out.print(odd1+" ");
				 odd1 +=2;
			 }
			 else {
				 System.out.print(odd2+" ");
				 odd2 += 2;
			 }
		 }
	 }

}
