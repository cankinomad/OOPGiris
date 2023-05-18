package com.berkOs.Hafta05.gun2.BilgisayarUygulamasi;

public class islemci extends DahiliDonanim{
	
	private int cekirdekSayisi;
	private int hiz;
	private String nesil;
	
	
	public islemci(int cekirdekSayisi, int hiz, String nesil) {
		super();
		this.cekirdekSayisi = cekirdekSayisi;
		this.hiz = hiz;
		this.nesil = nesil;
	}
	public int getCekirdekSayisi() {
		return cekirdekSayisi;
	}
	public void setCekirdekSayisi(int cekirdekSayisi) {
		this.cekirdekSayisi = cekirdekSayisi;
	}
	public int getHiz() {
		return hiz;
	}
	public void setHiz(int hiz) {
		this.hiz = hiz;
	}
	public String getNesil() {
		return nesil;
	}
	public void setNesil(String nesil) {
		this.nesil = nesil;
	}
	@Override
	public String toString() {
		return "islemci [cekirdekSayisi=" + cekirdekSayisi + ", hiz=" + hiz + ", nesil=" + nesil + "]";
	}
	
	
	
}
