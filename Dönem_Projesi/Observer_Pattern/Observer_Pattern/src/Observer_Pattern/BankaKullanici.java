package Observer_Pattern;

import java.util.ArrayList;

public class BankaKullanici implements Observer{
	
	String kullanici_name;
	private Subject topic;
	
	public BankaKullanici(String name){
		this.kullanici_name=name;
	}
	
	
	@Override
	public void update() {
		Kampanya kmp = (Kampanya) topic.getUpdate(this);
		String msg = kmp.getKampanyaIcerik();
		if (msg==null){
			System.out.println(kullanici_name+" :: Kampanya Mesaji yoktur !!");
		}else 
			System.out.println(kullanici_name+" :: Kampanya Mesaji vardir !! ==> Kampanyanýn Ýçeriði: "+msg);
	}

	
	@Override
	public void setSubject(Subject sub) {
		this.topic = sub;
		
	}
	
}
