package AbstractFactory_Pattern;

public abstract class AbstractFactory {
	
	abstract Kullanici getKullanici(String kullaniciTuru);
	abstract Parasalislemi getParasalislemi(String islemTuru);

}
