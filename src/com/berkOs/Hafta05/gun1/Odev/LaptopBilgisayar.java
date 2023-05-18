package com.berkOs.Hafta05.gun1.Odev;

public class LaptopBilgisayar extends Bilgisayar{
	
	 String ekranBoyutu;
	 Ekran ekranTipi;
	 String klavyeTipi;
	 
	 
	 
	 
	public LaptopBilgisayar(String marka, String ekranKarti, String islemci, String ekranBoyutu, 
			String klavyeTipi) {
		super(marka, ekranKarti, islemci);
		this.ekranBoyutu = ekranBoyutu;
		this.klavyeTipi = klavyeTipi;
	}




	public LaptopBilgisayar(String marka, String model, String ekranKarti, String islemci, String hafiza,
			String ekranBoyutu, String klavyeTipi) {
		super(marka, model, ekranKarti, islemci, hafiza);
		setRam("1x8gb");
		this.ekranBoyutu = ekranBoyutu;
		this.klavyeTipi = klavyeTipi;
	}




	@Override
	public String toString() {
		return "LaptopBilgisayar [ekranBoyutu=" + ekranBoyutu + ", klavyeTipi=" + klavyeTipi +super.toString()+ "]";
	}
	 
	 
	 
}
