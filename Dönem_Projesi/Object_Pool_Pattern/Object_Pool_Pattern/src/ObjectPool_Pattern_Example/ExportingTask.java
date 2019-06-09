package ObjectPool_Pattern_Example;

public class ExportingTask implements Runnable{
	
	private OturumObjectPool<ExportingProcess> pool;
	private int threadNo;
	
	public ExportingTask(OturumObjectPool<ExportingProcess> pool, int threadNo){
		this.pool=pool;
		this.threadNo=threadNo;
	}

	@Override
	public void run() {
		
		ExportingProcess exportingProcess = pool.borrowObject();
		
		System.out.println("Thread "+threadNo+"==> "+exportingProcess.getProcessNo()
		+". Kullan�c�n�n Sistemde Oturumu Sa�land�(A��ld�)");
		
		
		pool.returnObject(exportingProcess);
		
		System.out.println("Thread "+threadNo+"==> "+exportingProcess.getProcessNo()
		+". Kullan�c�n�n Sistemde Oturumu Kapat�ld�(Exite)");
		
	}
	
	

}
