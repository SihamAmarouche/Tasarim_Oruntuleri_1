package FactoryPattern_Example_1;

public class ParasalislemiFactory {

	public static Parasalislemi CreateIslem(String instanceName){
		if (instanceName.equals("borc")){
			return new BorcKrediOdeme();
		}
		else if (instanceName.equals("transfer")){
			return new Transferislemi();
		}
		else if (instanceName.equals("yatirim")){
			return new Yatirmaislemi();
		}else
			return null;
	}
}
