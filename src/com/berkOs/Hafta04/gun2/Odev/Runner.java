package com.berkOs.Hafta04.gun2.Odev;

public class Runner {
		
		public static void main(String[] args) {
			
		Durak durak1=new Durak();
		Otobus otobus1=new Otobus();
		Otobus otobus2=new Otobus();
		Otobus otobus3=new Otobus();
		Otobus otobus4=new Otobus("KC34", "Buyuk", "Tek", "07 JKL 56");
		Otobus otobus5=new Otobus("LF09", "Buyuk", "Tek", "07 MNO 55");
		Durak durak2=new Durak();
		
		Otobus [] otobuslerdurak3=new Otobus[50];	//once kac otobus olsun istiyorsan onu yaz
		//otobusler[0]=otobus5;
		Durak durak3=new Durak(otobuslerdurak3, "abc"); //burada durak 3 icin otobusler dizisinin sayisini belirleyip sinirladik
		
		durak2.otobusler=new Otobus[4];
		durak2.otobusler[0]=otobus5;
		//veya
		durak2.otobus=otobus5;//sadece 1 tane atayabiliyorsun
		//durak2.otobusler=new Otobus[5];
		//=====================================
		otobus1.boyut="mini";
		otobus1.no="kl08";
		otobus1.plaka="07 ABC 58";
		otobus1.tarife="Tek";
		
		//=====================================
		otobus2.boyut="Orta";
		otobus2.no="600";
		otobus2.plaka="07 DEF 58";
		otobus2.tarife="Cift";
		
		//=====================================
		otobus3.boyut="Buyuk";
		otobus3.no="KC06";
		otobus3.plaka="07 GHI 58";
		otobus3.tarife="Tek";
		//=====================================
		
		durak1.ad="Selimiye";
		durak1.otobusler=new Otobus[10];
		durak1.otobusler[0]=otobus1;
		durak1.otobusler[1]=otobus2;
		durak1.otobusler[2]=otobus3;
		durak1.otobusler[3]=otobus4;
		durak1.otobusler[4]=otobus5;
		
	System.out.println(otobus5.getInfo());
	}

}
