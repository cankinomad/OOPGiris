package com.berkOs.Hafta05.Gun3.interfaceOrnekSiniflaBeraber;

public class Helikopter extends Arac implements IHavaTasiti{

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
		hiz+=40;
		hizGoster();
		
	}

	@Override
	public void yavasla() {
		System.out.println(this.getClass().getSimpleName()+"Yavasliyor");//icinde bulundugun classin basitce ismini yazdirir.
		if (hiz>0) {
		hiz-=40;
		hizGoster();
		
		}
		
	}
}
