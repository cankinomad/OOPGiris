package com.berkOs.Hafta05.gun1.Odev;

public class DesktopBilgisayar extends Bilgisayar {
	
	String kasaBoyutu;
	String GucKaynagi;
	
	
	public DesktopBilgisayar(String marka, String model, String ekranKarti, String islemci, String hafiza,
			String kasaBoyutu, String gucKaynagi) {
		super(marka, model, ekranKarti, islemci, hafiza);
		setRam("2x8gb");
		this.kasaBoyutu = kasaBoyutu;
		this.GucKaynagi = gucKaynagi;
	}


	public DesktopBilgisayar(String marka, String ekranKarti, String islemci) {
		super(marka, ekranKarti, islemci);
	}
	
	
	
}
