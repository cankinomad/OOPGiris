package com.berkOs.Hafta05.Gun3.interfaceOrnekSiniflaBeraber;
/*
 * abstract siniflarda ne zaman abstract metot yazariz:
 * 
 * metot alt siniflarda degisime ugruyorsa abstrract metot yazariz
 * ugramiyorsa govdeli metot yazariz
 * 
 * hiz
 * ucaklarda 50, gemilerde 10, otomobillerde 20, kamyonlarda 5 artsin ve azalsin.
 */
public abstract class Arac  {
	
	int hiz;

	
	public abstract void hizlan();


	public abstract void yavasla();
	
	public void hizGoster() {
		
	System.out.println("Hiziniz====> "+hiz);
	
}
}