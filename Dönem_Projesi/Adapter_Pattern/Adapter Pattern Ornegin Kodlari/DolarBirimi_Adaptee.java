 package Adapter_Pattern;

public class DolarBirimi_Adaptee {

	
	public void dolar_paraBirimiBilgileri() {
		 System.out.println("Al��veri�te Kullan�lan Para Birimi: Dolar (USD)");
		
	}

	
	public void dolar_getParaMiktari(double miktar) {
		double m = miktar/6.044;
		System.out.printf("Al��veri�te kullan�lacak para miktar� = %.2f Dolar(USD)\n", m);		
	}

	
	public void dolar_paraDegeri() {
		System.out.println("Dolar de�eri T�rk Liras� cinsinden ==> 1 Dolar = 6.044 TL \n");
		
	}

}
