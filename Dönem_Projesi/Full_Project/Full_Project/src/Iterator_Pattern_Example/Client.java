package Iterator_Pattern_Example;

public class Client {
	public static void main(String[] args){
		
		System.out.println("### Iterator Design Pattern's Example is Runing ###\n");

		System.out.println("--> Iterator Vasýtasý Ýle Sistemin Müþterilerin Bilgileri Geri Döndürmek!!\n");
		Container iContainer = new MusteriContainer();
		Iterator iIterator = iContainer.createIterator();
		while(iIterator.hasNext()){
			Object object = iIterator.next();
			System.out.println(object);
		}
		System.out.println();
		System.out.println("--> Iterator Vasýtasý Ýle Sistemin Yöneticilerin Bilgileri Geri Döndürmek!!\n");
		Container yoneticiContainer = new YoneticiContainer();
		Iterator yoneticiIterator = yoneticiContainer.createIterator();
		while(yoneticiIterator.hasNext()){
			Object yoneticiObj=yoneticiIterator.next();
			System.out.println(yoneticiObj);
		}
	}

}
