package Singleton_Pattern_with_MVC;

public class HesapBakiyeView {
	
	public void printBakiyeDetails(hesapBakiye obj1,hesapBakiye obj2,hesapBakiye obj3){
		System.out.printf("obj1-Bakiye : %.2f \n", obj1.getBakiye());
		System.out.printf("obj2-Bakiye : %.2f \n", obj2.getBakiye());
		System.out.printf("obj3-Bakiye : %.2f \n\n", obj3.getBakiye());
	}
	public void patternBilgisi(){
		System.out.println("### Singleton Design Pattern's Example is Runing ###\n");
	}
	public void paraYatirmaIslemi(hesapBakiye obj1,hesapBakiye obj2,hesapBakiye obj3){
		double yatirilanPara=120;
		
		if(obj2.ParaYatir(yatirilanPara)){
			System.out.printf("%.2f TL Hesabýnýza Baþarýyle Yatýrýldý !!",yatirilanPara);
			
			System.out.printf("\nobj1-Bakiye : %.2f \n", obj1.getBakiye());
			System.out.printf("obj2-Bakiye : %.2f \n", obj2.getBakiye());
			System.out.printf("obj3-Bakiye : %.2f \n", obj3.getBakiye());
		}else{
			System.out.println("Lütfen istenilen kriterlere uygun bir sayý giriniz !!");
		}
	}
}
