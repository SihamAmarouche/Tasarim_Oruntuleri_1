package Mediator_Pattern;

public interface MerkeziBankaMediator {
	
	public void sendBilgilendirmeMesaj(String mesaj, BankaSubesi sube);
	void addSube(BankaSubesi sube);
}
