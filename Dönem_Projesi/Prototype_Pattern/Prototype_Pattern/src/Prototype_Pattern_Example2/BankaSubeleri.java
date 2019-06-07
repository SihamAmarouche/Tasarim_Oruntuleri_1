 package Prototype_Pattern_Example2;

import java.util.ArrayList;
import java.util.List;

public class BankaSubeleri implements Cloneable{
	
	private String BankaName;
	List<Sube> subeler=new ArrayList<Sube>();
	
	public String getBankaName() {
		return BankaName;
	}
	public void setBankaName(String BankaName) {
		this.BankaName = BankaName;
	}
	public List<Sube> getSubeler() {
		return subeler;
	}
	public void setSubeler(List<Sube> subeler) {
		this.subeler = subeler;
	}
	public void loadData(){
		
		for(int i=1;i<=4;i++){
			
			Sube s = new Sube();
			s.setBid(i);
			s.setSube_name("Sube "+i);
			getSubeler().add(s);
			
		}
	}
	@Override
	public String toString() {
		return "Banka Þubeleri: [BankaName= " + BankaName + ", subeler=" + subeler + "]";
	}
	@Override
	protected BankaSubeleri clone() throws CloneNotSupportedException {
		
		BankaSubeleri banka = new BankaSubeleri();
		
		for(Sube s : this.getSubeler()){
			banka.getSubeler().add(s);
		}		
		
		return banka;
	}
	
	
	
}
