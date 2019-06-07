package FactoryPattern_Example_1;

public class Program {

	public static void main(String[] args) {
		System.out.println("### Factory Design Pattern's Example is Runing ###\n");

		Parasalislemi islem = ParasalislemiFactory.CreateIslem("transfer");
		islem.islemTuru();
		
		System.out.print("\n");
		
	    islem = ParasalislemiFactory.CreateIslem("borc");
	    islem.islemTuru();
	    
		

	}

}
