package com.berkOs.Hafta05.Gun5.Enums;

public enum EAylar {
	HAZIRAN(30,"Haziran"),TEMMUZ(31,"Temmuz"),AGUSTOS(31,"Agustos");
	
	private int gunSayisi;
	private String isim;
	
	private EAylar(int gunSayisi,String isim) {
		this.gunSayisi = gunSayisi;
		this.isim=isim;
	}

	public int getGunSayisi() {
		return gunSayisi;
	}

	public String getIsim() {
		return isim;
	}
	
	
}
