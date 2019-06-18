package FullProject_Main_Program;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

import AbstractFactory_Pattern.YatirmaIslemiFactory;
import AbstractFactory_Pattern.TransferIslemiFactory;
import Adapter_Pattern.DolarBirimi_Adaptee;
import Adapter_Pattern.ParaBirimi;
import Adapter_Pattern.ParaBirimiAdapter;
import Adapter_Pattern.TurkLiraBirimi;
import BuilderPattern_Example_1.Transferislemi;
import BuilderPattern_Example_1.TransferislemiBuilder;
import BuilderPattern_Example_1.Yatirmaislemi;
import BuilderPattern_Example_1.YatirmaislemiBuilder;
import BuilderPattern_Example_2.KullaniciBuilderConcreate;
import BuilderPattern_Example_2.Kullanici_build;
import FactoryPattern_Example_1.Parasalislemi;
import FactoryPattern_Example_1.ParasalislemiFactory;
import FactoryPattern_Example_2.Kullanici;
import FactoryPattern_Example_2.SystemElementFactory;
import Iterator_Pattern_Example.Container;
import Iterator_Pattern_Example.Iterator;
import Iterator_Pattern_Example.MusteriContainer;
import Iterator_Pattern_Example.YoneticiContainer;
import Mediator_Pattern.BankaSubesi;
import Mediator_Pattern.BankaSubesi_Impl;
import Mediator_Pattern.MerkeziBankaMediator;
import Mediator_Pattern.MerkeziBankaMediator_Impl;
import Memento_pattern.Bankahesabi_CareTaker;
import Memento_pattern.Bankahesabi_Memento;
import Memento_pattern.Bankahesabi_Orginator;
import ObjectPool_Pattern_Example.ExportingProcess;
import ObjectPool_Pattern_Example.ExportingTask;
import ObjectPool_Pattern_Example.OturumObjectPool;
import Observer_Pattern.BankaKullanici;
import Observer_Pattern.Kampanya;
import Observer_Pattern.KampanyaMesaj_Subscriber;
import Observer_Pattern.Observer;
import Prototype_Pattern_Example1.CloneFactory;
import Prototype_Pattern_Example1.Musteri;
import Prototype_Pattern_Example1.Yonetici;
import Singleton_Pattern.hesapBakiye;

public class MainProgram {
	
	private static Scanner scanner;
	static Random random = new Random();

	private OturumObjectPool<ExportingProcess> pool;  
    private AtomicLong processNo=new AtomicLong(0);  
    public void setUp() { 
  	  // Create a pool of objects of type ExportingProcess.  
  	  pool = new OturumObjectPool<ExportingProcess>(6, 10, 5)  
        {  
            protected ExportingProcess createObject()  
            {  
                // create a test object which takes some time for creation  
                return new ExportingProcess( processNo.incrementAndGet());  
            }  
        };  
    }  
    public void tearDown() {  
        pool.shutdown();  
    }  
    public void testObjectPool() {  
        ExecutorService executor = Executors.newFixedThreadPool(8);  
  
        // execute 8 tasks in separate threads  
          
        executor.execute(new ExportingTask(pool, 1));  
        executor.execute(new ExportingTask(pool, 2));  
        executor.execute(new ExportingTask(pool, 3));  
        executor.execute(new ExportingTask(pool, 4));  
        executor.execute(new ExportingTask(pool, 5));  
        executor.execute(new ExportingTask(pool, 6));  
        executor.execute(new ExportingTask(pool, 7));  
        executor.execute(new ExportingTask(pool, 8));  
  
        executor.shutdown();  
        
        try {  
            executor.awaitTermination(30, TimeUnit.SECONDS);  
            } catch (InterruptedException e)  
              
              {  
               e.printStackTrace();  
              }  
    }
	public static void main(String[] args) throws ClassNotFoundException {
		
		scanner = new Scanner(System.in);
		hesapBakiye obj1 = hesapBakiye.CreateObject();
		hesapBakiye obj2 = hesapBakiye.CreateObject();
		hesapBakiye obj3 = hesapBakiye.CreateObject();
   
		obj1.setBakiye(2000);
		
		System.out.println("### Singleton Design Pattern's Example is Runing ###\n");

		System.out.printf("obj1-Bakiye : %.2f \n", obj1.getBakiye());
		System.out.printf("obj2-Bakiye : %.2f \n", obj2.getBakiye());
		System.out.printf("obj3-Bakiye : %.2f \n\n", obj3.getBakiye());
		
		obj2.setBakiye(3000);
		
		System.out.printf("obj1-Bakiye : %.2f \n", obj1.getBakiye());
		System.out.printf("obj2-Bakiye : %.2f \n", obj2.getBakiye());
		System.out.printf("obj3-Bakiye : %.2f \n", obj3.getBakiye());
		
		//System.out.println("\nYat�r�lacak Paran�n Tutar�n� Giriniz L�tfen (Double Number) :");
		//double yatirilanPara = scanner.nextDouble();
		double yatirilanPara = 250;
		if(obj2.ParaYatir(yatirilanPara)){
			System.out.printf("\nYat�r�lacak Paran�n Tutar�:%.2f TL dir\n",yatirilanPara);
			System.out.printf("%.2f TL Hesab�n�za Ba�ar�yle Yat�r�ld� !!",yatirilanPara);
			
			System.out.printf("\nobj1-Bakiye : %.2f \n", obj1.getBakiye());
			System.out.printf("obj2-Bakiye : %.2f \n", obj2.getBakiye());
			System.out.printf("obj3-Bakiye : %.2f \n", obj3.getBakiye());
		}else{
			System.out.println("L�tfen istenilen kriterlere uygun bir say� giriniz !!");
		}
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
		
		System.out.println("### Factory Design Pattern's Example is Runing [Example 1]###\n");

		Parasalislemi islem = ParasalislemiFactory.CreateIslem("transfer");
		islem.islemTuru();
		
		System.out.print("\n");
		
	    islem = ParasalislemiFactory.CreateIslem("borc");
	    islem.islemTuru();
	    
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
		System.out.println("### Factory Design Pattern's Example is Runing [Example 2]###\n");

		// Random olarak olusturulacak
		int loop=7;
		while(loop>0){
			Kullanici kullanici = SystemElementFactory.createKullanici(getRandom(1,2));
			kullanici.showUp();
			loop--;
		}
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
		 System.out.println("### Object Pool Design Pattern's Example is Runing ###\n");
		 // Reference >> https://www.javatpoint.com/object-pool-pattern
		 MainProgram op=new MainProgram();  
         op.setUp();  
         op.tearDown();  
         op.testObjectPool(); 
 		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
 		System.out.println("### Prototype Pattern's Example is Runing [Deep Copy] ###\n");

		CloneFactory kullaniciMaker = new CloneFactory();
		
		Musteri orijinalMusteri = new Musteri();
		Musteri clonedMusteri = (Musteri)kullaniciMaker.getDeepClone(orijinalMusteri);
		 
		orijinalMusteri.showUp();
		clonedMusteri.showUp();
		System.out.println();
		
		System.out.println("orijinal Musterinin Adresi: "+ System.identityHashCode(orijinalMusteri));
		System.out.println("Cloned Musterinin Adresi: "+ System.identityHashCode(clonedMusteri));
		
		System.out.println();
		System.out.println("Clonelanan M��terinin ya� de�erini de�i�tirirsek orijinal m��terinin de�eri de�i�mez, ��nk� burada DeepCopy Cloning uygulandi!!");
		clonedMusteri.setAge(36);
		orijinalMusteri.showUp();
		clonedMusteri.showUp();
		
		System.out.println("***********Deep Cloninig 2.metodu ile test etmek***********");
		
		
		System.out.println("\n****Sisteme Yeni Y�neticileri Eklenecek !!****");
		Yonetici orijinalYonetici = new Yonetici();
		Yonetici clonedYonetici = (Yonetici)kullaniciMaker.getDeepCloneMethod_2(orijinalYonetici);
		
		orijinalYonetici.showUp();
		clonedYonetici.showUp();
		System.out.println();
		
		System.out.println("orijinal Yoneticinin Adresi: "+ System.identityHashCode(orijinalYonetici));
		System.out.println("Cloned Yoneticinin Adresi: "+ System.identityHashCode(clonedYonetici));
		
		System.out.println();
		System.out.println("Clonelanan Y�neticinin ya� de�erini de�i�tirirsek orijinal y�neticinin de�eri de�i�mez, ��nk� burada DeepCopy Cloning 2.metod uygulandi!!");
		clonedYonetici.setAge(65);
		orijinalYonetici.showUp();
		clonedYonetici.showUp();
		
 		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
 		System.out.println("### Prototype Pattern's Example is Runing [Shallow Copy] ###\n");

		CloneFactory kullaniciMaker_Shallow = new CloneFactory();
		
		Musteri orijinalMusteri_Shallow = new Musteri();
		Musteri clonedMusteri_Shallow = (Musteri)kullaniciMaker_Shallow.getShallowClone(orijinalMusteri_Shallow);
		
		orijinalMusteri_Shallow.showUp();
		clonedMusteri_Shallow.showUp();
		System.out.println();
		
		System.out.println("orijinal Musterinin Adresi: "+ System.identityHashCode(orijinalMusteri_Shallow));
		System.out.println("Cloned Musterinin Adresi: "+ System.identityHashCode(clonedMusteri_Shallow));
		
		System.out.println();
		System.out.println("Clonelanan M��terinin ya� de�erini de�i�tirirsek orijinal m��terinin de�eri de de�i�ir, ��nk� burada ShallowCopy Cloning uygulandi!!");
		clonedMusteri_Shallow.age=24;
		orijinalMusteri_Shallow.showUp();
		clonedMusteri_Shallow.showUp();
		
		
		System.out.println("\n****Sisteme Yeni Y�neticileri Eklenecek !!****");
		Yonetici orijinalYonetici_Shallow = new Yonetici();
		Yonetici clonedYonetici_Shallow = (Yonetici)kullaniciMaker.getShallowClone(orijinalYonetici_Shallow);
		
		orijinalYonetici_Shallow.showUp();
		clonedYonetici_Shallow.showUp();
		System.out.println();
		
		System.out.println("orijinal Yoneticinin Adresi: "+ System.identityHashCode(orijinalYonetici_Shallow));
		System.out.println("Cloned Yoneticinin Adresi: "+ System.identityHashCode(clonedYonetici_Shallow));
		
		System.out.println();
		System.out.println("Clonelanan Y�neticinin ya� de�erini de�i�tirirsek orijinal y�neticinin de�eri de de�i�ir, ��nk� burada ShallowCopy Cloning uygulandi!!");
		clonedYonetici_Shallow.setAge(39);
		orijinalYonetici_Shallow.showUp();
		clonedYonetici_Shallow.showUp();
 		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
 		System.out.println("### Builder Design Pattern's Example is Runing [Example 2] ###\n");

		Transferislemi transfer_1=new TransferislemiBuilder()
				.islemTutari(50.246).hesapBakiye(1000).hesapNo("1235 6786 8335 4467")
				.hesapSahibi_Telefon_No("+90 5647869843").build();
		transfer_1.islemTuru();
		System.out.println(transfer_1+"\n");
		
		
		Yatirmaislemi yatirim_1=new YatirmaislemiBuilder()
				.islemTutari(100.949).hesapBakiye(34500).hesapNo("4789 6786 9084 3267")
				.hesapSahibi_Telefon_No("+90 5268692843").build();
		yatirim_1.islemTuru();
		System.out.println(yatirim_1+"\n");
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
		System.out.println("### Builder Design Pattern's Example is Runing ###\n");
		Kullanici_build  kullanici_1 = new KullaniciBuilderConcreate().kullanici_ad("Saliha").kullanici_soyad("Uslu")
				    .age(30)
				    .TC_No("99345678930")
				    .Telefon_No("1234567")
				    .kullanici_adresi("Fake address 1234")
				    .build();
		 //kullanici_1.toString();
				    System.out.println(kullanici_1+"\n");
		
	    Kullanici_build  kullanici_2 = new KullaniciBuilderConcreate().kullanici_ad("Can").kullanici_soyad("Demir")
						    .age(30)
						    .TC_No("99336798930")
						    .Telefon_No("12967567")
						    .kullanici_adresi("Fake address 6588")
						    .build();
				 //kullanici_1.toString();
						    System.out.println(kullanici_2);
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");

		System.out.println("### Abstract Factory Pattern's Example is Runing ###\n");

		TransferIslemiFactory transferIslemiFactory = new TransferIslemiFactory();
		YatirmaIslemiFactory yatirmaIslemiFactory = new YatirmaIslemiFactory();

		System.out.println("YatirmaIslemiFactory'i Kullanarak Yat�rma ��lemi ve Sorumlusu Olan M��teri Kullan�c�m�z� Olu�turuluyor:");
		AbstractFactory_Pattern.Parasalislemi yatirmaIslemi= yatirmaIslemiFactory.getParasalislemi("yatirma");
		AbstractFactory_Pattern.Kullanici musteriKullanici= yatirmaIslemiFactory.getIslemSorumlusu("Musteri");
		yatirmaIslemi.islemTuru();
		musteriKullanici.showUp();
		
		
		System.out.print("\n");
		
		System.out.println("TransferIslemiFactory'i Kullanarak Transfer ��lemi ve Sorumlusu Olan Y�netici Kullan�c�m�z� Olu�turuluyor: ");
		AbstractFactory_Pattern.Parasalislemi transferIslemi= transferIslemiFactory.getParasalislemi("transfer");
		AbstractFactory_Pattern.Kullanici yoneticiKullanici = transferIslemiFactory.getIslemSorumlusu("Yonetici");
        transferIslemi.islemTuru();
		yoneticiKullanici.showUp();
        
		System.out.print("\n");
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");

		System.out.println("### Iterator Design Pattern's Example is Runing ###\n");

		System.out.println("--> Iterator Vas�tas� �le Sistemin M��terilerin Bilgileri Geri G�ndermek!!\n");
		Container iContainer = new MusteriContainer();
		Iterator iIterator = iContainer.createIterator();
		while(iIterator.hasNext()){
			Object object = iIterator.next();
			System.out.println(object);
		}
		System.out.println();
		System.out.println("--> Iterator Vas�tas� �le Sistemin Y�neticilerin Bilgileri Geri G�ndermek!!\n");
		Container yoneticiContainer = new YoneticiContainer();
		Iterator yoneticiIterator = yoneticiContainer.createIterator();
		while(yoneticiIterator.hasNext()){
			Object yoneticiObj=yoneticiIterator.next();
			System.out.println(yoneticiObj);
		}
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
		System.out.println("### Observer Design Pattern's Example is Runing ###\n");

		// Create subjects
		KampanyaMesaj_Subscriber kampanyaMsg=new KampanyaMesaj_Subscriber();
		
		// Create observers
		Observer observer_1 = new BankaKullanici("Aykut Demir");
		Observer observer_2 = new BankaKullanici("Alp Erdo�an");
        Observer observer_3 = new BankaKullanici("Merve Do�anAy");
        
        // add observer to topic
        kampanyaMsg.addObserver(observer_1);
        kampanyaMsg.addObserver(observer_2);
        kampanyaMsg.addObserver(observer_3);
        
        // Connect observer to subject
        observer_1.setSubject(kampanyaMsg);
        observer_2.setSubject(kampanyaMsg);
        observer_3.setSubject(kampanyaMsg);
        
        observer_1.update();
        observer_3.update();
        
        Kampanya kampanya = new Kampanya("�lk Kampanyam�z","Kampanyamiz Altin dovizi alimi ile ilgilidir","1 ayd�r");
        // Send Kampanya bilgileri
        kampanyaMsg.postMessage(kampanya);
        System.out.println("---------------------------------------------------\n");
        kampanyaMsg.removeObserver(observer_2);
        Kampanya kampanya_2 = new Kampanya("2. Kampanyam�z","�ocuklar�n gelece�i i�in kumbara kampanyas�na kat�l�n","2 ayd�r");
        kampanyaMsg.postMessage(kampanya_2);
        System.out.println("---------------------------------------------------\n");
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");

		System.out.println("### Mediator Design Pattern's Example is Runing ###\n");

		MerkeziBankaMediator mediator = new MerkeziBankaMediator_Impl();
		
		BankaSubesi sube_1 = new BankaSubesi_Impl(mediator, "Istanbul Banka ��besi");
		BankaSubesi sube_2 = new BankaSubesi_Impl(mediator, "Ankara Banka ��besi");
		BankaSubesi sube_3 = new BankaSubesi_Impl(mediator, "�zmir Banka ��besi");
		BankaSubesi sube_4 = new BankaSubesi_Impl(mediator, "Bursa Banka ��besi");
 
		mediator.addSube(sube_1);
		mediator.addSube(sube_2);
		mediator.addSube(sube_3);
		mediator.addSube(sube_4);
		
		sube_1.sendMesaj("T�m ��belere Dikkatine 1. Bilgilendirme mesaji !!!");
	    System.out.print("\n");
		sube_4.sendMesaj("T�m ��belere Dikkatine 2. Bilgilendirme mesaji !!!");
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");

		System.out.println("### Memento Design Pattern's Example is Runing ###\n");
		
		Bankahesabi_Orginator orginator = new Bankahesabi_Orginator();
		Bankahesabi_CareTaker careTaker = new Bankahesabi_CareTaker();
		
		orginator.setState("A��k");
		Bankahesabi_Memento memento_1 = orginator.saveStateToMemento();
		careTaker.add(memento_1);
		
		orginator.setState("Kapat�ld�");
		Bankahesabi_Memento memento_2 = orginator.saveStateToMemento();
		careTaker.add(memento_2);

		orginator.setState("Donduruldu");
		System.out.println("Banka hesabinin �imdiki Durumu: "+orginator.getState());
		
		orginator.getStateFromMemento(careTaker.get(0));
		System.out.println("Hesab�n Kaydedilen �lk Durumu: "+ orginator.getState());
		
		orginator.getStateFromMemento(careTaker.get(1));
		System.out.println("Hesab�n Kaydedilen �kinci Durumu: "+ orginator.getState());
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
		System.out.println("### Adapter Design Pattern's Example is Runing ###\n");

		ParaBirimi turkLira = new TurkLiraBirimi();
		ParaBirimi dolar_parasi = new ParaBirimiAdapter(new DolarBirimi_Adaptee());
		
		alisverisYap(turkLira);
		alisverisYap(dolar_parasi);
		
		System.out.println("--------------------------------------------------------\n");
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");

	}
	
	
	
	
	public static int getRandom(int min, int max){
		return random.nextInt((max-min)+1)+ min;
	}
	private static void alisverisYap(ParaBirimi para) {
		para.paraBirimiBilgileri();
		para.getParaMiktari(1250.0);
		para.paraDegeri();		
		
	}

}
