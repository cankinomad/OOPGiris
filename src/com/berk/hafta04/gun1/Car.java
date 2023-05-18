package com.berk.hafta04.gun1;
//sinif nesnenin sablonu
//sinif icerisinde nesneler uretiriz.
public class Car {
	//Sinif Degiskeni
	public  static final int MAX_HIZ=150; //sabit degerler static ise boyle buyuk yazilir. nesneden bagimsiz
	public static int URETILEN_ARAC_SAYISI=0;
	//uye degiskenler memeber variable
	public String marka;
	public String model;
	public String yil;
	public double km;
	private int hiz;
	
	public int getHiz() {
		return this.hiz;
	}
	
	public void setHiz(int hiz) {
		if(hiz>0 && hiz<MAX_HIZ) {
		this.hiz=hiz;
		}else if(hiz<0){
			System.err.println("Girdiginiz deger 0'dan kucuk oldugu icin hiz 0'a esitlendi");
			this.hiz=0;
		}else {
			System.err.println("Girdiginiz deger Max Hiz'dan kucuk oldugu icin hiz"+MAX_HIZ+"'a esitlendi");
			this.hiz=MAX_HIZ;
		}
		
	}
	
	
	
	public MotorOzellikleri motor; //motorozellikleri sinifini ekledik motor adinda// artik motor cagirirsan motorozellikleri sinifina ulasirsin
	//burada motorozellikleri ortak ozelllikler olabilecegi icin onu ayri bir sinifta olusturuyoruz
	//ozellikleri orda yaziyoruz
	
	//default constructor metod,sen istersen degistirebilirsin
//	public Car() { //overloading yaparak farkli parametreler alan metod yaziyoruz
//		//deneme
//		System.out.println("Constructor metod calisti");
//	}
//	
	public Car(String markaYeni, String modelYeni) {
		this(markaYeni,modelYeni,null); //bosluga yilyeni eklenecek //null yerinme "" yapabilrisn string icin
		System.out.println("******************* 2 parametreli costructor calisti");
	}
	public Car(String markaYeni, String modelYeni,String yilYeni) {
		this(markaYeni,modelYeni,yilYeni,0,0);//this den once hicbir sey yazamazsin
		System.out.println("******************* 3 parametreli costructor calisti");
	}
	
	public Car(String marka, String model, String yil, int km, int hiz) {
		//this metoduyla tekrarlayan kodlar yazmak istemiyorsan once en genis yapabilecegin constructor'i olustur, onun uzerinden daha az parametre alan
		//constructorlar olusturuyoruz.

		URETILEN_ARAC_SAYISI++; //2 parametreli 3'e== 3 parametreli 5 e gittigi icin en genisinde arttirsan 1 kere arttirmis oluyor diger turlu her constructor icin arttiriyor
		this.marka=marka; //this yazarsan bu sinifin icindeki nesneye bagli olan degiskenleri temsil ediyor
		this.model=model;
		this.yil=yil;
		this.km=km;
		this.hiz=hiz;
		
		System.out.println("******************* 6 parametreli costructor calisti");
	}
	
	
	
	
	public Car() {
		URETILEN_ARAC_SAYISI++;
		
	}




	public double go(double gidilenKm) {
		km+=gidilenKm;
		//Zamani donelim:
		double zaman=(double) gidilenKm/hiz;
		return zaman;
	}
	public void hizlanma(int hizArtisMiktari) {
		if(hiz+hizArtisMiktari<MAX_HIZ) {
		hiz+=hizArtisMiktari;
		}else {
			hiz=150;
			System.out.println("Max hiz gecildi");
		}
	}
	public void yavasla(int hizAzalisMiktari) {
		hiz-=hizAzalisMiktari;
	}
	public void stop() {
		hiz=0;
	}
	public static void sinifBilgisi(String fabrikaAd) {
//		Car car1=new Car();
//		car1.marka="Renault";
		System.out.println("Max hiz: "+MAX_HIZ+fabrikaAd); //sadece static metod olanlari cagirabilirsin
		// System.out.println(this.marka); //static icinde this metodu kullanamiyorsun
	}
	public String getInfo() {
		String info="Arac bilgileri: \nMarka: "+marka+
				" Model: "+model+" Yil:"+yil+" Km:"+km+
				" Hiz: "+hiz;
		return info;
	}

	@Override
	public String toString() {
		return "Car [marka=" + marka + ", model=" + model + ", yil=" + yil + ", km=" + km + ", hiz=" + hiz + ", motor="
				+ motor + "]";
	}
	
	
}
