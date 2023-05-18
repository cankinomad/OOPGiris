package com.berkOs.Hafta06.Gun2.Sehirler;

import java.util.Random;
import java.util.Scanner;

public class Sehir implements ISehir,Comparable<Sehir> {
	Scanner input=new Scanner(System.in);
	private String isim;
	private String plakaKodu;
	private int nufus;
	
	
	public Sehir() {
		super();
	}
	
	
	public Sehir(String isim) {
		super();
		this.isim = isim;
	}
	
	public Sehir(String isim,int index) {
		super();
		this.isim = isim;
		this.plakaKodu=plakaKoduUret(index);
		this.nufus=rastgeleNufusOlustur();
	}
	


	public void sehirOlustur() {
		System.out.println("Sehir ismini giriniz");
		this.isim=input.nextLine();
		System.out.println("Sehir plakasini giriniz");
		this.plakaKodu=input.nextLine();
		System.out.println("Sehir nufusunu giriniz");
		this.nufus=input.nextInt();
	}


	@Override
	public String toString() {
		return "Sehir [isim=" + isim + ", plakaKodu=" + plakaKodu + ", nufus=" + nufus + "]";
	}


	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getPlakaKodu() {
		return plakaKodu;
	}

	public void setPlakaKodu(String plakaKodu) {
		this.plakaKodu = plakaKodu;
	}

	public int getNufus() {
		return nufus;
	}

	public void setNufus(int nufus) {
		this.nufus = nufus;
	}


	@Override
	public String plakaKoduUret(int index) {
		if(index<9) {
			return "0"+(index+1);
		}else {
			return	index+1+"";
		}
		
	}


	@Override
	public int rastgeleNufusOlustur() {
		Random random=new Random();
		return random.nextInt(100000,150000000);
	}


	@Override
	public int compareTo(Sehir k) { //sinifta 1 kere donebiliyorsun eger boyle implement edersen, comparator yaparsan farkli metodlarla kontrol yapabilrisin.
		int sonuc=Integer.parseInt(this.getPlakaKodu())-Integer.parseInt(k.getPlakaKodu());
		if(sonuc==0) {
			sonuc=this.getNufus()-k.getNufus(); //bunlar yerine sthis.plaka.comprateTo(k.plaka)
		}
		return sonuc;
	}
	


	
	
	
}
