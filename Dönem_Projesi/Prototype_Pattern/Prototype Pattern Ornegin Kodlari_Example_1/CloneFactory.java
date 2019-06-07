package Prototype_Pattern_Example1;

public class CloneFactory {
	
	public Kullanici getShallowClone(Kullanici kullaniciSample){
		return kullaniciSample.makeShallowCopy(kullaniciSample);
	}
	
	public Kullanici getDeepClone(Kullanici kullaniciSample) throws ClassNotFoundException{
		return kullaniciSample.makeDeepCopy();
	}
	
	public Kullanici getDeepCloneMethod_2(Kullanici kullaniciSample) {
		return kullaniciSample.makeDeepCopyMethod_2();
	}
}
