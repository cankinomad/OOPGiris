package com.berkOs.Hafta05.gun2.polimorfizm;

public class ElektrikPokemonu extends Pokemon{
	
	int voltajSeviyesi;

	

	public ElektrikPokemonu(long id, String ad, int seviye, int guc, int can, int voltajSeviyesi) {
		super(id, ad, seviye, guc, can);
		super.setTur("Elektrik");
		setDirencKatsayisi(3);
		this.voltajSeviyesi = voltajSeviyesi;
	}



	@Override
	public void pokedex() {
		
		System.out.println("superden once");
		super.pokedex();
		System.out.println("Voltaj Seviyesi="+ voltajSeviyesi);
	}



	@Override
	public void saldir() {
		System.out.println(getAd()+ " adli pokemon elektrik saldirisi yapiyor");
	}
	
	
}
