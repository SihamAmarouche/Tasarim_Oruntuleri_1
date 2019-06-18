package Memento_pattern_with_MVC;

public class BankahesabiView {
	
	public void printHesapDetails(Bankahesabi_Orginator orginator,Bankahesabi_CareTaker careTaker){
		
		System.out.println("Banka hesabinin �imdiki Durumu: "+orginator.getState());
		
		orginator.getStateFromMemento(careTaker.get(0));
		System.out.println("Hesab�n Kaydedilen �lk Durumu: "+ orginator.getState());
		
		orginator.getStateFromMemento(careTaker.get(1));
		System.out.println("Hesab�n Kaydedilen �kinci Durumu: "+ orginator.getState());
	}
	public void patternBilgisi(){
		System.out.println("### Memento Design Pattern's Example is Runing ###\n");
	}
	
	
}
