package AbstractFactory_Pattern;

public class FactoryProducer {
	
	final static String KULLANICI = "Kullanici";
	final static String PARASALISLEM = "Parasalislemi";
	
	public static AbstractFactory getFactory(String factory){
		if(KULLANICI.equalsIgnoreCase(factory)){
			return new KullaniciFactory();
		}else if(PARASALISLEM.equalsIgnoreCase(factory)){
			return new ParasalislemiFactory();
		}
		return null;
	}

}
