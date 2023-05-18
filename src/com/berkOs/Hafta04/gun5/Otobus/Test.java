package com.berkOs.Hafta04.gun5.Otobus;

import java.util.Arrays;

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
		
		
		//Duraklara otobus atama islemleri
		//1. yontem
		Otobus[] otobusler= {otobus1,otobus2,otobus5};
		durak1.setOtobusler(otobusler);
		durak2.setOtobusler(otobusler);
		
		Otobus[] otobusler2= {otobus1,otobus2,otobus3,otobus4,otobus5};
		durak3.setOtobusler(otobusler2);
		durak5.setOtobusler(otobusler2);
		
		Otobus[] otobusler3= {otobus3,otobus4};
		durak4.setOtobusler(otobusler3);
		
		
		//2. yontem
//		durak1.setOtobusler(new Otobus[3]);
//		durak1.getOtobusler()[0]=otobus1;
//		durak1.getOtobusler()[1]=otobus2;
//		durak1.getOtobusler()[2]=otobus5;
		
		
		
		//guzergahlara durak atama islemleri
		Durak []duraklar1= {durak1,durak2,durak3,durak5};
		Durak[] duraklar2= {durak4,durak3,durak5};
		
		guzergah.setDuraklar(duraklar1);
		guzergah2.setDuraklar(duraklar2);
		
		
		
		
	System.out.println(otobus1); //yazdirirken toString ile loopa giriyor birinden kaldirman gerekiyor ki sonsuz dongu bitsin.
	
	System.out.println(Arrays.toString(durak1.getOtobusler()));
	}

}
