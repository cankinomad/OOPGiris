package com.berkOs.Hafta05.gun2.polimorfizm; 

public class Pokemon {
	private long id;
	private String ad;
	private String tur;
	private int seviye;
	private int guc;
	private int can;
	private boolean sahibiVarMi;
	
	private int direncKatsayisi;
	



	public boolean isSahibiVarMi() {
		return sahibiVarMi;
	}


	public void setSahibiVarMi(boolean sahibiVarMi) {
		this.sahibiVarMi = sahibiVarMi;
	}


	public Pokemon() {
		super();
	}


	public Pokemon(long id, String ad, String tur, int seviye, int guc, int can) {
		super();
		this.id = id;
		this.ad = ad;
		this.tur = tur;
		this.seviye = seviye;
		this.guc = guc;
		this.can = can;
	}


	public Pokemon(long id, String ad) {	
		this( id,ad,"Standart",0,0,0); //2 tanme parametre alirsin kalanlari default olarak gelir
		
		
	}

	public Pokemon(long id, String ad, int seviye, int guc, int can) {
		super();//object sinifina gider default.
		this.id = id;
		this.ad = ad;
		this.seviye = seviye;
		this.guc = guc;
		this.can = can;
		this.tur="Standart";
	}


	public void saldir() {
		
		System.out.println(ad+ " adli pokemon saldiriyor");
	}
	
	public void kacinma() {
		
		System.out.println(ad+ " adli pokemon saldiridan kacindi");

	}
	public void pokedex() {
		System.out.println("POKEDEX");
		System.out.println("===============");
		System.out.println("id= "+id);
		System.out.println("ad= "+ad);
		System.out.println("tur= "+tur);
		System.out.println("can= "+can);
		System.out.println("guc= "+guc);
		System.out.println("seviye= "+seviye);
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getAd() {
		return ad;
	}


	public void setAd(String ad) {
		this.ad = ad;
	}


	public String getTur() {
		return tur;
	}


	public void setTur(String tur) {
		this.tur = tur;
	}


	public int getSeviye() {
		return seviye;
	}


	public void setSeviye(int seviye) {
		this.seviye = seviye;
	}


	public int getGuc() {
		return guc;
	}


	public void setGuc(int guc) {
		this.guc = guc;
	}


	public int getCan() {
		return can;
	}


	public void setCan(int can) {
		this.can = can;
	}
	
	public int getDirencKatsayisi() {
		return direncKatsayisi;
	}


	public void setDirencKatsayisi(int direncKatsayisi) {
		this.direncKatsayisi = direncKatsayisi;
	}


	@Override
	public String toString() {
		return "Pokemon [id=" + id + ", ad=" + ad + ", tur=" + tur + ", seviye=" + seviye + ", guc=" + guc + ", can="
				+ can + ", sahibiVarMi=" + sahibiVarMi + ", direncKatsayisi=" + direncKatsayisi + "]";
	}
	
	
}
