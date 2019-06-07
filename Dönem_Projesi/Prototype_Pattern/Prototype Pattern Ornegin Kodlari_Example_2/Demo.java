package Prototype_Pattern_Example2;

public class Demo {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("### Prototype Design Pattern's Example is Runing ###\n");

		BankaSubeleri bs = new BankaSubeleri();
		bs.setBankaName("Ziraat Bankasi");
		bs.loadData();
		
		
		BankaSubeleri bs2 = new BankaSubeleri();
	
		
		System.out.print("Burada g�r�ld��� gibi DeepCopy uygulanmaktad�r ilk Bankadan bir �ubeyi silersek iknicisinde o �ube silinmez/etkilmez!!");
		bs2 = bs.clone();
		bs2.setBankaName("Vakif Bankasi");
		bs.getSubeler().remove(2);
		
		System.out.println("\n");
		System.out.println(bs);
		System.out.println(bs2);

	}

}
 