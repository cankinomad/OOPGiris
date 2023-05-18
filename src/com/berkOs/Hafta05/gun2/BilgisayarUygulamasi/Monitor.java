package com.berkOs.Hafta05.gun2.BilgisayarUygulamasi;

public class Monitor extends HariciDonanim{
	
	private int kareHizi;
	private int inch;
	
	
	
	public Monitor(int kareHizi, int inch) {
		super();
		this.kareHizi = kareHizi;
		this.inch = inch;
	}
	public int getKareHizi() {
		return kareHizi;
	}
	public void setKareHizi(int kareHizi) {
		this.kareHizi = kareHizi;
	}
	public int getInch() {
		return inch;
	}
	public void setInch(int inch) {
		this.inch = inch;
	}
	@Override
	public String toString() {
		return "Monitor [kareHizi=" + kareHizi + ", inch=" + inch + "]";
	}
	
	
}
