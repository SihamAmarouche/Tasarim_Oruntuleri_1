 package Adapter_Pattern;

public class DolarBirimi_Adaptee {

	
	public void dolar_paraBirimiBilgileri() {
		 System.out.println("Alýþveriþte Kullanýlan Para Birimi: Dolar (USD)");
		
	}

	
	public void dolar_getParaMiktari(double miktar) {
		double m = miktar/6.044;
		System.out.printf("Alýþveriþte kullanýlacak para miktarý = %.2f Dolar(USD)\n", m);		
	}

	
	public void dolar_paraDegeri() {
		System.out.println("Dolar deðeri Türk Lirasý cinsinden ==> 1 Dolar = 6.044 TL \n");
		
	}

}
