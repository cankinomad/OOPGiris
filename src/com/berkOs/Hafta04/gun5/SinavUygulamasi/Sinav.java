package com.berkOs.Hafta04.gun5.SinavUygulamasi;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 
 * Sinavolustur()==> metodumuz olacak//sinav sinifinda
 * disaridan gereken verileri alacak sinav konusu soru sayisi gibi.
 * sorulari da olusturmak gerekecek. bu soru olusturma isini soru sinifinda bir metoda devredelim
 * Soru sinifinda bir soru olusturma metodu yazalim.
 * soruOlustur()==> disaridan soru ile ilgili verileri alacak  icerik,puan,cevapicerikleri gibi
 * ve iceride cevap iceriklerini de kullanicidan alacagiz. 
 *	//tek metod soru sinifinda olacak
 * bu iki metod sayesinde sinavimiz olusmus olacak
 * 
 * Assagidaki metodlar sinav sinifinda olusturulacak
 * 
 * daha sonra sinav sinifinda cevaplari gir diye bir metod olusturacagiz.
 * bu metod sinav sorularini sira ile gosterirken bizden cevaplari alacak
 * 
 * daha sonra baska bir metod daha yazip cevaplarikontrolEt  bi onceki metoddan aldigimiz cevaplari
 * sorularin dogru cevabi ile kontrol edip sinav puanimizi hesaplayan bir metod olacak
 * 
 * 
 */
public class Sinav {
	static Scanner input = new Scanner(System.in);
	
	public static int index;

	public String ders;
	public String konusu;
	public int soruSayisi;
	public String sure;
	public Soru[] sorular;
	public String[] cevaplar;
	public String[] cevapSecenekleri = { "A", "B", "C", "D" }; // A,B,C,D
	
	Soru []soruListesi=new Soru[10];

	public Sinav() {
		System.out.println("Sinavin konusunu giriniz: ");
		this.konusu =input.nextLine(); 
		System.out.println("Ders Adi: ");
		this.ders = input.nextLine();	
		System.out.println("Kac Soruluk Sinav: ");
		this.soruSayisi = input.nextInt();
		input.nextLine();
		System.out.println("Sinav suresi");
		this.sure=input.nextLine();
		
		sorular=new Soru[soruSayisi];
	}

	public Sinav(String ders, String konusu, int soruSayisi, String sure) {
	
		this.ders = ders;
		this.konusu = konusu;
		this.soruSayisi = soruSayisi;
		this.sure = sure;
		
	}

	// Sinavolustur()==> metodumuz olacak//sinav sinifinda
	// * disaridan gereken verileri alacak sinav konusu soru sayisi gibi.
	public void sinavOlustur() {
		Sinav sinav=new Sinav();			
		
	}

	public static void anaMenu() {//static yaparsan o sinifa bagli olur ve onun uzerinden cekebilirsin tekrar nesne olusturmana gerek kalmaz.
		System.out.println("===============");
		System.out.println("Sinav Uygulamasi");
		System.out.println("================");
	}

	public int secim() {
		System.out.println("1-Sinav olustur");
		System.out.println("2-Sorulari gir");
		System.out.println("3-Sorulari goruntule");
		System.out.println("4-Sorulari cevapla");
		System.out.println("0-Cikis yap");
		System.out.println("Seciminizi yapin");
		int secimim = input.nextInt();
		return secimim;
	}

	
	
	public void sorulariGoster() {
		for (Soru soruListesi : sorular) {
			if(soruListesi!=null) {
				System.out.println(soruListesi);
			}
		}
	}
	
	public static void sorulariTut() {
		
	}
	

	public String getDers() {
		return ders;
	}

	public void setDers(String ders) {
		this.ders = ders;
	}

	public String getKonusu() {
		return konusu;
	}

	public void setKonusu(String konusu) {
		this.konusu = konusu;
	}

	public int getSoruSayisi() {
		return soruSayisi;
	}

	public void setSoruSayisi(int soruSayisi) {
		this.soruSayisi = soruSayisi;
	}

	
	

	public Soru[] getSorular() {
		return sorular;
	}

	public void setSorular(Soru[] sorular) {
		this.sorular = sorular;
	}

	public String[] getCevaplar() {
		return cevaplar;
	}

	public void setCevaplar(String[] cevaplar) {
		this.cevaplar = cevaplar;
	}

	public String[] getCevapSecenekleri() {
		return cevapSecenekleri;
	}

	public void setCevapSecenekleri(String[] cevapSecenekleri) {
		this.cevapSecenekleri = cevapSecenekleri;
	}

	@Override
	public String toString() {
		return "Sinav [ders=" + ders + ", konusu=" + konusu + ", soruSayisi=" + soruSayisi + ", sure=" + sure
				+ ", sorular=" + Arrays.toString(sorular) + ", cevaplar=" + Arrays.toString(cevaplar)
				+ ", cevapSecenekleri=" + Arrays.toString(cevapSecenekleri) + "]";
	}

}
