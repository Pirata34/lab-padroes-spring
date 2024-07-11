package one.digitalinnovation.gof.singleton;

public class SingletonLazyHolder {
	private static class InstanceHoder{
		public static SingletonLazyHoder instancia = new SingletonLazyHoder();
	}
	
	private SingletonLazyHoder() {
		super();
	}
	
	public static SigletonLazyHoder getInstancia() {
		return InstanceHoder.instancia;
	}

}
