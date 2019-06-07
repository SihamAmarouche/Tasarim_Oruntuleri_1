package Prototype_Pattern_Example2;

public class Sube{
	private int bid;
	private String sube_name;
	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getSube_name() {
		return sube_name;
	}
	public void setSube_name(String sube_name) {
		this.sube_name = sube_name;
	}
	

	@Override
	public String toString() {
		return " [bid=" + bid + ", sube_name=" + sube_name + "]";
	}
	
}
