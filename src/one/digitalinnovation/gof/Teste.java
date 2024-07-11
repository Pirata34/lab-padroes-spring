package one.digitalinnovation.gof;

import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;

public class Teste {
	public static void main(String[] args) {
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHoder lazyHoder = SingletonLazyHoder.getInstancia();
		System.out.println(lazyHoder);
		lazyHoder = SingletonLazyHoder.getInstancia();
		System.out.println(lazyHoder);
		
		Comportamento defencivo = new ComportamentoDefesivo();
		Comportamento normal = new ComportamentoNormal();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		Facede facede = new facede();
		facede.migrarCliente("Bruno", "14801788");
	}

}
