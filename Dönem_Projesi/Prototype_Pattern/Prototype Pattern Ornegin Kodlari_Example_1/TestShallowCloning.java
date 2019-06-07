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
		System.out.println("Clonelanan M��terinin ya� de�erini de�i�tirirsek orijinal m��terinin de�eri de de�i�ir, ��nk� burada ShallowCopy Cloning uygulandi!!");
		clonedMusteri.age=24;
		orijinalMusteri.showUp();
		clonedMusteri.showUp();
		
		
		System.out.println("\n****Sisteme Yeni Y�neticileri Eklenecek !!****");
		Yonetici orijinalYonetici = new Yonetici();
		Yonetici clonedYonetici = (Yonetici)kullaniciMaker.getShallowClone(orijinalYonetici);
		
		orijinalYonetici.showUp();
		clonedYonetici.showUp();
		System.out.println();
		
		System.out.println("orijinal Yoneticinin Adresi: "+ System.identityHashCode(orijinalYonetici));
		System.out.println("Cloned Yoneticinin Adresi: "+ System.identityHashCode(clonedYonetici));
		
		System.out.println();
		System.out.println("Clonelanan Y�neticinin ya� de�erini de�i�tirirsek orijinal y�neticinin de�eri de de�i�ir, ��nk� burada ShallowCopy Cloning uygulandi!!");
		clonedYonetici.setAge(39);
		orijinalYonetici.showUp();
		clonedYonetici.showUp();
		

	}

}
