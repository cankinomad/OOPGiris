package com.berkOs.Hafta05.Gun3.interfaceOrnekSiniflaBeraber;

public abstract class Ucak extends Arac implements IHavaTasiti {
	
	int kanatUzunlugu;

	@Override
	public void kalkisYap() {
		System.out.println(this.getClass().getSimpleName());
		System.out.println("Kalkis yapiliyor");
		
	}

	@Override
	public void inisYap() {
		System.out.println(this.getClass().getSimpleName());
		System.out.println("Inis yapiliyor");
		
	}
	@Override
	public void hizlan() {
		System.out.println(this.getClass().getSimpleName()+"Hizlaniyor");//icinde bulundugun classin basitce ismini yazdirir.
		hiz+=50;
		hizGoster();
		
	}

	@Override
	public void yavasla() {
		System.out.println(this.getClass().getSimpleName()+"Yavasliyor");//icinde bulundugun classin basitce ismini yazdirir.
		if (hiz>0) {
		hiz-=50;
		hizGoster();
		
		}
		
	}


	
}
