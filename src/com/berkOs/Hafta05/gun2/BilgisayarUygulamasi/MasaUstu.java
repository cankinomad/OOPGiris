package com.berkOs.Hafta05.gun2.BilgisayarUygulamasi;

import java.util.ArrayList;

public class MasaUstu extends Bilgisayar{
	
	private int KasaBoyutu;
	private Monitor monitor;
	
	
	
	
	
	
	public MasaUstu(String id, String ad, Anakart anaKart, int kasaBoyutu, Monitor monitor) {
		super(id, ad, anaKart);
		KasaBoyutu = kasaBoyutu;
		this.monitor = monitor;
		setTasinabilirMi(false);
	}






	public MasaUstu(String id, String ad, Anakart anaKart, ArrayList<HariciDonanim> hariciDonanimlar, int kasaBoyutu,
			Monitor monitor) {
		super(id, ad, anaKart, hariciDonanimlar);
		KasaBoyutu = kasaBoyutu;
		this.monitor = monitor;
		setTasinabilirMi(false);
	}






	public int getKasaBoyutu() {
		return KasaBoyutu;
	}






	public void setKasaBoyutu(int kasaBoyutu) {
		KasaBoyutu = kasaBoyutu;
	}






	public Monitor getMonitor() {
		return monitor;
	}






	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	
	
}
