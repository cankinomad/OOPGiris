package com.berkOs.Hafta05.Gun3.Odev;

public class MySQL extends DataBase implements IEkleVeSil {
	
	private String mysQlcode;
	
	

	public MySQL(String kullaniciAdi, String sifre, String email, String mysQlcode) {
		super(kullaniciAdi, sifre, email);
		setMysQlcode(mysQlcode);
	}



	@Override
	public void girisYap() {
		System.out.println("MySQL hesabiniza basariyla giris yapildi");
	}



	public String getMysQlcode() {
		return mysQlcode;
	}



	public void setMysQlcode(String mysQlcode) {
		if(mysQlcode.length()>5) {
		this.mysQlcode = mysQlcode;}
		else {
			System.out.println("eksik veya hatali bir kodlama yaptiniz. 5 Haneli kodunuzu girmeyi tekrar deneyiniz");
		}
	}






	@Override
	public void KullaniciSil() {
		System.out.println("Kullanici MySQL sitesinden silindi");		
	}



	@Override
	public void Kullaniciekle() {
		System.out.println("Kullanici MySQL sitesine eklendi");
		
	}



	@Override
	public void verileriGuncelle() {
		System.out.println("MysQL database verileri guncellendi!");
		
	}



	@Override
	public void verileriGetir() {
		System.out.println("MySQL verileri getirildi!");
	}


	
}
