package Iterator_Pattern_Example;

import java.util.List;

public class MusteriIterator implements Iterator{

	private List<Musteri> iteratmusteriList;
	public MusteriIterator(List<Musteri> kullaniciList){
		this.iteratmusteriList=kullaniciList;
	}
	public boolean hasNext() {
		if (iteratmusteriList.size()>0)
			return true;
		else
			return false;
	}

	
	public Object next() {
		if(this.hasNext()){
			Musteri musteri = iteratmusteriList.get(0);
			iteratmusteriList.remove(0);
			return musteri;
		}else
			return null;
	}

}
