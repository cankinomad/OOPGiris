package com.berkOs.Hafta05.Gun3.interfaceOrnek;

import java.util.ArrayList;

public class Ucak extends Arac implements IKalkisYap,IYukal,IYukbosalt{
	
	private String ortUcusYuksekligi;
	private String yardimciPilotAd;
	private ArrayList<String> calisanlar;
	
	
	


	public Ucak(String marka, String model, String ortUcusYuksekligi, String yardimciPilotAd) {
		super(marka, model);
		this.ortUcusYuksekligi = ortUcusYuksekligi;
		this.yardimciPilotAd = yardimciPilotAd;
		setHiz(600);
	}
	public void hizlan() {
		setHiz(getHiz()+100);
	}
	public void yavasla() {
		setHiz(getHiz()-100);
	}


	public String getOrtUcusYuksekligi() {
		return ortUcusYuksekligi;
	}


	public void setOrtUcusYuksekligi(String ortUcusYuksekligi) {
		this.ortUcusYuksekligi = ortUcusYuksekligi;
	}


	public String getYardimciPilotAd() {
		return yardimciPilotAd;
	}


	public void setYardimciPilotAd(String yardimciPilotAd) {
		this.yardimciPilotAd = yardimciPilotAd;
	}


	public ArrayList<String> getCalisanlar() {
		return calisanlar;
	}


	public void setCalisanlar(ArrayList<String> calisanlar) {
		this.calisanlar = calisanlar;
	}


	@Override
	public String toString() {
		return "Ucak [ortUcusYuksekligi=" + ortUcusYuksekligi + ", yardimciPilotAd=" + yardimciPilotAd + ", calisanlar="
				+ calisanlar + "]";
	}
	@Override
	public void kalkisYap() {
		System.out.println("Kalkis yapiliyor");
		
	}
	@Override
	public void yukbosalt() {
		System.out.println("Yuk bosaltiliyor");		
		
	}
	@Override
	public void yukAl() {
		System.out.println("Yuk aliniyor");		
	}
	
	
	
}
