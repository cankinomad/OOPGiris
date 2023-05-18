package com.berkOs.Hafta06.Gun3.OdevSiniftaCozum;

public enum EIcecek {
	AYRAN(false),KOLA(false),FANTA(false),GAZOZ(false),MEYVESUYU(false),LIMONATA(false),ICETEA(false);
	
	boolean atandiMi;

	private EIcecek(boolean atandiMi) {
		this.atandiMi = atandiMi;
	}

	public boolean isAtandiMi() {
		return atandiMi;
	}

	public void setAtandiMi(boolean atandiMi) {
		this.atandiMi = atandiMi;
	}
	
}
