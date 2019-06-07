package Adapter_Pattern;

public class ParaBirimiAdapter implements ParaBirimi{
	
	DolarBirimi_Adaptee dA;
	public ParaBirimiAdapter(DolarBirimi_Adaptee dA){
		this.dA = dA;
	}
	@Override
	public void paraBirimiBilgileri() {
		dA.dolar_paraBirimiBilgileri();	
	}

	@Override
	public void getParaMiktari(double m) {
		dA.dolar_getParaMiktari(m);
	}

	@Override
	public void paraDegeri() {
		dA.dolar_paraDegeri();
	}
	
	
}
