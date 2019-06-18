package ObjectPool_Pattern_Example;
//Reference > https://www.javatpoint.com/object-pool-pattern


public class ExportingProcess {
	
	private long processNo;
	
	public ExportingProcess(long processNo){
		this.processNo=processNo;
		
		/// It is for do expensive calls or tasks
		
		System.out.println(processNo+". Oturum Objesi Ayarlandý (created)");
	}
	
	public long getProcessNo(){
		return processNo;
	}
}
