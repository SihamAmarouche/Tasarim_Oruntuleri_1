package AbstractFactory_Pattern;

public class KullaniciFactory extends AbstractFactory{
	
	final String Musteri_Kullanici="Musteri";
	final String Yonetici_Kullanici="Yonetici";
	
	@Override
	Kullanici getKullanici(String kullaniciTuru) {
		
		if (Musteri_Kullanici.equals(kullaniciTuru)){
			return new Musteri();
		}else if (Yonetici_Kullanici.equals(kullaniciTuru)){
			return new Yonetici();
		}else 
			return null;	
		
	}

	@Override
	Parasalislemi getParasalislemi(String islemTuru) {
		return null;
	}

}
