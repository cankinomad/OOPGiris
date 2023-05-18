package com.berkOs.Hafta04.gun5.Otobus2;

public class Test {

	public static void main(String[] args) {
		//guzergah olusturma islemleri
		Guzergah guzergah=new Guzergah(481);
		Guzergah guzergah2=new Guzergah(203);
		
		//otobus olusturma islemleri
		Otobus otobus1=new Otobus("1", "06", "Mustafa", 74,guzergah, "Mercedes");
		Otobus otobus2=new Otobus("2", "06", "Mert", 102,guzergah, "Mercedes");
		Otobus otobus3=new Otobus("3", "06", "Merva", 43,guzergah2, "Mercedes");
		Otobus otobus4=new Otobus("4", "06", "Zeliha", 32,guzergah2, "Mercedes");
		Otobus otobus5=new Otobus("5", "06", "Serkan", 43,guzergah2, "Mercedes");
		//Durak olusturma islemleri
		Durak durak1=new Durak(1, "Kecioren", "Ankara");
		Durak durak2=new Durak(2, "Diskapi", "Ankara");
		Durak durak3=new Durak(3, "Ulus", "Ankara");
		Durak durak4=new Durak(4, "YeniMahalle", "Ankara");
		Durak durak5=new Durak(5, "Kizilay", "Ankara");
		
		//duraklara otobus atama
		Otobus []otobusler1= {otobus1,otobus2,otobus5};
		durak1.otobusler=otobusler1;
		
		
		//2. yol
		durak2.otobusler=new Otobus[3]; //newlemen gerekiyor constructor icinde newleme yapmiyopr
		durak2.otobusler[0]=otobus1;
		durak2.otobusler[1]=otobus2;
		durak2.otobusler[2]=otobus3;
		
		Otobus[] otobusler2= {otobus1,otobus2,otobus3,otobus4,otobus5};
		durak3.otobusler=otobusler2;
		durak5.otobusler=otobusler2;
		
		durak4.otobusler=new Otobus[2];
		durak4.otobusler[0]=otobus3;
		durak4.otobusler[1]=otobus4;
		
		System.out.println(guzergah.duraklar.length);
		guzergah.duraklar[0]=durak1; //guzergahi hat alan constructordan yaptigimiz icin orada newleme islemi kendisi yapiyor
		guzergah.duraklar[1]=durak2;
		guzergah.duraklar[2]=durak3;
		guzergah.duraklar[3]=durak5;
		
		
		
		System.out.println(guzergah.duraklar[0]);
		
		
		guzergah2.duraklar[0]=durak4;
		guzergah2.duraklar[1]=durak3;
		guzergah2.duraklar[2]=durak5;
		
		
		Durak[] duraklar= {durak1,durak2,durak3};
		
		
		Guzergah guzergah3=new Guzergah(duraklar, 421);
		
		System.out.println(guzergah3.duraklar.length);
		System.out.println(durak4);
	}

}
