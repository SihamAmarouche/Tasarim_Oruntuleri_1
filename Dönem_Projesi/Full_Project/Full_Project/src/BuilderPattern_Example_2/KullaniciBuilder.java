package BuilderPattern_Example_2;

public interface KullaniciBuilder {
	
	public KullaniciBuilder kullanici_ad(String kullanici_ad);
	public KullaniciBuilder kullanici_soyad(String kullanici_soyad);
	public KullaniciBuilder age(int age);
	public KullaniciBuilder TC_No(String TC_No);
	public KullaniciBuilder Telefon_No(String Telefon_No);
	public KullaniciBuilder kullanici_adresi(String kullanici_adresi);
	
	
	// This method return final Kullanici object
	public Kullanici_build build();
	
}
