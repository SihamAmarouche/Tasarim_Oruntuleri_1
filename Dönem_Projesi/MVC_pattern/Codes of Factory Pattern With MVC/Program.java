package Factory_Pattern_with_MVC;

public class Program {

	public static void main(String[] args) {
	    /// &&&&&&&&&&&&&&& Factory Pattern With MVC Ornegi &&&&&&&&&&&&&&&&

		Parasalislemi islemModelF = ParasalislemiFactory.CreateIslem("transfer");
		ParasalislemView view = new ParasalislemView();
		
		ParasalislemController controllerFactory=new ParasalislemController();
		
		controllerFactory.setParasalislemModel(islemModelF);
		controllerFactory.setParasalislemView(view);
		
		controllerFactory.getPatternBilgisi();
		controllerFactory.Bilgiler();
		
		islemModelF = ParasalislemiFactory.CreateIslem("borc");
	    controllerFactory.setParasalislemModel(islemModelF);
	    
	    controllerFactory.Bilgiler();
	    
	    islemModelF = ParasalislemiFactory.CreateIslem("yatirim");
	    controllerFactory.setParasalislemModel(islemModelF);
	    
	    controllerFactory.Bilgiler();
	    
		

	}

}
