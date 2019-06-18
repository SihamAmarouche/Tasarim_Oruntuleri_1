package Mediator_Pattern;

public class BankaSubesi_Impl extends BankaSubesi{

	public BankaSubesi_Impl(MerkeziBankaMediator med, String mesaj){
		super(med,mesaj);
	}
	@Override
	public void sendMesaj(String mesaj) {
		
		System.out.println(this.subeIsmi + " Tarafýndan bu mesaj gönderildi : "+mesaj );
		mediator.sendBilgilendirmeMesaj(mesaj, this);
	}

	@Override
	public void receiveMesaj(String mesaj) {
		
		System.out.println(this.subeIsmi + " Tarafýndan bu mesaj alýndý : "+mesaj );
	}

}
