package com.berkOs.Hafta05.Gun3.Odev;

public class Test {

	
	/*
	 * Database imiz olacak
	 * Mysql ve oracle siniflarimiz olsun // kullanici adi ve sifresi olur
	 * daha sonra bir database baglanma metodu olsun
	 * bunlardan harici ise ekle sil guncelle verileri getir metotlarimiz olsun 
	 *  bu yapiyi interface ve kalitim kullanarak soyutlayiniz.
	 * 
	 */
	
	public static void main(String[] args) {
		MySQL kullaniciMySQL=new MySQL("Canki", "nomad5", "cankinomad@gmail.com,", "654524");
		Oracle kullaniciOracle=new Oracle("Hendricks", "VAl533", "hendricks@gmail.com", "543223");
		
		kullaniciMySQL.Kullaniciekle();
		kullaniciOracle.Kullaniciekle();
		System.out.println("===============================");
		
		kullaniciMySQL.KullaniciSil();
		kullaniciOracle.KullaniciSil();
		System.out.println("===============================");

		kullaniciMySQL.verileriGuncelle();
		kullaniciOracle.verileriGuncelle();
		System.out.println("===============================");

		kullaniciMySQL.verileriGetir();
		kullaniciOracle.verileriGetir();
		
	}

}
