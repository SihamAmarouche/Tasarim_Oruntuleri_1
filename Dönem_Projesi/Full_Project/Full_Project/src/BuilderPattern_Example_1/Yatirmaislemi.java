package BuilderPattern_Example_1;

import java.text.DecimalFormat;

public class Yatirmaislemi extends Parasalislemi{
	
    private static DecimalFormat df2=new DecimalFormat("#.##");
	
	double islemTutari;
	double hesapBakiye;
	String hesapNo;
	String hesapSahibi_Telefon_No;
	
	public Yatirmaislemi(double islemTutari,double hesapBakiye,String hesapNo,String hesapSahibi_TelefonNo){
		this.islemTutari=islemTutari;
		this.hesapBakiye=hesapBakiye;
		this.hesapNo=hesapNo;
		this.hesapSahibi_Telefon_No=hesapSahibi_TelefonNo;
	}

	public void islemTuru(){
		System.out.println("**** !! Hesabýnýza para yatýrma iþlemi baþarýyla gerçekleþtirilmiþtir !! ****");
	}
	@Override
	public double getIslemTutari() {
		System.out.println("Yatýrým Edilecek Para Tutari : "+df2.format(islemTutari)+" TL");
		return islemTutari;
	}

	@Override
	public double getHesapBakiye() {
		System.out.println("Para Yatirma Ýþlemi Ýçin Kullanýlacak Hesabýn Hesap Bakiyesi: "+df2.format(hesapBakiye)+" TL");
		return hesapBakiye;
	}

	@Override
	public String getHesapNo() {
		System.out.println("Para Yatýrma Ýþlemi Ýçin Kullanýlan Hesabýn Hesap Numarasi:"+hesapNo);
		return hesapNo;
	}

	@Override
	public String getHesapSahibi_TelefonNo() {
		System.out.println("Hesap Sahibinin Telefon Numarasi : "+hesapSahibi_Telefon_No);
		return hesapSahibi_Telefon_No;
	}

	@Override
	public String toString() {
		return "Yatirmaislemi [islemTutari= " + df2.format(islemTutari) + " TL, hesapBakiye= " + df2.format(hesapBakiye) + " TL, hesapNo=" + hesapNo
				+ ", hesapSahibi_Telefon_No=" + hesapSahibi_Telefon_No + "]";
	}

}
