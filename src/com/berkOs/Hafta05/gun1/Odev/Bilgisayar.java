package com.berkOs.Hafta05.gun1.Odev;
/*
 * Bir bilgisayar sinifi olusturalim
 * daha sonra kalitim yapisiyla beraber bunun alt siniflarini da olsuturalim
 * bilgisayar sinifinda diger tanimaldiginiz ozellikler icinde siniflar olsuturabilirsiniz.
 */
public class Bilgisayar {
	
	private String marka;
	private String model;
	private String ekranKarti;
	private String islemci;
	private String anaKart;
	private String ram;
	private String hafiza;
	
	
	
	
	public Bilgisayar(String marka, String ekranKarti, String islemci) {
		super();
		this.marka = marka;
		this.ekranKarti = ekranKarti;
		this.islemci = islemci;
	}


	public Bilgisayar(String marka, String model, String ekranKarti, String islemci, String hafiza) {
		super();
		this.marka = marka;
		this.model = model;
		this.ekranKarti = ekranKarti;
		this.islemci = islemci;
		this.hafiza = hafiza;
	}


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


	public String getEkranKarti() {
		return ekranKarti;
	}


	public void setEkranKarti(String ekranKarti) {
		this.ekranKarti = ekranKarti;
	}


	public String getIslemci() {
		return islemci;
	}


	public void setIslemci(String islemci) {
		this.islemci = islemci;
	}


	public String getAnaKart() {
		return anaKart;
	}


	public void setAnaKart(String anaKart) {
		this.anaKart = anaKart;
	}


	public String getRam() {
		return ram;
	}


	public void setRam(String ram) {
		this.ram = ram;
	}


	public String getHafiza() {
		return hafiza;
	}


	public void setHafiza(String hafiza) {
		this.hafiza = hafiza;
	}


	@Override
	public String toString() {
		return "Bilgisayar [marka=" + marka + ", ekranKarti=" + ekranKarti + ", islemci=" + islemci + ", ram=" + ram
				+ "]";
	}


	
	
	
}
