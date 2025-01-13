package in.prec.staticandfinal.finaldemo;

public final class Holidays {
	final String festival;
	final int noOfLeaves;
	
	public Holidays(String festival, int noOfLeaves) {
		this.festival=festival;
		this.noOfLeaves=noOfLeaves;
	}
	public String getFestival() {
		return festival;
	}
	public int getNoOfLeaves() {
		return noofLeaves;
	}
	public String toString() {
		return "Festival: " + festival +", No of Leaves:" + noOfLeaves;
	}

}
