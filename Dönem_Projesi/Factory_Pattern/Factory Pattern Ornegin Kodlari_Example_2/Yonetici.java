package FactoryPattern_Example_2;

import java.util.Random;

public class Yonetici extends Kullanici{
	
	Random rand = new Random();
	
	public Yonetici(){
		setKullanici_turu("Y�netici");
		int value = rand.nextInt(51)+20;
		setAge(value);
	}

}
