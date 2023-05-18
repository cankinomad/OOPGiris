package com.berkOs.Hafta05.gun2.polimorfizm;

import java.util.ArrayList;

public class Kullanici {
	
	private String isim;
	private ArrayList<Pokemon> pokemonlar;
	private int pokemonYakalamapuani;
	



	public Kullanici(String isim) {
		super();
		this.isim = isim;
		this.pokemonYakalamapuani=3;
		this.pokemonlar=new ArrayList<>(); //bu sekilde isim alan constructor olusturdugunda pokemon arraylisti olusmus olacak.
	}




	public Kullanici(String isim, ArrayList<Pokemon> pokemonlar) {
		super();
		this.isim = isim;
		this.pokemonYakalamapuani=3;
		this.pokemonlar = pokemonlar;
	}




	public String getIsim() {
		return isim;
	}




	public void setIsim(String isim) {
		this.isim = isim;
	}




	public ArrayList<Pokemon> getPokemonlar() {
		return pokemonlar;
	}




	public void setPokemonlar(ArrayList<Pokemon> pokemonlar) {
		this.pokemonlar = pokemonlar;
	}




	public int getPokemonYakalamapuani() {
		return pokemonYakalamapuani;
	}




	public void setPokemonYakalamapuani(int pokemonYakalamapuani) {
		this.pokemonYakalamapuani = pokemonYakalamapuani;
	}




	@Override
	public String toString() {
		return "Kullanici [isim=" + isim + ", pokemonlar=" + pokemonlar + "]";
	}
	
	
	
}
