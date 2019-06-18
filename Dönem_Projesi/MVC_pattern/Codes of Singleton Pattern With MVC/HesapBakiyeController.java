package Singleton_Pattern_with_MVC;

public class HesapBakiyeController {
	
	private HesapBakiyeView view;
	private hesapBakiye model1;
	private hesapBakiye model2;
	private hesapBakiye model3;
	
	public void setBakiyeModel(hesapBakiye model1,hesapBakiye model2,hesapBakiye model3){
		this.model1=model1;
		this.model2=model2;
		this.model3=model3;
	}
	public void setBakiyeView(HesapBakiyeView view){
		this.view=view;
	}
	public void Bilgiler(){
		view.printBakiyeDetails(model1,model2,model3);
	}
	public void getPatternBilgisi(){
		view.patternBilgisi();
	}
	public void paraYatirmaIslmei(){
		view.paraYatirmaIslemi(model1, model2, model3);
	}
}
