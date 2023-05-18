package com.berkOs.Hafta04.gun2.soyutlama;

public class UserProfile {
		
		int id;
		String avatar;
		String username;	
		int takipSayisi;				//ozellikleri
		int takipciSayisi;
		
		Post[] postlar;
		int postSayisi;
		
		public void profiliDuzenle() {	//davranislari
			
			System.out.println("Profil Duzenlendi");
		}
		
		public void postOlustur() {
			System.out.println("Post olusturuldu");
		}
}
