package AbstractFactory_Pattern;

public class ParasalislemiFactory extends AbstractFactory{
	
	final String transfer_islemi="transfer";
	final String yatirma_islemi="yatirim";

	@Override
	Parasalislemi getParasalislemi(String islemTuru) {
		if (transfer_islemi.equals(islemTuru)){
			return new Transferislemi();
		}
		else if (yatirma_islemi.equals(islemTuru)){
			return new Yatirmaislemi();
		}else
			return null;
	}

	@Override
	Kullanici getKullanici(String kullaniciTuru) {
		return null;
	}

}
