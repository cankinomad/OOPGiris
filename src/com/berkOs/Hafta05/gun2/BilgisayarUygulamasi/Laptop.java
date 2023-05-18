package com.berkOs.Hafta05.gun2.BilgisayarUygulamasi;

import java.util.ArrayList;

public class Laptop extends Bilgisayar{
	
	private String ekran;
	private String batarya;
	private int sarjYuzdesi;
	
	
	
	
	public Laptop(String id, String ad, Anakart anaKart, ArrayList<HariciDonanim> hariciDonanimlar, String ekran,
			String batarya, int sarjYuzdesi) {
		super(id, ad, anaKart, hariciDonanimlar);
		this.ekran = ekran;
		this.batarya = batarya;
		this.sarjYuzdesi = sarjYuzdesi;
		setTasinabilirMi(true);
	}




	public Laptop(String id, String ad, Anakart anaKart, String ekran, String batarya, int sarjYuzdesi) {
		super(id, ad, anaKart);
		this.ekran = ekran;
		this.batarya = batarya;
		this.sarjYuzdesi = sarjYuzdesi;
		setTasinabilirMi(true);
	}




	@Override
	public String toString() {
		return "Laptop [ekran=" + ekran + ", batarya=" + batarya + ", sarjYuzdesi=" + sarjYuzdesi + ", toString()="
				+ super.toString() + "]";
	}




	
	
	
}
