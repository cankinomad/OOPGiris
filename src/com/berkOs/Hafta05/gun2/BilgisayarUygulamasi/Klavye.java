package com.berkOs.Hafta05.gun2.BilgisayarUygulamasi;

public class Klavye extends HariciDonanim {
	
	private String tur;
	private String still;
	
	
	
	public Klavye(String tur, String still) {
		super();
		this.tur = tur;
		this.still = still;
	}
	public String getTur() {
		return tur;
	}
	public void setTur(String tur) {
		this.tur = tur;
	}
	public String getStill() {
		return still;
	}
	public void setStill(String still) {
		this.still = still;
	}
	@Override
	public String toString() {
		return "Klavye [tur=" + tur + ", still=" + still + "]";
	}
	
	
}
