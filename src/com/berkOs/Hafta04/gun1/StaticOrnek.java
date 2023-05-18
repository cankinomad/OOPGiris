package com.berkOs.Hafta04.gun1;

public class StaticOrnek {
	public int number1;//nesne degiskeni -nesne ozelligi
	
	static int number2=20;//sinif degiskeni -sinif ozelligi
	
	public static void main(String[] args) {
		StaticOrnek myStaticOrnek=new StaticOrnek();//number1 i kullanmak icin nesne olusutuyorsun
		System.out.println(myStaticOrnek.number1);//artik o siniftaki number1 i kullanmak icin suan belirledigin degisken ismiyle cagiriyorsun
		myStaticOrnek.number1=12;
		System.out.println(myStaticOrnek.number1);
		System.out.println(myStaticOrnek);//ilk referans adresi
	//=================================================================================	
		
		myStaticOrnek=new StaticOrnek();//new yapinca yeni bi referans olusturuldu ve number1 default'da ne tanimlanmissa o degere dondu
		System.out.println(myStaticOrnek.number1);
		System.out.println(myStaticOrnek); //yeni referans adresi degisti
	//==========================================================================	
		System.out.println(myStaticOrnek.number2);//bu bir static zaten nesne uzerinden ulasmana gerek yok uyarisi veriyor
		System.out.println(StaticOrnek.number2);
		System.out.println(number2);
		//System.out.println(number1);
		
	
	}
	
	public void numaraVer() {
		System.out.println("Numara ver metodu");
		number1+=1;
		number2+=1;
		System.out.println("number1========>"+number1);
		System.out.println("number2========>"+number2);
	}
	public static void numaraVer2() {
		System.out.println(number2);
		//System.out.println(number1);//static metod icinde static olmayan bir metod kullanamazsin veya herhangi bir ozelligi direk kullanamazsin
		//kullanmak icin nesne uretmek gerekli.
		
	}

}
