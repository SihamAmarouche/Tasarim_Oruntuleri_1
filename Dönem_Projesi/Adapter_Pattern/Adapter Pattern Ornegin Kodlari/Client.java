package Adapter_Pattern;

public class Client {
	public static void main(String[] args){
		
		System.out.println("### Adapter Design Pattern's Example is Runing ###\n");

		ParaBirimi turkLira = new TurkLiraBirimi();
		ParaBirimi dolar_parasi = new ParaBirimiAdapter(new DolarBirimi_Adaptee());
		
		alisverisYap(turkLira);
		alisverisYap(dolar_parasi);
		
		System.out.println("--------------------------------------------------------");

	}

	private static void alisverisYap(ParaBirimi para) {
		para.paraBirimiBilgileri();
		para.getParaMiktari(1250.0);
		para.paraDegeri();		
		
	}

}
