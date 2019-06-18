package Factory_Pattern_with_MVC;

public class ParasalislemController {
	
	private Parasalislemi model;
	private ParasalislemView view;
	
	public void setParasalislemModel(Parasalislemi model){
		this.model=model;
	}
	public void setParasalislemView(ParasalislemView view){
		this.view=view;
	}
	public void Bilgiler(){
		view.printIslemDetails(model.islemTuru());
	}
	public void getPatternBilgisi(){
		view.patternBilgisi();
	}
	
}
