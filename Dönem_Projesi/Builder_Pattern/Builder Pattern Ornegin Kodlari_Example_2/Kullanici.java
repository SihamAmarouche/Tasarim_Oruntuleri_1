package BuilderPattern_Example_2;

public class Kullanici {

	private final String kullanici_ad;
	private final String kullanici_soyad;
	private final int age;
	private final String TC_No;
	private final String Telefon_No;
	private final String kullanici_adresi;
	
	public Kullanici(String kullanici_ad,String kullanici_soyad,int age,String TC_No,String Telefon_No,String kullanici_adresi){
		this.kullanici_ad=kullanici_ad;
		this.kullanici_soyad=kullanici_soyad;
		this.age=age;
		this.TC_No=TC_No;
		this.Telefon_No=Telefon_No;
		this.kullanici_adresi=kullanici_adresi;
	}
	public String getKullanici_ad() {
		return kullanici_ad;
	}
	public String getKullanici_soyad() {
		return kullanici_soyad;
	}
	public int getAge() {
		return age;
	}
	public String getTC_No() {
		return TC_No;
	}
	public String getTelefon_No() {
		return Telefon_No;
	}
	public String getKullanici_adresi() {
		return kullanici_adresi;
	}
	@Override
	public String toString() {
		return "Kullanici adi=" + kullanici_ad + ", kullanici soyadi=" + kullanici_soyad + ", age=" + age
				+ ", TC_No=" + TC_No + ", Telefon_No=" + Telefon_No + ", kullanici_adresi=" + kullanici_adresi + "";
	}
	
	
}
