package Mediator_Pattern;

public class MainProgram {
	
	public static void main(String[] args){
		
		System.out.println("### Mediator Design Pattern's Example is Runing ###\n");

		MerkeziBankaMediator mediator = new MerkeziBankaMediator_Impl();
		
		BankaSubesi sube_1 = new BankaSubesi_Impl(mediator, "Istanbul Banka ��besi");
		BankaSubesi sube_2 = new BankaSubesi_Impl(mediator, "Ankara Banka ��besi");
		BankaSubesi sube_3 = new BankaSubesi_Impl(mediator, "�zmir Banka ��besi");
		BankaSubesi sube_4 = new BankaSubesi_Impl(mediator, "Bursa Banka ��besi");
 
		mediator.addSube(sube_1);
		mediator.addSube(sube_2);
		mediator.addSube(sube_3);
		mediator.addSube(sube_4);
		
		sube_1.sendMesaj("T�m ��belere Dikkatine 1. Bilgilendirme mesaji !!!");
	    System.out.print("\n");
		sube_4.sendMesaj("T�m ��belere Dikkatine 2. Bilgilendirme mesaji !!!");

	}
}
