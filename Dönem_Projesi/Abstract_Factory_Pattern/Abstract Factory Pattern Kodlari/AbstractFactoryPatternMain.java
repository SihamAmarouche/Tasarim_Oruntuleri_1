package AbstractFactory_Pattern;

public class AbstractFactoryPatternMain {

	public static void main(String[] args) {
	
		System.out.println("### Abstract Factory Pattern's Example is Runing ###\n");

		TransferIslemiFactory transferIslemiFactory = new TransferIslemiFactory();
		YatirmaIslemiFactory yatirmaIslemiFactory = new YatirmaIslemiFactory();

		System.out.println("YatirmaIslemiFactory'i Kullanarak Yat�rma ��lemi ve Sorumlusu Olan M��teri Kullan�c�m�z� Olu�turuluyor:");
		Parasalislemi yatirmaIslemi= yatirmaIslemiFactory.getParasalislemi("yatirma");
		Kullanici musteriKullanici= yatirmaIslemiFactory.getIslemSorumlusu("Musteri");
		yatirmaIslemi.islemTuru();
		musteriKullanici.showUp();
		
		
		System.out.print("\n");
		
		System.out.println("TransferIslemiFactory'i Kullanarak Transfer ��lemi ve Sorumlusu Olan Y�netici Kullan�c�m�z� Olu�turuluyor: ");
		Parasalislemi transferIslemi= transferIslemiFactory.getParasalislemi("transfer");
		Kullanici yoneticiKullanici = transferIslemiFactory.getIslemSorumlusu("Yonetici");
        transferIslemi.islemTuru();
		yoneticiKullanici.showUp();
        
		System.out.print("\n");
		
	}

}
