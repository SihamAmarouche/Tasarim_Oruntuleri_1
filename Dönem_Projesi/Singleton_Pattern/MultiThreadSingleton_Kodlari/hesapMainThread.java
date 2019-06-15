package multiThreadSingleton;


public class hesapMainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("### MultiThread Singleton Design Pattern's Example is Runing ###\n");

		hesapBakiyeThread obj1 = hesapBakiyeThread.CreateObject();
		hesapBakiyeThread obj2 = hesapBakiyeThread.CreateObject();
		hesapBakiyeThread obj3 = hesapBakiyeThread.CreateObject();
   
		obj1.setBakiye(2500);
		
		System.out.printf("obj1-Bakiye : %.2f \n", obj1.getBakiye());
		System.out.printf("obj2-Bakiye : %.2f \n", obj2.getBakiye());
		System.out.printf("obj3-Bakiye : %.2f \n\n", obj3.getBakiye());
		
		obj2.setBakiye(3800);
		
		System.out.printf("obj1-Bakiye : %.2f \n", obj1.getBakiye());
		System.out.printf("obj2-Bakiye : %.2f \n", obj2.getBakiye());
		System.out.printf("obj3-Bakiye : %.2f \n", obj3.getBakiye());

	}

}
