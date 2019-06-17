package AbstractFactory_Pattern;

public class YatirmaIslemiFactory extends AbstractFactory{
	
	final String yatirma_islemi="yatirma";
	final String Musteri_Kullanici="Musteri";
	@Override
	Parasalislemi getParasalislemi(String islemTuru) {
		if (yatirma_islemi.equals(islemTuru)){
			return new Yatirmaislemi();
		}else
			return null;
	}

	@Override
	Kullanici getIslemSorumlusu(String kullaniciTuru) {
		if (Musteri_Kullanici.equals(kullaniciTuru)){
			return new Musteri();
		}else 
			return null;	
	}

	

}
