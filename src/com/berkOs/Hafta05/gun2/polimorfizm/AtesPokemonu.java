package com.berkOs.Hafta05.gun2.polimorfizm;

public class AtesPokemonu extends Pokemon {
		
	int yakicilikGucu;

	public AtesPokemonu(long id, String ad, int seviye, int guc, int can, int yakicilikGucu) {
		super(id, ad, seviye, guc, can);
		//super.setTur("Ates");//ayni sey
		setTur("Ates"); //ayni sey
		setDirencKatsayisi(4);
		this.yakicilikGucu = yakicilikGucu;
	}

	@Override
	public void pokedex() {
		super.pokedex();
		System.out.println("Yakicilik Gucu= "+yakicilikGucu);
	}

	@Override
	public void saldir() {
		System.out.println(getAd()+ " adli pokemon ates saldirisi yapiyor");
	}
	
	
}
