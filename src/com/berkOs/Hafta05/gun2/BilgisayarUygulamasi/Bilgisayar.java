package com.berkOs.Hafta05.gun2.BilgisayarUygulamasi;

import java.util.ArrayList;

public class Bilgisayar {
	
	private String id;
	private String ad;
	private Anakart anaKart;
	private ArrayList<HariciDonanim> hariciDonanimlar;
	private boolean tasinabilirMi;
	
	
	
	public boolean isTasinabilirMi() {
		return tasinabilirMi;
	}




	public void setTasinabilirMi(boolean tasinabilirMi) {
		this.tasinabilirMi = tasinabilirMi;
	}




	public Bilgisayar(String id, String ad, Anakart anaKart) {
		super();
		this.id = id;
		this.ad = ad;
		this.anaKart = anaKart;
	}




	public Bilgisayar(String id, String ad, Anakart anaKart, ArrayList<HariciDonanim> hariciDonanimlar) {
		super();
		this.id = id;
		this.ad = ad;
		this.anaKart = anaKart;
		this.hariciDonanimlar = hariciDonanimlar;
	}




	public String getId() {
		return id;
	}




	public void setId(String id) {
		this.id = id;
	}




	public String getAd() {
		return ad;
	}




	public void setAd(String ad) {
		this.ad = ad;
	}




	public Anakart getAnaKart() {
		return anaKart;
	}




	public void setAnaKart(Anakart anaKart) {
		this.anaKart = anaKart;
	}


 

	public ArrayList<HariciDonanim> getHariciDonanimlar() {
		return hariciDonanimlar;
	}




	public void setHariciDonanimlar(ArrayList<HariciDonanim> hariciDonanimlar) {
		this.hariciDonanimlar = hariciDonanimlar;
	}




	@Override
	public String toString() {
		return "Bilgisayar [id=" + id + ", ad=" + ad + ", anaKart=" + anaKart + ", hariciDonanimlar=" + hariciDonanimlar
				+ ", tasinabilirMi=" + tasinabilirMi + "]";
	}
	
	
	
}
