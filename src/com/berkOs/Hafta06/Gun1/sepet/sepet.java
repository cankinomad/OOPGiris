package com.berkOs.Hafta06.Gun1.sepet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * "Cips","Kola","Seker","Yag","Un","Ekmek","Cay","Yumurta","Yogurt","Sut"
 * sabit urunlerimiz olsun(Enum olsun)
 * 
 * Daha sonra sepet sinifinda String bir urun arrayi tutalim veya listesi
 *bu urun listesi Urun enumunu referans alacak
 *
 *birde String olarak bir sepet listemiz olsun.
 *
 *1-metod: enumdaki verilerden sepet sinifimizdaki urunler listemizi doldursun
 *2- menu olusturalim
 *	1-Urunleri listele
 *	2-Sepete ekle
 *	3-sepeti goster
 *
 *daha sonra bu 3 secenege birer metod yazalim
 */

public class sepet {

	List<String> urunler;
	List<String> sepet;

	public sepet() {
		this.urunler = new ArrayList<>();
		this.sepet = new ArrayList<>();
		urunleriOlustur();
	}

	public void urunleriOlustur() {
		for (EUrun urun : EUrun.values()) {
			this.urunler.add(urun.name());
		}
	}

	public void menu() {
		Scanner input = new Scanner(System.in);

		boolean devam = true;

		while (devam) {
		System.out.println("Sepet Menusu");
		System.out.println("1-Urunleri listele");
		System.out.println("2-Sepete ekle");
		System.out.println("3-sepeti goster");
		System.out.println("4-Cikis");
		System.out.println("Lutfen bir secim yapiniz");
		int secim = input.nextInt();
		input.nextLine();

		switch (secim) {
		case 1:
			urunleriListele();
			break;
		case 2:
			urunEkle();
			break;
		case 3:
			sepetiGoster();
			break;
		case 4:
			System.out.println("Cikis yapiliyor...");
			devam = false;
			break;

		default:
			System.out.println("Gecersiz secim!!!");
			break;
		}}
	}

	public void urunleriListele() {
		int sayac = 1;
		for (String urun : urunler) {
			System.out.println(sayac + "-" + urun);
			sayac++;
		}
	}

	public void sepeteEkle(String urun) {
		if (urunler.contains(urun)) {
			sepet.add(urun);
		} else {
			System.out.println(
		"Boyle bir urun bulunamadi. Eklemek istediginiz urunun urun listesinde oldugundan emin olunuz");
		}
	}

	public void sepeteEkle2(String... urun) {

		for (String string : urun) {
			if (urunler.contains(string)) {
				sepet.add(string);
			} else {
				System.out.println(
						"Boyle bir urun bulunamadi. Eklemek istediginiz urunun urun listesinde oldugundan emin olunuz");
			}
		}
	}

	public void sepetiGoster() {
		if (sepet.isEmpty()) {
			System.out.println("Sepetiniz Bos");
		} else {
			int sayac = 1;
			for (String sepettekiler : sepet) {
				System.out.println(sayac + "-" + sepettekiler);
				sayac++;
			}
		}
	}

	public void urunEkle() {
		Scanner input = new Scanner(System.in);
		urunleriListele();
		System.out.println("Lutfen bir urun seciniz");
		int secim = Integer.parseInt(input.nextLine());
		if (!secimKontrol(secim)) {
			System.out.println("Yanlis bir deger girdiniz");
		} else {
			sepet.add(urunler.get(secim - 1));
		}
		input.nextLine();
	}

	public boolean secimKontrol(int secim) {
		boolean kontrol = false;
		if (secim > 0 && secim <= urunler.size()) {
			kontrol = true;
		} else {
			kontrol = false;
		}
		return kontrol;
	}

}
