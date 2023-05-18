package com.berkOs.Hafta05.Gun5.TasKagitMakas;
/*
 * Bir Uygulama sinifimiz olacak, bu sinifta once bilgisayar tas kagit veya makas'dan birini 
 * random olarak sececek. daha sonra bizde kendi secimimizi yapacagiz
 * 
 * bu iki secim karsilastirilarak oyunun galibi belirlenecek
 */
public class Test {
	public static void main(String[] args) {
		Uygulama uygulama=new Uygulama();
		uygulama.oyun();
		Uygulama2 uygulama2=new Uygulama2();
		uygulama2.oyun();
	}
}
