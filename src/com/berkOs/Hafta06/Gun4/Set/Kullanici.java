package com.berkOs.Hafta06.Gun4.Set;
/*
 * bir kullanici ismi olsun
 * email ve sifre olsun
 * 
 * ve bu kullanicira yeni kullanici ekleyen bir metod yazacagiz
 * disaridan girilen bilgiler kontrol edilecek 
 * daha sonra test sinifinda kullanicilari tutalim
 * ve ayni kullanici isimli biri daha onceden eklenmisse bizden dogru veri gelene kadar veri almaya devam etsin
 * 
 */
public class Kullanici {
	
	String isim;
	String email;
	String sifre;
	
	
	public Kullanici(String isim, String email, String sifre) {
		super();
		this.isim = isim;
		this.email = email;
		this.sifre = sifre;
	}

	@Override
	public String toString() {
		return "Kullanici [isim=" + isim + ", email=" + email + ", sifre=" + sifre + "]";
	}

	
	
	
}
