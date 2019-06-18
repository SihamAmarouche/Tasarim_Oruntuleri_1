package BuilderPattern_Example_1;

public abstract class Parasalislemi {
	
	public void islemTuru() {
		System.out.println("Hesabýnýz ile bir parasal iþlemi gerçekleþetirilecektir!!");
	}
	public abstract double getIslemTutari();
	public abstract double getHesapBakiye();
	public abstract String getHesapNo();
	public abstract String getHesapSahibi_TelefonNo();
	
}
