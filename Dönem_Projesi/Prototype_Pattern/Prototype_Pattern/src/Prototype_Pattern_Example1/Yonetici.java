package Prototype_Pattern_Example1;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Random;

public class Yonetici extends Kullanici{
	private static final long serialVersionUID = -6493171299609719559L;
	Random rand = new Random();
	
	public Yonetici(){
		setKullanici_turu("Yönetici");
		int value = rand.nextInt(51)+20;
		setAge(value);
		
		System.out.println("Bankanın Orijinal(Asil) Yöneticisi Oluşturuldu !!");
	}
	@Override
	public Yonetici makeShallowCopy(Kullanici orijinalYonetici) {
		
		/*System.out.println("Bankanın Clonelanan(SallowCopy) Yöneticisi Oluşturuldu !!");
			
	    Yonetici clonedYonetici = new Yonetici();
	    clonedYonetici=(Yonetici)orijinalYonetici;
	
		return clonedYonetici;*/
		try {
			return (Yonetici)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Yonetici makeDeepCopyMethod_2(){
		
		System.out.println("Bankanın Clonelanan(DeepCopy Method_2) Yöneticisi Oluşturuldu !!");
		
		Yonetici clonedYonetici = null;
		try {
			clonedYonetici = (Yonetici) super.clone();
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clonedYonetici;
	}

	@Override
	public Yonetici makeDeepCopy() throws ClassNotFoundException {
		System.out.println("Bankanın Clonelanan(DeepCopy) Yöneticisi Oluşturuldu !!");
		try {
			//Serialization of object
	        ByteArrayOutputStream bos = new ByteArrayOutputStream();
			ObjectOutputStream out = new ObjectOutputStream(bos);
			out.writeObject(this);
		      //De-serialization of object
			ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
	        ObjectInputStream in = new ObjectInputStream(bis);
	        Yonetici clonedYonetici = (Yonetici) in.readObject();
	        return clonedYonetici;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
		


}
