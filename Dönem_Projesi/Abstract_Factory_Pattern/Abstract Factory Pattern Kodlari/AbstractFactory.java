package AbstractFactory_Pattern;

public abstract class AbstractFactory {
	
	abstract Kullanici getIslemSorumlusu(String kullaniciTuru);
	abstract Parasalislemi getParasalislemi(String islemTuru);

}
