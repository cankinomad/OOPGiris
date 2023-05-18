package com.berkOs.Hafta05.Gun3.Odev;

public abstract class DataBase implements IGuncelle,IVerileriGetir{
	
	private String KullaniciAdi;
	private String Sifre;
	private String email;
	private String telNo;
	
	
	
	
	public DataBase(String kullaniciAdi, String sifre, String email) {
		super();
		setKullaniciAdi(kullaniciAdi);
		setSifre(sifre);
		setEmail(email);
	}
	


	public abstract void girisYap();


	public String getKullaniciAdi() {
		return KullaniciAdi;
	}


	public void setKullaniciAdi(String kullaniciAdi) {
		KullaniciAdi = kullaniciAdi;
	}


	public String getSifre() {
		return Sifre;
	}


	public void setSifre(String sifre) {
		if(sifre.length()>5)
		Sifre = sifre;
		else {
			System.out.println("Sifreniz en az 5 karakterli olmalidir");
		}
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		if(email.contains("@hotmail.com")|| email.contains("@gmail.com")||email.contains("@outlook.com")) {
		this.email = email;}
		else {
			System.out.println("Yanlis bir mail girdiniz lutfen tekrar deneyiniz");
		}
	}


	public String getTelNo() {
		return telNo;
	}


	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
	
	
	
}
