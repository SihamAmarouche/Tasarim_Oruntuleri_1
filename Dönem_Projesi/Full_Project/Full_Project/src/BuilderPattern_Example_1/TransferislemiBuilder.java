package BuilderPattern_Example_1;

import java.text.DecimalFormat;

public class TransferislemiBuilder implements ParaislemiBuilder {
	
	private static DecimalFormat df2=new DecimalFormat("#.##");
	
	double islemTutari;
	double hesapBakiye;
	String hesapNo;
	String hesapSahibi_Telefon_No;
	
	@Override
	public TransferislemiBuilder islemTutari(double islemTutari) {
		
		this.islemTutari=islemTutari;
		System.out.println("Transfer Edilecek Para Tutari : "+df2.format(islemTutari)+"TL");
		return this;
	}

	@Override
	public TransferislemiBuilder hesapBakiye(double hesapBakiye) {
		this.hesapBakiye=hesapBakiye;
		System.out.println("Para Transferi Ýçin Kullanýlacak Hesabýn Hesap Bakiyesi: "+df2.format(hesapBakiye)+" TL");
		return this;
	}

	@Override
	public TransferislemiBuilder hesapNo(String hesapNo) {
		this.hesapNo=hesapNo;
		System.out.println("Para Transferi Ýçin Kullanýlan Hesabýn Hesap Numarasi:"+hesapNo);
		return this;
	}

	@Override
	public TransferislemiBuilder hesapSahibi_Telefon_No(String hesapSahibi_Telefon_No) {
		this.hesapSahibi_Telefon_No=hesapSahibi_Telefon_No;
		System.out.println("Hesap Sahibinin Telefon Numarasi : "+hesapSahibi_Telefon_No);
		return this;
	}

	@Override
	public Transferislemi build() {
		Transferislemi transfer=new Transferislemi(islemTutari,hesapBakiye,hesapNo,hesapSahibi_Telefon_No);
		return transfer;
	}
	
	
}
