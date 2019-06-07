package AbstractFactory_Pattern;

public class AbstractFactoryPatternMain {

	public static void main(String[] args) {
	
		System.out.println("### Abstract Factory Pattern's Example is Runing ###\n");

		KullaniciFactory kullaniciFactory = new KullaniciFactory();
		System.out.println("KullaniciFactory'i Kullanarak Müşteri ve Yönetici Kullanıcılarımızı Oluşturulur :");
		Kullanici musteriKullanici= kullaniciFactory.getKullanici("Musteri");
		musteriKullanici.showUp();
		
		Kullanici yoneticiKullanici = kullaniciFactory.getKullanici("Yonetici");
		yoneticiKullanici.showUp();
		
		System.out.print("\n");
		
		System.out.println("ParasalislemFactory'i Kullanarak Transfer ve Yatırma işlemleri Oluşturulacaktır : ");
		ParasalislemiFactory parasalFactory = new ParasalislemiFactory();
		Parasalislemi transferIslemi= parasalFactory.getParasalislemi("transfer");
        transferIslemi.islemTuru();
        
		System.out.print("\n");
		Parasalislemi yatirmaIslemi= parasalFactory.getParasalislemi("yatirim");
		yatirmaIslemi.islemTuru();
	}

}
