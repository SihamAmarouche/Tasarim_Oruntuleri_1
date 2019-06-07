package multiThreadSingleton;


public class hesapBakiyeThread {
	
	private static hesapBakiyeThread hesapBakiye_sample;
	private double h_Bakiye;
	
	protected hesapBakiyeThread(){
		// Default Constructor
	}
	
	private static Object lock_obj = new Object();
	
	public static hesapBakiyeThread CreateObject(){
		if (hesapBakiye_sample == null){
			
			synchronized (lock_obj){
				if(hesapBakiye_sample == null){
					hesapBakiye_sample = new hesapBakiyeThread();
				}
			}
		}
		return hesapBakiye_sample;
	}
	
	public void setBakiye(double value){
		h_Bakiye = value;
	}
	public double getBakiye(){
		return h_Bakiye;
	}
	
	public boolean ParaCek(double cekilenPara){
		if(cekilenPara <= h_Bakiye){
			h_Bakiye = h_Bakiye-cekilenPara;
			return true;
		}else {
			return false;
		}	
	}
	public boolean ParaYatir(double yatirilanPara){
		try{
			h_Bakiye = h_Bakiye + yatirilanPara;
			return true;
		}catch (ArithmeticException e){
			return false;
		}
		
	}
	
}
