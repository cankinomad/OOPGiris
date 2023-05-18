package com.berkOs.Hafta04.gun2.uygulama1;

import java.util.Arrays;

/*
 * 3 tane kullanici yaratip bunu kullanici listesine ekleyelim.
 */
public class Database {
	
	public static Kullanici[] kullaniciListesi=new Kullanici[6];
	
//	public static final int value=25;
	
	public static int index;
	
	
	public static void veriTabaniBaslangicDegerleri() {
		//kullaniciListesi=new Kullanici[8]; degistiremezsin hata verir final olarak belirledigin icin
		//value=26; yapamazsin.
		Kullanici kullanici1=new Kullanici(index+1, "Mustafa", "mustafa@hotmail.com", "123", "musty");
		kullaniciListesi[index]=kullanici1;
	//	kullanici1.setIsim("Serkan");
		index++;
		Kullanici kullanici2=new Kullanici(index+1, "Mert", "mustafa@hotmail.com", "123", "meto");
		kullaniciListesi[index]=kullanici2;
		index++;
		Kullanici kullanici3=new Kullanici(index+1, "Tuba", "tuba@hotmail.com", "123", "tuba");
		kullaniciListesi[index]=kullanici3;
		index++;
		
		
		
	}
	public static boolean kullaniciVarMi(String username, String sifre) {
		for (int i = 0; i < kullaniciListesi.length; i++) {
			if (kullaniciListesi[i] != null) {

				if (username.equals(kullaniciListesi[i].getUsername())
						&& sifre.equals(kullaniciListesi[i].getSifre())) {
					return true;
					
				}
			}
		}
		return false;
		

	}
	public static void kullaniciEkle(Kullanici kullanici) {
		if(kullaniciListesi[kullaniciListesi.length-1]!=null) {	//index >=kullaniciListesi.length-2
			arrayArttir();
		}
	kullaniciListesi[Database.index] = kullanici;
	index++;
	
	
	}
	
	public static void arrayArttir() {
		veriTabaniBaslangicDegerleri();
		Kullanici[] temp=new Kullanici[kullaniciListesi.length+5];
		 
			for (int i = 0; i < temp.length; i++) {
				temp[i]=kullaniciListesi[i];
			}
		
		kullaniciListesi=temp;
		
		
	}public static void arrayArttir2() {
		veriTabaniBaslangicDegerleri();
		Kullanici[] temp=Arrays.copyOf(kullaniciListesi,kullaniciListesi.length+5);
		 kullaniciListesi=temp;
			
		
	}
	public static void main(String[] args) {
		arrayArttir2();
		arrayArttir2();
		arrayArttir2();
		System.out.println(kullaniciListesi.length);
	}
	
	
}
