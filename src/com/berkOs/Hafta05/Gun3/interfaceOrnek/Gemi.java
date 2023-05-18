package com.berkOs.Hafta05.Gun3.interfaceOrnek;

import java.util.ArrayList;

public class Gemi extends Arac implements IKalkisYap,IYelkenAc,ILimanaYanas,IYukal,IYukbosalt {
	
	private String yardimciKaptan;
	private ArrayList<String> calisanlar;
	
	
	


	public Gemi(String marka, String model, String yardimciKaptan) {
		super(marka, model);
		this.yardimciKaptan = yardimciKaptan;
		setHiz(20);
	}
	
	public void hizlan() {
		setHiz(getHiz()+10);
	}
	public void yavasla() {
		setHiz(getHiz()-10);
	}


	public String getYardimciKaptan() {
		return yardimciKaptan;
	}


	public void setYardimciKaptan(String yardimciKaptan) {
		this.yardimciKaptan = yardimciKaptan;
	}


	public ArrayList<String> getCalisanlar() {
		return calisanlar;
	}


	public void setCalisanlar(ArrayList<String> calisanlar) {
		this.calisanlar = calisanlar;
	}


	@Override
	public String toString() {
		return "Gemi [yardimciKaptan=" + yardimciKaptan + ", calisanlar=" + calisanlar + "]";
	}

	@Override
	public void kalkisYap() {
		System.out.println("Kalkis yapiliyor");
		
	}

	@Override
	public void yelkenAc() {
		System.out.println("Yelken aciliyor");
		
	}

	@Override
	public void limanaYanas() {
		System.out.println("Limana yanasiliyor");
		
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
