package FullProject_MainProgram_with_Interface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import AbstractFactory_Pattern.TransferIslemiFactory;
import AbstractFactory_Pattern.YatirmaIslemiFactory;
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
import FullProject_Main_Program.MainProgram;
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
import Observer_Pattern.BankaKullanici;
import Observer_Pattern.Kampanya;
import Observer_Pattern.KampanyaMesaj_Subscriber;
import Observer_Pattern.Observer;
import Prototype_Pattern_Example1.CloneFactory;
import Prototype_Pattern_Example1.Musteri;
import Prototype_Pattern_Example1.Yonetici;
import Singleton_Pattern.hesapBakiye;
import java.awt.SystemColor;
import java.awt.Font;

public class FullProject_MainProgram_with_Interface {

	private JFrame frame;
	private JTextField textField;
	static Random random = new Random();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FullProject_MainProgram_with_Interface window = new FullProject_MainProgram_with_Interface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FullProject_MainProgram_with_Interface() throws ClassNotFoundException{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 723, 775);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Hesap Bakiye Sorgulay\u0131n(Singleton Pattern)");
		btnNewButton.setIcon(new ImageIcon("C://Users//siham//workspace_designPattern//Full_Project//src//right_arrow.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
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
				
				//System.out.println("\nYatýrýlacak Paranýn Tutarýný Giriniz Lütfen (Double Number) :");
				//double yatirilanPara = scanner.nextDouble();
				double yatirilanPara = 250;
				if(obj2.ParaYatir(yatirilanPara)){
					System.out.printf("\nYatýrýlacak Paranýn Tutarý:%.2f TL dir\n",yatirilanPara);
					System.out.printf("%.2f TL Hesabýnýza Baþarýyle Yatýrýldý !!",yatirilanPara);
					
					System.out.printf("\nobj1-Bakiye : %.2f \n", obj1.getBakiye());
					System.out.printf("obj2-Bakiye : %.2f \n", obj2.getBakiye());
					System.out.printf("obj3-Bakiye : %.2f \n", obj3.getBakiye());
				}else{
					System.out.println("Lütfen istenilen kriterlere uygun bir sayý giriniz !!");
				}
				System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
				textField.setText("### Singleton Design Pattern's Example is Runing ###\n");
			
			}
		});
		btnNewButton.setBounds(12, 44, 322, 34);
		frame.getContentPane().add(btnNewButton);
		//validate();
		
		textField = new JTextField();
		textField.setBounds(346, 163, 347, 278);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setHorizontalAlignment(JTextField.CENTER);
		
		JButton btnFactory = new JButton("Ger\u00E7ekle\u015Fen Parasal \u0130\u015Flemleri G\u00F6sterin(Factory)");
		btnFactory.setIcon(new ImageIcon("C://Users//siham//workspace_designPattern//Full_Project//src//right_arrow.png"));

		btnFactory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
				textField.setText("### Factory Design Pattern's Examples are Runing ###");
			}
		});
		btnFactory.setBounds(12, 110, 322, 34);
		frame.getContentPane().add(btnFactory);
		
		JButton btnPro = new JButton("Bankan\u0131n M\u00FC\u015Fteri ve Y\u00F6netici Bilgileri(Prototype)");
		btnPro.setIcon(new ImageIcon("C://Users//siham//workspace_designPattern//Full_Project//src//right_arrow.png"));

		btnPro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("### Prototype Pattern's Example is Runing [Deep Copy] ###\n");

				CloneFactory kullaniciMaker = new CloneFactory();
				
				Musteri orijinalMusteri = new Musteri();
				Musteri clonedMusteri=null;
				try {
					clonedMusteri = (Musteri)kullaniciMaker.getDeepClone(orijinalMusteri);
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 
				orijinalMusteri.showUp();
				clonedMusteri.showUp();
				System.out.println();
				
				System.out.println("orijinal Musterinin Adresi: "+ System.identityHashCode(orijinalMusteri));
				System.out.println("Cloned Musterinin Adresi: "+ System.identityHashCode(clonedMusteri));
				
				System.out.println();
				System.out.println("Clonelanan Müþterinin yaþ deðerini deðiþtirirsek orijinal müþterinin deðeri deðiþmez, çünkü burada DeepCopy Cloning uygulandi!!");
				clonedMusteri.setAge(36);
				orijinalMusteri.showUp();
				clonedMusteri.showUp();
				
				System.out.println("***********Deep Cloninig 2.metodu ile test etmek***********");
				
				
				System.out.println("\n****Sisteme Yeni Yöneticileri Eklenecek !!****");
				Yonetici orijinalYonetici = new Yonetici();
				Yonetici clonedYonetici = (Yonetici)kullaniciMaker.getDeepCloneMethod_2(orijinalYonetici);
				
				orijinalYonetici.showUp();
				clonedYonetici.showUp();
				System.out.println();
				
				System.out.println("orijinal Yoneticinin Adresi: "+ System.identityHashCode(orijinalYonetici));
				System.out.println("Cloned Yoneticinin Adresi: "+ System.identityHashCode(clonedYonetici));
				
				System.out.println();
				System.out.println("Clonelanan Yöneticinin yaþ deðerini deðiþtirirsek orijinal yöneticinin deðeri deðiþmez, çünkü burada DeepCopy Cloning 2.metod uygulandi!!");
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
				System.out.println("Clonelanan Müþterinin yaþ deðerini deðiþtirirsek orijinal müþterinin deðeri de deðiþir, çünkü burada ShallowCopy Cloning uygulandi!!");
				clonedMusteri_Shallow.age=24;
				orijinalMusteri_Shallow.showUp();
				clonedMusteri_Shallow.showUp();
				
				
				System.out.println("\n****Sisteme Yeni Yöneticileri Eklenecek !!****");
				Yonetici orijinalYonetici_Shallow = new Yonetici();
				Yonetici clonedYonetici_Shallow = (Yonetici)kullaniciMaker.getShallowClone(orijinalYonetici_Shallow);
				
				orijinalYonetici_Shallow.showUp();
				clonedYonetici_Shallow.showUp();
				System.out.println();
				
				System.out.println("orijinal Yoneticinin Adresi: "+ System.identityHashCode(orijinalYonetici_Shallow));
				System.out.println("Cloned Yoneticinin Adresi: "+ System.identityHashCode(clonedYonetici_Shallow));
				
				System.out.println();
				System.out.println("Clonelanan Yöneticinin yaþ deðerini deðiþtirirsek orijinal yöneticinin deðeri de deðiþir, çünkü burada ShallowCopy Cloning uygulandi!!");
				clonedYonetici_Shallow.setAge(39);
				orijinalYonetici_Shallow.showUp();
				clonedYonetici_Shallow.showUp();
		 		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
		 		textField.setText("### Prototype Pattern's Examples are Runing  ###\n");
			}
		});
		btnPro.setBounds(12, 175, 322, 34);
		frame.getContentPane().add(btnPro);
		
		JButton btnPool = new JButton("Kullan\u0131c\u0131lara Oturumu Sa\u011Flay\u0131n(Object Pool)");
		btnPool.setIcon(new ImageIcon("C://Users//siham//workspace_designPattern//Full_Project//src//right_arrow.png"));
		btnPool.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("### Object Pool Design Pattern's Example is Runing ###\n");
				 // Reference >> https://www.javatpoint.com/object-pool-pattern
				 MainProgram op=new MainProgram();  
		         op.setUp();  
		         op.tearDown();  
		         op.testObjectPool(); 
		 		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
		 		textField.setText("### Object Pool Design Pattern's Example is Runing ###\n");
			}
		});
		btnPool.setBounds(12, 233, 322, 34);
		frame.getContentPane().add(btnPool);
		
		JButton btnBuild = new JButton("Transfer/Yat\u0131r\u0131m \u0130\u015Flemlerin Bilgileri Girin(Builder)");
		btnBuild.setIcon(new ImageIcon("C://Users//siham//workspace_designPattern//Full_Project//src//right_arrow.png"));

		btnBuild.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("### Builder Design Pattern's Example is Runing [Example 1] ###\n");

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
				System.out.println("### Builder Design Pattern's Example is Runing [Example 2] ###\n");
				Kullanici_build  kullanici_1 = new KullaniciBuilderConcreate().kullanici_ad("Saliha").kullanici_soyad("Uslu")
						    .age(30)
						    .TC_No("99345678930")
						    .Telefon_No("1234567")
						    .kullanici_adresi("Fake address 1234")
						    .build();
				 
						    System.out.println(kullanici_1+"\n");
				
			    Kullanici_build  kullanici_2 = new KullaniciBuilderConcreate().kullanici_ad("Can").kullanici_soyad("Demir")
								    .age(30)
								    .TC_No("99336798930")
								    .Telefon_No("12967567")
								    .kullanici_adresi("Fake address 6588")
								    .build();
						
								    System.out.println(kullanici_2);
				System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");

				textField.setText("### Builder Design Pattern's Example is Runing  ###\n");
			}
		});
		btnBuild.setBounds(12, 293, 322, 34);
		frame.getContentPane().add(btnBuild);
		
		JButton btnAbstract = new JButton("M\u00FC\u015Fteri/Yat\u0131rma ve Y\u00F6netici/Transfer \u0130li\u015Fkileri(Abstract Factory)");
		btnAbstract.setIcon(new ImageIcon("C://Users//siham//workspace_designPattern//Full_Project//src//right_arrow.png"));
		btnAbstract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("### Abstract Factory Pattern's Example is Runing ###\n");

				TransferIslemiFactory transferIslemiFactory = new TransferIslemiFactory();
				YatirmaIslemiFactory yatirmaIslemiFactory = new YatirmaIslemiFactory();

				System.out.println("YatirmaIslemiFactory'i Kullanarak Yatýrma Ýþlemi ve Sorumlusu Olan Müþteri Kullanýcýmýzý Oluþturuluyor:");
				AbstractFactory_Pattern.Parasalislemi yatirmaIslemi= yatirmaIslemiFactory.getParasalislemi("yatirma");
				AbstractFactory_Pattern.Kullanici musteriKullanici= yatirmaIslemiFactory.getIslemSorumlusu("Musteri");
				yatirmaIslemi.islemTuru();
				musteriKullanici.showUp();
				
				
				System.out.print("\n");
				
				System.out.println("TransferIslemiFactory'i Kullanarak Transfer Ýþlemi ve Sorumlusu Olan Yönetici Kullanýcýmýzý Oluþturuluyor: ");
				AbstractFactory_Pattern.Parasalislemi transferIslemi= transferIslemiFactory.getParasalislemi("transfer");
				AbstractFactory_Pattern.Kullanici yoneticiKullanici = transferIslemiFactory.getIslemSorumlusu("Yonetici");
		        transferIslemi.islemTuru();
				yoneticiKullanici.showUp();
		        
				System.out.print("\n");
				System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
				textField.setText("### Abstract Factory Pattern's Example is Runing ###\n");
			}
		});
		btnAbstract.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAbstract.setBounds(12, 354, 322, 34);
		frame.getContentPane().add(btnAbstract);
		
		JButton btniter = new JButton("Y\u00F6neticiContainer / M\u00FC\u015FteriContainer(Iterator Pattern)");
		btniter.setIcon(new ImageIcon("C://Users//siham//workspace_designPattern//Full_Project//src//right_arrow.png"));
		btniter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("### Iterator Design Pattern's Example is Runing ###\n");

				System.out.println("--> Iterator Vasýtasý Ýle Sistemin Müþterilerin Bilgileri Geri Göndermek!!\n");
				Container iContainer = new MusteriContainer();
				Iterator iIterator = iContainer.createIterator();
				while(iIterator.hasNext()){
					Object object = iIterator.next();
					System.out.println(object);
				}
				System.out.println();
				System.out.println("--> Iterator Vasýtasý Ýle Sistemin Yöneticilerin Bilgileri Geri Göndermek!!\n");
				Container yoneticiContainer = new YoneticiContainer();
				Iterator yoneticiIterator = yoneticiContainer.createIterator();
				while(yoneticiIterator.hasNext()){
					Object yoneticiObj=yoneticiIterator.next();
					System.out.println(yoneticiObj);
				}
				System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
				textField.setText("### Iterator Design Pattern's Example is Runing ###\n");
			}
		});
		btniter.setBounds(12, 420, 322, 34);
		frame.getContentPane().add(btniter);
		
		JButton btnobs= new JButton("Kampanya Mesajlar\u0131 Kullan\u0131c\u0131lara Bildirin(Observer)");
		btnobs.setIcon(new ImageIcon("C://Users//siham//workspace_designPattern//Full_Project//src//right_arrow.png"));
		btnobs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("### Observer Design Pattern's Example is Runing ###\n");

				// Create subjects
				KampanyaMesaj_Subscriber kampanyaMsg=new KampanyaMesaj_Subscriber();
				
				// Create observers
				Observer observer_1 = new BankaKullanici("Aykut Demir");
				Observer observer_2 = new BankaKullanici("Alp Erdoðan");
		        Observer observer_3 = new BankaKullanici("Merve DoðanAy");
		        
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
		        
		        Kampanya kampanya = new Kampanya("Ýlk Kampanyamýz","Kampanyamiz Altin dovizi alimi ile ilgilidir","1 aydýr");
		        // Send Kampanya bilgileri
		        kampanyaMsg.postMessage(kampanya);
		        System.out.println("---------------------------------------------------\n");
		        kampanyaMsg.removeObserver(observer_2);
		        Kampanya kampanya_2 = new Kampanya("2. Kampanyamýz","Çocuklarýn geleceði için kumbara kampanyasýna katýlýn","2 aydýr");
		        kampanyaMsg.postMessage(kampanya_2);
		        System.out.println("---------------------------------------------------\n");
				System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
				textField.setText("### Observer Design Pattern's Example is Runing ###\n");
			}
		});
		btnobs.setBounds(12, 470, 322, 34);
		frame.getContentPane().add(btnobs);
		
		JButton btnMedia = new JButton("Merkezi Bankan\u0131n \u015E\u00FCbelere Bildirimi(Mediator)");
		btnMedia.setIcon(new ImageIcon("C://Users//siham//workspace_designPattern//Full_Project//src//right_arrow.png"));
		btnMedia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("### Mediator Design Pattern's Example is Runing ###\n");

				MerkeziBankaMediator mediator = new MerkeziBankaMediator_Impl();
				
				BankaSubesi sube_1 = new BankaSubesi_Impl(mediator, "Istanbul Banka Þübesi");
				BankaSubesi sube_2 = new BankaSubesi_Impl(mediator, "Ankara Banka Þübesi");
				BankaSubesi sube_3 = new BankaSubesi_Impl(mediator, "Ýzmir Banka Þübesi");
				BankaSubesi sube_4 = new BankaSubesi_Impl(mediator, "Bursa Banka Þübesi");
		 
				mediator.addSube(sube_1);
				mediator.addSube(sube_2);
				mediator.addSube(sube_3);
				mediator.addSube(sube_4);
				
				sube_1.sendMesaj("Tüm Þübelere Dikkatine 1. Bilgilendirme mesaji !!!");
			    System.out.print("\n");
				sube_4.sendMesaj("Tüm Þübelere Dikkatine 2. Bilgilendirme mesaji !!!");
				System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
				textField.setText("### Mediator Design Pattern's Example is Runing ###\n");
			}
		});
		btnMedia.setBounds(12, 531, 322, 34);
		frame.getContentPane().add(btnMedia);
		
		JButton btnMemento = new JButton("Banka Hesab\u0131 Durumlar\u0131(Memento Pattern)");
		btnMemento.setIcon(new ImageIcon("C://Users//siham//workspace_designPattern//Full_Project//src//right_arrow.png"));
		btnMemento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
				System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
				textField.setText("### Memento Design Pattern's Example is Runing ###\n");
			}
		});
		btnMemento.setBounds(12, 597, 322, 34);
		frame.getContentPane().add(btnMemento);
		
		JButton btnAdapter = new JButton("T\u00FCrk Lira ParaBirimi Dolara \u00C7evir(Adapter Pattern)");
		btnAdapter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("### Adapter Design Pattern's Example is Runing ###\n");

				ParaBirimi turkLira = new TurkLiraBirimi();
				ParaBirimi dolar_parasi = new ParaBirimiAdapter(new DolarBirimi_Adaptee());
				
				alisverisYap(turkLira);
				alisverisYap(dolar_parasi);
				
				System.out.println("--------------------------------------------------------\n");
				System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
				textField.setText("### Adapter Design Pattern's Example is Runing ###\n");
			}
		});
		btnAdapter.setIcon(new ImageIcon("C://Users//siham//workspace_designPattern//Full_Project//src//right_arrow.png"));
		btnAdapter.setBounds(12, 663, 322, 34);
		frame.getContentPane().add(btnAdapter);
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
