package com.berkOs.Hafta04.gun5.Otobus2;

public class Durak {
	
	public int durakNo;
	public String durakIsmi;
	public String konum;
	public Otobus[] otobusler;
	
	
	
	public Durak(int durakNo, String durakIsmi, String konum) {
		this.durakNo = durakNo;
		this.durakIsmi = durakIsmi;
		this.konum = konum;
	}



	public Durak(int durakNo, String durakIsmi, String konum, Otobus[] otobusler) {
		this.durakNo = durakNo;
		this.durakIsmi = durakIsmi;
		this.konum = konum;
		this.otobusler = otobusler;
	}



	



	@Override
	public String toString() {
		return "Durak [durakNo=" + durakNo + ", durakIsmi=" + durakIsmi + ", konum=" + konum + ", otobusler="
				 + "]";
	}
	
	
}
