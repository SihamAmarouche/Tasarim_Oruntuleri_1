package BuilderPattern_Example_1;

import java.text.DecimalFormat;

public class YatirmaislemiBuilder implements ParaislemiBuilder{
	
	 private static DecimalFormat df2=new DecimalFormat("#.##");
	 
	double islemTutari;
	double hesapBakiye;
	String hesapNo;
	String hesapSahibi_Telefon_No;
	@Override
	public YatirmaislemiBuilder islemTutari(double islemTutari) {
		this.islemTutari=islemTutari;
		System.out.println("Yatýrým Edilecek Para Tutari : "+df2.format(islemTutari)+"TL");
		return this;
	}

	@Override
	public YatirmaislemiBuilder hesapBakiye(double hesapBakiye) {
		System.out.println("Para Yatirma Ýþlemi Ýçin Kullanýlacak Hesabýn Hesap Bakiyesi: "+df2.format(hesapBakiye)+" TL");
        this.hesapBakiye=hesapBakiye;
		return this;
	}

	@Override
	public YatirmaislemiBuilder hesapNo(String hesapNo) {
		System.out.println("Para Yatýrma Ýþlemi Ýçin Kullanýlan Hesabýn Hesap Numarasi:"+hesapNo);
		this.hesapNo=hesapNo;
		return this;
	}

	@Override
	public YatirmaislemiBuilder hesapSahibi_Telefon_No(String hesapSahibi_Telefon_No) {
		System.out.println("Hesap Sahibinin Telefon Numarasi : "+hesapSahibi_Telefon_No);
		this.hesapSahibi_Telefon_No=hesapSahibi_Telefon_No;
		return this;
	}

	@Override
	public Yatirmaislemi build() {
		Yatirmaislemi yatirim = new Yatirmaislemi(islemTutari,hesapBakiye,hesapNo,hesapSahibi_Telefon_No);
		return yatirim;
	}

}
