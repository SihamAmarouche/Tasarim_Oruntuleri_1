package BuilderPattern_Example_2;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("### Builder Design Pattern's Example is Runing ###\n");
		 Kullanici kullanici_1 = new KullaniciBuilderConcreate().kullanici_ad("Saliha").kullanici_soyad("Uslu")
				    .age(30)
				    .TC_No("99345678930")
				    .Telefon_No("1234567")
				    .kullanici_adresi("Fake address 1234")
				    .build();
		 //kullanici_1.toString();
				    System.out.println(kullanici_1+"\n");
		
		 Kullanici kullanici_2 = new KullaniciBuilderConcreate().kullanici_ad("Can").kullanici_soyad("Demir")
						    .age(30)
						    .TC_No("99336798930")
						    .Telefon_No("12967567")
						    .kullanici_adresi("Fake address 6588")
						    .build();
				 //kullanici_1.toString();
						    System.out.println(kullanici_2);
		
	}

}
