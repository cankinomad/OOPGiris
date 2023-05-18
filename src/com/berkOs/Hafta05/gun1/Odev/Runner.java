package com.berkOs.Hafta05.gun1.Odev;
/*
 * Bir bilgisayar sinifi olusturalim
 * daha sonra kalitim yapisiyla beraber bunun alt siniflarini da olsuturalim
 * bilgisayar sinifinda diger tanimaldiginiz ozellikler icinde siniflar olsuturabilirsiniz.
 */
public class Runner {
	
	public static void main(String[] args) {
		
		DesktopBilgisayar ibuypower=new DesktopBilgisayar("ibuypower", "hx6t", "3060ti", "i7-12700k", "1Tb", "mini-Tower", "700W");
		
		ibuypower.getRam(); //bilgileri girdik. ozel olarak ram atamasi yapmazsak default 2x8gb geliyor
		System.out.println(ibuypower.getRam());
		System.out.println("===========Ayarladiktan sonra===========");
		ibuypower.setRam("2x16gb-3200Mhz");
		System.out.println(ibuypower.getRam());
		
		System.out.println("================Dizustu==============");
		LaptopBilgisayar dizUstu=new LaptopBilgisayar("MSI", "RTX 2060", "i7-6700hq", "17.3inch","Turkce Q Klavye");
		System.out.println(dizUstu.toString()); //toString yazmasak bile parent class'dan gidip toStringini yazdiiryor. Eger LaptopBilgisayar classinin icinde toString metodunu override edersek
		// sout ciktisi aldigimizda artik LaptopBilgisayar icindeki toStringi getirir.
		
		Ekran ekran=new Ekran();
		System.out.println("bilgisayar=========================");
		DesktopBilgisayar bilgisayar=new DesktopBilgisayar("aasf", "asdfsaf", "asdfsa");
		System.out.println(bilgisayar.getRam());
		
		bilgisayar.setRam("2x8gb");
		System.out.println(bilgisayar.getRam());
		
	}
}
