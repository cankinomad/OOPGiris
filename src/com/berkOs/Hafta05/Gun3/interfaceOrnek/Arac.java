package com.berkOs.Hafta05.Gun3.interfaceOrnek;

public abstract class Arac {
	
	private String marka;
	private String model;
	private int hiz;
	private String yakit;
	private int yolcuSayisi;
	private String surucuAd;
	
	
	
	
	public Arac(String marka, String model) {
		super();
		this.marka = marka;
		this.model = model;
		setHiz(50);
	}
	
	public abstract void hizlan();
	public abstract void yavasla();


	public String getMarka() {
		return marka;
	}


	public void setMarka(String marka) {
		this.marka = marka;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getHiz() {
		return hiz;
	}


	public void setHiz(int hiz) {
		this.hiz = hiz;
	}


	public String getYakit() {
		return yakit;
	}


	public void setYakit(String yakit) {
		this.yakit = yakit;
	}


	public int getYolcuSayisi() {
		return yolcuSayisi;
	}


	public void setYolcuSayisi(int yolcuSayisi) {
		this.yolcuSayisi = yolcuSayisi;
	}


	public String getSurucuAd() {
		return surucuAd;
	}


	public void setSurucuAd(String surucuAd) {
		this.surucuAd = surucuAd;
	}


	@Override
	public String toString() {
		return "Arac [marka=" + marka + ", model=" + model + ", hiz=" + hiz + ", yakit=" + yakit + ", yolcuSayisi="
				+ yolcuSayisi + ", surucuAd=" + surucuAd + "]";
	}
	
	
	
	
}
