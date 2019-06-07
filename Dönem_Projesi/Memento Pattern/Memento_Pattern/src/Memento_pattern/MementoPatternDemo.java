package Memento_pattern;

public class MementoPatternDemo {

	public static void main(String[] args) {
		
		System.out.println("### Memento Design Pattern2's Example is Runing ###\n");
		
		Bankahesabi_Orginator orginator = new Bankahesabi_Orginator();
		Bankahesabi_CareTaker careTaker = new Bankahesabi_CareTaker();
		
		orginator.setState("A��k");
		careTaker.add(orginator.saveStateToMemento());
		
		orginator.setState("Kapat�ld�");
		careTaker.add(orginator.saveStateToMemento());

		orginator.setState("Donduruldu");
		System.out.println("Banka hesabinin �imdiki Durumu: "+orginator.getState());
		
		orginator.getStateFromMemento(careTaker.get(0));
		System.out.println("Hesab�n Kaydedilen �lk Durumu: "+ orginator.getState());
		
		orginator.getStateFromMemento(careTaker.get(1));
		System.out.println("Hesab�n Kaydedilen �kinci Durumu: "+ orginator.getState());

	
	}

}
