package BuilderPattern_Example_1;

public class MainProgram {

	public static void main(String[] args) {
		
		System.out.println("### Builder Design Pattern's Example is Runing ###\n");

		Transferislemi transfer_1=new TransferislemiBuilder()
				.islemTutari(50.246).hesapBakiye(1000).hesapNo("1235 6786 8335 4467")
				.hesapSahibi_Telefon_No("+90 5647869843").build();
		transfer_1.islemTuru();
		System.out.println(transfer_1+"\n");
		
		
		Yatirmaislemi yatirim_1=new YatirmaislemiBuilder()
				.islemTutari(100.949).hesapBakiye(34500).hesapNo("4789 6786 9084 3267")
				.hesapSahibi_Telefon_No("+90 5268692843").build();
		yatirim_1.islemTuru();
		System.out.println(yatirim_1+"\n");

	}

}
