package com.berkOs.Hafta04.gun2.uygulama1;

public class Main {

	public static void main(String[] args) {
		Uygulama uygulama=new Uygulama();
		Database.veriTabaniBaslangicDegerleri();
		uygulama.UygulamaBaslat();
		System.out.println(Database.kullaniciVarMi("berkaktas2", "enaz8harf"));
		

	}

}
