package ObjectPool_Pattern_Example;

public class ExportingProcess {
	
	private long processNo;
	
	public ExportingProcess(long processNo){
		this.processNo=processNo;
		
		/// It is for do expensive calls or tasks
		
		System.out.println("OturumObject with process no. "+processNo+" was created");
	}
	
	public long getProcessNo(){
		return processNo;
	}
}
