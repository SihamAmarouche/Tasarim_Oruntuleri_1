package Memento_pattern;

public class MementoPatternDemo {

	public static void main(String[] args) {
		
		System.out.println("### Memento Design Pattern's Example is Runing ###\n");
		
		Bankahesabi_Orginator orginator = new Bankahesabi_Orginator();
		Bankahesabi_CareTaker careTaker = new Bankahesabi_CareTaker();
		
		orginator.setState("Açýk");
		Bankahesabi_Memento memento_1 = orginator.saveStateToMemento();
		careTaker.add(memento_1);
		
		orginator.setState("Kapatýldý");
		Bankahesabi_Memento memento_2 = orginator.saveStateToMemento();
		careTaker.add(memento_2);

		orginator.setState("Donduruldu");
		System.out.println("Banka hesabinin þimdiki Durumu: "+orginator.getState());
		
		orginator.getStateFromMemento(careTaker.get(0));
		System.out.println("Hesabýn Kaydedilen Ýlk Durumu: "+ orginator.getState());
		
		orginator.getStateFromMemento(careTaker.get(1));
		System.out.println("Hesabýn Kaydedilen Ýkinci Durumu: "+ orginator.getState());

	
	}

}
