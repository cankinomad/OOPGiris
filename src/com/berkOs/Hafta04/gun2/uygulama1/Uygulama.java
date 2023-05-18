package com.berkOs.Hafta04.gun2.uygulama1;

import java.util.Scanner;

/*
 * 
 * System.out.println("1-Kayıt Ol");
   System.out.println("2-Giriş Yap");
   System.out.println("3-Kullanıcıları göster");
   System.out.println("4-Çıkış");
 * 
 * 1-meunumuzu olusturacagiz
 * 2-secim yapan bir metot
 * 3-uygulama metodu olacak, burada menudeki islemlere gore bir metod sececegiz
 * 4-kayit ol metodu yazalim==> disaridan aldigimiz veriler bir kullanici olusturup kullanici listesi
 * 5-giris yap metodu yazalim==> kullanici adi ve sifre istesin, buna gore giris basarili veya
 * giris basarisiz sonucu versin
 * 
 *
 */
public class Uygulama {

	Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		Kullanici[] dizi = Database.kullaniciListesi;
		Database.veriTabaniBaslangicDegerleri();
		for (Kullanici kullanici : dizi) {
			if (kullanici != null) {
				System.out.println(kullanici.getIsim());
			}

		}

	}

	public void anaMenu() {
		System.out.println("1-Kayıt Ol");
		System.out.println("2-Giriş Yap");
		System.out.println("3-Kullanıcıları göster");
		System.out.println("4-Çıkış");
	}

	public int secimYap() {
		System.out.println("Seciminizi giriniz");
		String secim = input.nextLine(); // next int ile hic ugrasmayalim hata olmasin diye yaptik

		return Integer.parseInt(secim);
	}

	public void UygulamaBaslat() {
		int kontrol = 0;
		do {
			anaMenu();
			kontrol = secimYap();

			switch (kontrol) {
			case 1:
				System.out.println("========Kayit ol==========");
				kayitOl();
				break;
			case 2:
				System.out.println("========Giris yap==========");
				girisYap();
				break;
			case 3:

				kulanicilariGoster();
				break;
			case 4:
				System.out.println("Basariyla cikis yapildi");

				break;

			default:
				System.out.println("Hatali bir tuslama yaptiniz");
				break;
			}

		} while (kontrol != 4);

	}

	public void kulanicilariGoster() {
		System.out.println("Kullanici listesi");
		for (Kullanici kullanici : Database.kullaniciListesi) {
			if (kullanici != null) {
				System.out.println(kullanici.getIsim() + "-->" + kullanici.getUsername());
			}
		}
	}

	public void kayitOl() {
		System.out.println("Lutfen isminizi giriniz");
		String isim = input.nextLine();
		System.out.println("Lutfen email giriniz");
		String mail = input.nextLine();
		System.out.println("Lutfen sifrenizi giriniz");
		String sifre = input.nextLine();
		System.out.println("Lutfen Kullanici Adinizi giriniz");
		String username = input.nextLine();

		Kullanici kullanici = new Kullanici(Database.index + 1, isim, mail, sifre, username);

		Database.kullaniciEkle(kullanici);
		
	}

	public void girisYap() {

		
		System.out.println("Kullanici adinizi giriniz");
		String kullaniciAdi = input.nextLine();
		System.out.println("Sifrenizi giriniz");
		String sifre = input.nextLine();
		boolean kontrol =Database.kullaniciVarMi(kullaniciAdi, sifre);
		
		if (kontrol) {
			System.out.println("Basari ile giris yapildi");
		} else {
			System.out.println("Giris basarisiz");
		}
		
	}

}
