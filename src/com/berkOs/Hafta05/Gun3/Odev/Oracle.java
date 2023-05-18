package com.berkOs.Hafta05.Gun3.Odev;

public class Oracle extends DataBase implements IEkleVeSil{
	private String oracleCode;
	
	

	public Oracle(String kullaniciAdi, String sifre, String email, String oracleCode) {
		super(kullaniciAdi, sifre, email);
		setOracleCode(oracleCode);
	}



	@Override
	public void girisYap() {
		System.out.println("Oracle Hesabiniza basariyla giris yapildi");
		
	}



	public String getOracleCode() {
		return oracleCode;
	}



	public void setOracleCode(String oracleCode) {
		if(oracleCode.length()>5) {
		this.oracleCode = oracleCode;}
		else {
			System.out.println("Eksik veya hatali bir kodlama yaptiniz. 5 haneli kodunuzu tekrar giriniz");
		}
	}



	@Override
	public void Kullaniciekle() {
		System.out.println("Kullanici Oracle sitesine eklendi");
		
	}



	@Override
	public void KullaniciSil() {
		System.out.println("Kullanici Oracle sitesinden silindi");
		
	}



	


	@Override
	public void verileriGuncelle() {
		System.out.println("Oracle database verileri guncellendi!");
		
	}



	@Override
	public void verileriGetir() {
		System.out.println("Oracle verileri getirildi");
		
	}
	
}
