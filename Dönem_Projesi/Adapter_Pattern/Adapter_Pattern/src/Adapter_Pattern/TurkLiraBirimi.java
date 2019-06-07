package Adapter_Pattern;

public class TurkLiraBirimi implements ParaBirimi{

	@Override
	public void paraBirimiBilgileri() {
	 System.out.println("Al��veri�te Kullan�lan Para Birimi: T�rk Liras�");
		
	}

	@Override
	public void getParaMiktari(double miktar) {
		double m = miktar;
		System.out.printf("Al��veri�te kullan�lacak para miktar� = %.2f TL\n", m);

	}

	@Override
	public void paraDegeri() {
		System.out.println("T�rk Liras� de�eri Dolar cinsinden ==> 1 TL = 0.1653 Dolar \n");
		
	}
	

}
