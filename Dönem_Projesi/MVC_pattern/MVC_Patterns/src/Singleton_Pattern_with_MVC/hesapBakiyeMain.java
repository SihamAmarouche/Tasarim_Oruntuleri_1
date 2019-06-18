package Singleton_Pattern_with_MVC;
import java.util.Scanner;
public class hesapBakiyeMain {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		hesapBakiye obj1 = hesapBakiye.CreateObject();
		hesapBakiye obj2 = hesapBakiye.CreateObject();
		hesapBakiye obj3 = hesapBakiye.CreateObject();
   
		obj1.setBakiye(2000);
		
		HesapBakiyeController BakiyeController = new HesapBakiyeController();
		HesapBakiyeView BakiyeView = new HesapBakiyeView();
		
		BakiyeController.setBakiyeModel(obj1, obj2, obj3);
		BakiyeController.setBakiyeView(BakiyeView);
		
		BakiyeController.getPatternBilgisi();
		BakiyeController.Bilgiler();
		
		obj2.setBakiye(3000);
		
		BakiyeController.setBakiyeModel(obj1, obj2, obj3);
		BakiyeController.Bilgiler();
		BakiyeController.paraYatirmaIslmei();
		
		/*System.out.println("\nYat�r�lacak Paran�n Tutar�n� Giriniz L�tfen (Double Number) :");
		double yatirilanPara = scanner.nextDouble();
		
		if(obj2.ParaYatir(yatirilanPara)){
			System.out.printf("%.2f TL Hesab�n�za Ba�ar�yle Yat�r�ld� !!",yatirilanPara);
			
			System.out.printf("\nobj1-Bakiye : %.2f \n", obj1.getBakiye());
			System.out.printf("obj2-Bakiye : %.2f \n", obj2.getBakiye());
			System.out.printf("obj3-Bakiye : %.2f \n", obj3.getBakiye());
		}else{
			System.out.println("L�tfen istenilen kriterlere uygun bir say� giriniz !!");
		}*/
		
		
	}

}
