package com.berkOs.Hafta05.Gun3.interfaceOrnekSiniflaBeraber;

public class Otomobil extends Arac implements IKaraTasiti{

	@Override
	public void sur() {
		System.out.println("Harekete Gecildi");
		
	}
	@Override
	public void hizlan() {
		System.out.println(this.getClass().getSimpleName()+"Hizlaniyor");//icinde bulundugun classin basitce ismini yazdirir.
		hiz+=20;
		hizGoster();
		
	}

	@Override
	public void yavasla() {
		System.out.println(this.getClass().getSimpleName()+"Yavasliyor");//icinde bulundugun classin basitce ismini yazdirir.
		if (hiz>0) {
		hiz-=20;
		hizGoster();
		
		}
		
	}
	
	
}
