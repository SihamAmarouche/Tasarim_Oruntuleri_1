package Adapter_Pattern;

public class TurkLiraBirimi implements ParaBirimi{

	@Override
	public void paraBirimiBilgileri() {
	 System.out.println("Alýþveriþte Kullanýlan Para Birimi: Türk Lirasý");
		
	}

	@Override
	public void getParaMiktari(double miktar) {
		double m = miktar;
		System.out.printf("Alýþveriþte kullanýlacak para miktarý = %.2f TL\n", m);

	}

	@Override
	public void paraDegeri() {
		System.out.println("Türk Lirasý deðeri Dolar cinsinden ==> 1 TL = 0.1653 Dolar \n");
		
	}
	

}
