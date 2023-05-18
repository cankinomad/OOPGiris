package com.berkOs.Hafta05.gun2.BilgisayarUygulamasi;

public class HardDisk extends DahiliDonanim {
	
	private int kapasite;
	private int yazmaHizi;
	private int okumaHizi;
	
	
	
	public HardDisk(int kapasite, int yazmaHizi, int okumaHizi) {
		super();
		this.kapasite = kapasite;
		this.yazmaHizi = yazmaHizi;
		this.okumaHizi = okumaHizi;
	}
	public int getKapasite() {
		return kapasite;
	}
	public void setKapasite(int kapasite) {
		this.kapasite = kapasite;
	}
	public int getYazmaHizi() {
		return yazmaHizi;
	}
	public void setYazmaHizi(int yazmaHizi) {
		this.yazmaHizi = yazmaHizi;
	}
	public int getOkumaHizi() {
		return okumaHizi;
	}
	public void setOkumaHizi(int okumaHizi) {
		this.okumaHizi = okumaHizi;
	}
	@Override
	public String toString() {
		return "HardDisk [kapasite=" + kapasite + ", yazmaHizi=" + yazmaHizi + ", okumaHizi=" + okumaHizi + "]";
	}
	
	
}
