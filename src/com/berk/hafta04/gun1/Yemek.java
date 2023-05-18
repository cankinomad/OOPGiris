package com.berk.hafta04.gun1;

import java.util.Scanner;

public class Yemek {
	
	public String malzemeler;
	public int pisirmeSuresi;
	public int hamurBeklemeSuresi;
	public double kalori;
	
	
	public void gerekliMalzemeler() {
		System.out.println("2 yumurta,150gr hamur");
	}
	public int cookingTime() {
		Scanner input=new Scanner(System.in);
		System.out.println("bulundugunuz sehri giriniz");
		String sehir=input.next();
		switch (sehir) {
		case "Antalya":
				return 5;
		default:
			return 4;
			
		}
		
	}public void doughTime() {
		System.out.println("Kulak memesi kivamina gelene kadar bekleyin");
	}
	public double kaloriHesapla(int tabak) {
		double kalori=800.4;
		int yeniKalori=0;
		for (int i = 0; i < tabak; i++) {
			yeniKalori+=kalori;
		}
		return yeniKalori;
		
		
	}

}
