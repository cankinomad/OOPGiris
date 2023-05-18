package com.berkOs.Hafta05.Gun3.interfaceOrnekSiniflaBeraber;

/*
 * Bir Arac sınıfımız olsun

Daha sonra uçak otomobil,kamyon gemi  gibi sınıflarımızıda oluşturalım

Gerkirse bu sınıflarada alt sınıflar tanımlayabilirsiniz

Hızlanma yavaşlama gibi metotlarımız olsun

kalkısYap() inişyap() yelkenAc() limanaYanas() sur()(kara tasitlari) gibi metotlarımız olsun

Bazı araçlar yuk taşıyabilsinler bunun için yükal ve yükbosalt metotlarımız olsun

Bu uygulamayı olusturken interfacelerden yararlanın 
 */
/*
 * Bir yukverme metodu olsun dirasidan aldigimiz nesne bu metot icinde yuk alsin
 */
public class Test {
	
	public static void main(String[] args) {
		
		Arac arac1=new Otomobil();	//polymorphism oldu
		Arac arac2=new Kamyon();
	
		Arac arac3=new YolcuGemisi();
		Arac arac4=new YukGemisi();
		
		Arac arac5=new YolcuUcagi();
		Arac arac6=new KargoUcagi();

		Arac arac7=new Helikopter();
		
		
		
		arac1.hizlan();
		arac2.hizlan();
		arac3.hizlan();
		arac4.hizlan();
		arac5.hizlan();
		arac6.hizlan();
		arac7.hizlan();
		
		kalkisIzniVer((Ucak) arac5);
		kalkisIzniVer((Ucak) arac6);
		kalkisIzniVer((Helikopter) arac7);
		
		IHavaTasiti arac8=new YolcuUcagi();	//bu da bir polymorphizm ornegi
		IHavaTasiti arac9=new KargoUcagi();
		IHavaTasiti arac10=new Helikopter();
		System.out.println("---------==========----------");
		kalkisIzniVer(arac10);
		kalkisIzniVer(arac9);
		kalkisIzniVer(arac8);
		
		IYuk arac11=new YukGemisi();
		IYuk arac12=new KargoUcagi();
		IYuk arac13=new Kamyon();
		
		yukVerme(arac11);
		yukVerme(arac12);
		yukVerme(arac13);
	}
	public static void kalkisIzniVer(IHavaTasiti havatasiti) { //ucak sinifi ve helikopter sinifi icin 2 ayri metod yapmak yerine ortak noktalari olan
		System.out.println(havatasiti.getClass().getSimpleName()+"Kalkis izni verildi");				// havatasiti interfaceinde metod yazip parametre olarak alirsna ikisini de
		havatasiti.kalkisYap();									//girebilirsin
	}
	public static void yukVerme(IYuk tasit) {
		System.out.println(tasit.getClass().getSimpleName()+" Yuk aldi"); //assagidaki metodu almadan da yapabilirsin icine getclass simplename yazarak
		tasit.yukAl();
	}
}
