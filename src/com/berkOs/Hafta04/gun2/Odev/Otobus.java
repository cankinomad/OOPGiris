package com.berkOs.Hafta04.gun2.Odev;
/*
 * 1=otobus sinifi soyutlamasi yapalim
 * 2=durak sinifi soyutlayalim
 * 3=durak ile otobus arasi iliski(duraktan gecen otobusler)
 * 
 * 4- test sinifinda birden fazla otobus olusturup bir tane durak olusturup duraga entegre edelim
 * 5-yeni bir durak olusturup buna bikactane yeni otobus bir tane de daha onbce olusturdugumuz otobuslerden ekeleyelim
 * 6-***Guzergah sinifi soyutlamasi yapalim ve durak ile arasindaki iliskiyi kuralim
 * 
 */
public class Otobus {
	
	String no;
	String boyut;
	String tarife;
	String plaka;
	
	public Otobus() {
		
	}
	
	public Otobus(String no, String boyut, String tarife, String plaka) {
		super();
		this.no = no;
		this.boyut = boyut;
		this.tarife = tarife;
		this.plaka = plaka;
	}
	public String getInfo() {
		String info="Arac no: "+no+" Arac boyut: "+boyut+" Tarife: "+tarife+" Arac plaka: "+plaka;
		return info;
	}
	
	
}
