package com.berkOs.Hafta05.gun2.BilgisayarUygulamasi;

public class Mouse extends HariciDonanim{
	
	private int tur;
	

	public Mouse(int tur) {
		super();
		this.tur = tur;
	}


	public int getTur() {
		return tur;
	}


	public void setTur(int tur) {
		this.tur = tur;
	}


	@Override
	public String toString() {
		return "Mouse [tur=" + tur + "]";
	}
	
	
}
