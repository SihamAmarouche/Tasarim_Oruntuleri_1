package Memento_pattern_with_MVC;

public class BankahesabiController {
	
	private BankahesabiView view;
	Bankahesabi_Orginator orginatorModel1;
	Bankahesabi_CareTaker careTakerModel2;
	
	
	public void setBakiyeModel(Bankahesabi_Orginator model1,Bankahesabi_CareTaker model2){
		this.orginatorModel1=model1;
		this.careTakerModel2=model2;
	}
	public void setBakiyeView(BankahesabiView view){
		this.view=view;
	}
	public void Bilgiler(){
		view.printHesapDetails(orginatorModel1,careTakerModel2);
	}
	public void getPatternBilgisi(){
		view.patternBilgisi();
	}
	
}
