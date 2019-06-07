package BuilderPattern_Example_1;

public abstract class Parasalislemi {
	
	public void islemTuru() {
		System.out.println("Hesabınız ile bir parasal işlemi gerçekleşetirilecektir!!");
	}
	public abstract double getIslemTutari();
	public abstract double getHesapBakiye();
	public abstract String getHesapNo();
	public abstract String getHesapSahibi_TelefonNo();
	
}
