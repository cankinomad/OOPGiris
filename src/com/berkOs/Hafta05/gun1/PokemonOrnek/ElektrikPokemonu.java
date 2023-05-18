package com.berkOs.Hafta05.gun1.PokemonOrnek;

public class ElektrikPokemonu extends Pokemon{
	
	int voltajSeviyesi;

	

	public ElektrikPokemonu(long id, String ad, int seviye, int guc, int can, int voltajSeviyesi) {
		super(id, ad, seviye, guc, can);
		super.setTur("Elektrik");
		this.voltajSeviyesi = voltajSeviyesi;
	}



	@Override
	public void pokedex() {
		
		System.out.println("superden once");
		super.pokedex();
		System.out.println("Voltaj Seviyesi="+ voltajSeviyesi);
	}
}
