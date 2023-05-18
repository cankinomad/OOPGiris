package com.berkOs.Hafta05.gun2.polimorfizm;
/*
 * super keyword==> bir ust(super Class) siniftaki bir veriye, bir metoda ulasmak icin kullanilir.
 */
public class SuPokemonu extends Pokemon {

	int suBasinciGucu;
	int yuzmeHizi;


	public SuPokemonu(long id, String ad, int seviye, int guc, int can, int suBasinciGucu, int yuzmeHizi) {
		super(id, ad, seviye, guc, can);
		super.setTur("Su");
		setDirencKatsayisi(2);
		this.suBasinciGucu = suBasinciGucu;
		this.yuzmeHizi = yuzmeHizi;
	}
	@Override
		public void pokedex() {
			super.pokedex();
			System.out.println("Su basinci gucu= "+suBasinciGucu+"\nYuzme Hizi= "+yuzmeHizi);
		}
	@Override
	public void saldir() {
		System.out.println(getAd()+ " adli pokemon su saldirisi yapiyor");
	}
	
}
