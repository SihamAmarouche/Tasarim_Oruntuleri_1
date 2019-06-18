package Memento_pattern_with_MVC;

public class MementoPatternDemo {

	public static void main(String[] args) {
				
		Bankahesabi_Orginator orginator = new Bankahesabi_Orginator();
		Bankahesabi_CareTaker careTaker = new Bankahesabi_CareTaker();
		
		orginator.setState("Açýk");
		Bankahesabi_Memento memento_1 = orginator.saveStateToMemento();
		careTaker.add(memento_1);
		
		orginator.setState("Kapatýldý");
		Bankahesabi_Memento memento_2 = orginator.saveStateToMemento();
		careTaker.add(memento_2);

		orginator.setState("Donduruldu");
		
		BankahesabiController HesapController = new BankahesabiController();
		BankahesabiView HesapView = new BankahesabiView();
		
		HesapController.setBakiyeModel(orginator, careTaker);
		HesapController.setBakiyeView(HesapView);
		
		HesapController.getPatternBilgisi();
		HesapController.Bilgiler();
	
	}

}
