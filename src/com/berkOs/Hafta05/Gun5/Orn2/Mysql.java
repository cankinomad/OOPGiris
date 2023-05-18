package com.berkOs.Hafta05.Gun5.Orn2;

public class Mysql implements IDatabase{

	
	@Override
	public void ekle() {
		System.out.println("Mysql veri tabanina veri eklendi");
	}
	@Override
	public void sil() {
		System.out.println("Mysql veri tabanindan veri silindi");
	}
	@Override
	public void verileriGetir() {
		System.out.println("Mysql veri tabanindan veriler getirildi");		
	}
	@Override
	public void guncelle() {
		System.out.println("Mysql veri tabani guncellendi");		
	}
	@Override
	public void login() {
		System.out.println("Mysql'e baglanildi");		
	}
}
