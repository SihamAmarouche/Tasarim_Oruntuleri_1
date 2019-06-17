package AbstractFactory_Pattern;

public class Kullanici {
	
	private String kullanici_turu;
	private int age;
	
	public void setKullanici_turu(String kullanici_turu){
		this.kullanici_turu = kullanici_turu;
	}
	public void setAge(int age){
		this.age = age;
	}
	public String getKullanici_turu(){
		return this.kullanici_turu;
	}
	public int getAge(){
		return this.age;	
	}
	
	
	public void showUp(){
		System.out.printf("Kullanýcý türü :[%s], Kullanýcý Yaþý:[%d]\n", getKullanici_turu(),getAge());
	}

}
