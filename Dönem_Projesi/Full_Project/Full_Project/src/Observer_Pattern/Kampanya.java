package Observer_Pattern;

public class Kampanya {
	String kampanyaBaslik;
	String kampanyaSuresi;
	String kampanyaIcerik;
	public Kampanya(){
	}
	public Kampanya(String kampanyaBaslik,String kampanyaIcerik, String kampanyaSuresi){
		this.kampanyaBaslik=kampanyaBaslik;
		this.kampanyaSuresi=kampanyaSuresi;
		this.kampanyaIcerik=kampanyaIcerik;
	}
	public String getKampanyaIcerik(){
		return this.kampanyaIcerik;
	}
}
