package FactoryPattern_Example_2;

import java.util.Random;

public class CreateElement {
	
	static Random random = new Random();
	
	public static void main(String[] args) {
		System.out.println("### Factory Design Pattern's Example is Runing ###\n");

		// Random olarak olusturulacak
		int loop=7;
		while(loop>0){
			Kullanici kullanici = SystemElementFactory.createKullanici(getRandom(1,2));
			kullanici.showUp();
			loop--;
		}

	}
	public static int getRandom(int min, int max){
		return random.nextInt((max-min)+1)+ min;
	}

}
