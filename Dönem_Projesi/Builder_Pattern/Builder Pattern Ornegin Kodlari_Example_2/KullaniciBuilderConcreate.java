package BuilderPattern_Example_2;

public class KullaniciBuilderConcreate implements KullaniciBuilder{
	private String kullanici_ad; // gerekli
	private String kullanici_soyad; // gerekli
	private int age; //opsiyinel
	private String TC_No;
	private String Telefon_No;
	private String kullanici_adresi;
	
	public KullaniciBuilder kullanici_ad(String kullanici_ad){
		this.kullanici_ad=kullanici_ad;
	    return this;
	}
	public KullaniciBuilder kullanici_soyad(String kullanici_soyad){
		this.kullanici_soyad=kullanici_soyad;
		return this;
	}
	public KullaniciBuilder age(int age){
		this.age=age;
		return this;
	}
	public KullaniciBuilder TC_No(String TC_No){
		this.TC_No=TC_No;
		return this;
	}
	public KullaniciBuilder Telefon_No(String Telefon_No){
		this.Telefon_No=Telefon_No;
		return this;
	}
	public KullaniciBuilder kullanici_adresi(String kullanici_adresi){
		this.kullanici_adresi=kullanici_adresi;
		return this;
	}
	// This method return final Kullanici object
	public Kullanici build(){
		Kullanici kullanici = new Kullanici(kullanici_ad,kullanici_soyad,age,TC_No,Telefon_No,kullanici_adresi);
		return kullanici;
	}
}
