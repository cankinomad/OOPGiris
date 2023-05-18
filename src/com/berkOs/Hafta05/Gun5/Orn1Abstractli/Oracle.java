package com.berkOs.Hafta05.Gun5.Orn1Abstractli;

public class Oracle extends Database {

	
	@Override
	public void ekle() {
		System.out.println("Oracle veri tabanina veri eklendi");
	}
	@Override
	public void sil() {
		System.out.println("Oracle veri tabanindan veri silindi");
	}
	@Override
	public void verileriGetir() {
		System.out.println("Oracle veri tabanindan veriler getirildi");		
	}
	@Override
	public void guncelle() {
		System.out.println("Oracle veri tabani guncellendi");		
	}
	@Override
	public void login() {
		System.out.println("Oracle'a baglanildi");		
	}
}
