package FactoryPattern_Example_2;

import java.util.Random;
public class Musteri extends Kullanici{
	Random rand = new Random();

	public Musteri(){
		setKullanici_turu("Müþteri");
		int value = rand.nextInt(51)+20;
		setAge(value);
	}
}
