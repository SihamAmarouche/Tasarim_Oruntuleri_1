package FactoryPattern_Example_2;

public class SystemElementFactory {
	
	public static final int Musteri=1;
	public static final int Yonetici=2;
	
	public static Kullanici createKullanici(int id){
		
		switch(id){
		case Musteri:
			return new Musteri();
		case Yonetici:
			return new Yonetici();
		default:
			return null;
		}
	}
	
	
}
