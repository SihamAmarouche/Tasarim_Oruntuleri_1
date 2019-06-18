package AbstractFactory_Pattern;

public class TransferIslemiFactory extends AbstractFactory{
	
	final String Yonetici_Kullanici="Yonetici";
	final String transfer_islemi="transfer";

	@Override
	public Kullanici getIslemSorumlusu(String kullaniciTuru) {
		
		if (Yonetici_Kullanici.equals(kullaniciTuru)){
			return new Yonetici();
		}else 
			return null;	
		
	}

	@Override
	public Parasalislemi getParasalislemi(String islemTuru) {
		if(islemTuru.equals("transfer")){
			return new Transferislemi();
		}else
			return null;
	}

}
