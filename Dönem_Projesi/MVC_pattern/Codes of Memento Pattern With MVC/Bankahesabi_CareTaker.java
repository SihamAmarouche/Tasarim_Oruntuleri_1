package Memento_pattern_with_MVC;


import java.util.ArrayList;
import java.util.List;

//Saklanacak olan memento nesnesinin referansını içinde barındıran nesnedir.

public class Bankahesabi_CareTaker {
	
	private List<Bankahesabi_Memento> mementoList = new ArrayList<Bankahesabi_Memento>();
	
	public void add(Bankahesabi_Memento m){
		mementoList.add(m);
	}
	public Bankahesabi_Memento get(int index){
		return mementoList.get(index);
	}
	
}
