package AbstractFactory_Pattern;

public class AbstractFactoryPatternMain {

	public static void main(String[] args) {
	
		System.out.println("### Abstract Factory Pattern's Example is Runing ###\n");

		KullaniciFactory kullaniciFactory = new KullaniciFactory();
		System.out.println("KullaniciFactory'i Kullanarak M��teri ve Y�netici Kullan�c�lar�m�z� Olu�turulur :");
		Kullanici musteriKullanici= kullaniciFactory.getKullanici("Musteri");
		musteriKullanici.showUp();
		
		Kullanici yoneticiKullanici = kullaniciFactory.getKullanici("Yonetici");
		yoneticiKullanici.showUp();
		
		System.out.print("\n");
		
		System.out.println("ParasalislemFactory'i Kullanarak Transfer ve Yat�rma i�lemleri Olu�turulacakt�r : ");
		ParasalislemiFactory parasalFactory = new ParasalislemiFactory();
		Parasalislemi transferIslemi= parasalFactory.getParasalislemi("transfer");
        transferIslemi.islemTuru();
        
		System.out.print("\n");
		Parasalislemi yatirmaIslemi= parasalFactory.getParasalislemi("yatirim");
		yatirmaIslemi.islemTuru();
	}

}
