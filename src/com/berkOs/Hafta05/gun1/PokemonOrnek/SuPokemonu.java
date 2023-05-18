package com.berkOs.Hafta05.gun1.PokemonOrnek;
/*
 * super keyword==> bir ust(super Class) siniftaki bir veriye, bir metoda ulasmak icin kullanilir.
 */
public class SuPokemonu extends Pokemon {

	int suBasinciGucu;
	int yuzmeHizi;


	public SuPokemonu(long id, String ad, int seviye, int guc, int can, int suBasinciGucu, int yuzmeHizi) {
		super(id, ad, seviye, guc, can);
		super.setTur("Su");
		this.suBasinciGucu = suBasinciGucu;
		this.yuzmeHizi = yuzmeHizi;
	}
	@Override
		public void pokedex() {
			super.pokedex();
			System.out.println("Su basinci gucu= "+suBasinciGucu+"\nYuzme Hizi= "+yuzmeHizi);
		}
	
}
