package com.berkOs.Hafta05.Gun3.interfaceOrnekSiniflaBeraber;

public abstract class Gemi extends Arac implements IDenizTasiti{
	
	private int odaSayisi;

	@Override
	public void yelkenAc() {
		System.out.println("Yelken aciliyor");
		
	}

	@Override
	public void limanaYanas() {
		System.out.println("Limana yaklasiliyor");
		
	}

	@Override
	public void hizlan() {
		System.out.println(this.getClass().getSimpleName()+"Hizlaniyor");//icinde bulundugun classin basitce ismini yazdirir.
		hiz+=10;
		hizGoster();
		
	}

	@Override
	public void yavasla() {
		System.out.println(this.getClass().getSimpleName()+"Yavasliyor");//icinde bulundugun classin basitce ismini yazdirir.
		if (hiz>0) {
		hiz-=10;
		hizGoster();
		
		}
		
	}

	
}
