package Memento_pattern;


/// Bankahesabi_Memento Bankahesabi_Originator nesnesinin 
/// saklanacak özelliklerinin tanımlı olduğu nesne.

public class Bankahesabi_Memento {
	/// Burada banka hesabin durumu kaydedeilecektir ..
	private String account_State;
	
	public Bankahesabi_Memento(String account_State){
		this.account_State = account_State;
	}
	public String getState(){
		return account_State;
	}
	
}
