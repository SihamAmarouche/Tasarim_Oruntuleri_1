package BuilderPattern_Example_1;


public interface ParaislemiBuilder {
	
	public ParaislemiBuilder islemTutari(double islemTutari);
	public ParaislemiBuilder hesapBakiye(double hesapBakiye);
	public ParaislemiBuilder hesapNo(String hesapNo);
	public ParaislemiBuilder hesapSahibi_Telefon_No(String hesapSahibi_Telefon_No);
	
	// This method return final Kullanici object
	public Parasalislemi build();
	
}
