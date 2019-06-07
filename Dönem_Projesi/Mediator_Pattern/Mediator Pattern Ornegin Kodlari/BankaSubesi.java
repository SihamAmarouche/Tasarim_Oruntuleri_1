package Mediator_Pattern;

public abstract class BankaSubesi {
	protected MerkeziBankaMediator mediator;
	protected String subeIsmi;
	
	public BankaSubesi(MerkeziBankaMediator mediator, String subeIsmi){
		this.mediator = mediator;
		this.subeIsmi = subeIsmi;
	}
	
	public abstract void sendMesaj(String mesaj);
	
	public abstract void receiveMesaj(String mesaj);
}
