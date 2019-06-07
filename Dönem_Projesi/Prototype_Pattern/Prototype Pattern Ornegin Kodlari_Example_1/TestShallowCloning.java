package Prototype_Pattern_Example1;

public class TestShallowCloning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("### Prototype Design Pattern's Example is Runing ###\n");

		CloneFactory kullaniciMaker = new CloneFactory();
		
		Musteri orijinalMusteri = new Musteri();
		Musteri clonedMusteri = (Musteri)kullaniciMaker.getShallowClone(orijinalMusteri);
		
		orijinalMusteri.showUp();
		clonedMusteri.showUp();
		System.out.println();
		
		System.out.println("orijinal Musterinin Adresi: "+ System.identityHashCode(orijinalMusteri));
		System.out.println("Cloned Musterinin Adresi: "+ System.identityHashCode(clonedMusteri));
		
		System.out.println();
		System.out.println("Clonelanan Müþterinin yaþ deðerini deðiþtirirsek orijinal müþterinin deðeri de deðiþir, çünkü burada ShallowCopy Cloning uygulandi!!");
		clonedMusteri.age=24;
		orijinalMusteri.showUp();
		clonedMusteri.showUp();
		
		
		System.out.println("\n****Sisteme Yeni Yöneticileri Eklenecek !!****");
		Yonetici orijinalYonetici = new Yonetici();
		Yonetici clonedYonetici = (Yonetici)kullaniciMaker.getShallowClone(orijinalYonetici);
		
		orijinalYonetici.showUp();
		clonedYonetici.showUp();
		System.out.println();
		
		System.out.println("orijinal Yoneticinin Adresi: "+ System.identityHashCode(orijinalYonetici));
		System.out.println("Cloned Yoneticinin Adresi: "+ System.identityHashCode(clonedYonetici));
		
		System.out.println();
		System.out.println("Clonelanan Yöneticinin yaþ deðerini deðiþtirirsek orijinal yöneticinin deðeri de deðiþir, çünkü burada ShallowCopy Cloning uygulandi!!");
		clonedYonetici.setAge(39);
		orijinalYonetici.showUp();
		clonedYonetici.showUp();
		

	}

}
