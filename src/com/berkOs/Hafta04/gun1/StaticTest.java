package com.berkOs.Hafta04.gun1;

public class StaticTest {
	StaticOrnek ornek=new StaticOrnek();
	public static void main(String[] args) {
		
		StaticTest staticTest=new StaticTest();
		System.out.println(staticTest.ornek.number1);//1. yol baska bir sinif icinde kullanmak istersen boyle cagiracaksin
		
		
		
		System.out.println(StaticOrnek.number2);
		//static oldugu icin baska bir sinifta da calisiyor
		
		StaticOrnek myStaticOrnek=new StaticOrnek();//number1 i kullanmak icin nesne olusutuyorsun //2. yol //direk mainde yapcaksan bunu yapabilirsin
		System.out.println(myStaticOrnek.number1);//artik o siniftaki number1 i kullanmak icin suan belirledigin degisken ismiyle cagiriyorsun
		myStaticOrnek.number1=12;
		System.out.println(myStaticOrnek.number1);
		
		myStaticOrnek.numaraVer(); //static degil nesneden cagirdik ustte
		
		StaticOrnek.numaraVer2(); //sinif ismini yazip metodu cagirabilirsin static oldugu icin
		
	}
}
