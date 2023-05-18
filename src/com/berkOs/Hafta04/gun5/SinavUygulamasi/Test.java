package com.berkOs.Hafta04.gun5.SinavUygulamasi;

import java.util.Scanner;

/*
 * Sinav sinifimiz olacak ve bu sinifi soyutlayacagiz
 * ve bir de sorularimiz olacak
 * bu sorularimiz test turunde oldugu icin coktan secmeli
 * cevaplari olsun ve bu cevaplarin siklarini tutalim
 * 
 * 
 */
public class Test {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		
		int secim;
		Sinav sinav1 = null;
		int sayac=0;
		int puan=0;
		do {
			anaMenu();
			secim();

			System.out.println("Secim giriniz");
			secim = input.nextInt();
			input.nextLine();
			switch (secim) {
			case 1:
				sinav1 = new Sinav();

				break;
			case 2:

				for (int i = 0; i < sinav1.sorular.length; i++) {
					Soru soru = new Soru();
					sinav1.sorular[i] = soru;
				}

				break;
			case 3:
				for (int i = 0; i < sinav1.sorular.length; i++) {
					System.out.println(sinav1.sorular[i].toString());
				}

				break;
			case 4:
				sayac=0;
				puan=0;
				for (int i = 0; i < sinav1.sorular.length; i++) {
					System.out.println(sinav1.sorular[i].icerik);
					for (int j = 0; j < sinav1.sorular[i].cevapIcerikleri.length; j++) {
						System.out.println(sinav1.sorular[i].cevapIcerikleri[j]);
					}
					System.out.println(i+1+". Sorunun cevabini giriniz");
					String cevap=input.nextLine();
					String dogruCevap=String.valueOf(cevap.charAt(0));
					if(dogruCevap.equalsIgnoreCase(sinav1.sorular[i].dogruCevabi)) {
						puan+=sinav1.sorular[i].puan;
						sayac++;
					}
				}
				

				break;
			case 5:
				System.out.println("Dogru Cevap Sayisi: "+sayac);
				System.out.println("Toplam puan: "+puan);
				
				break;
				

			case 0:

				System.out.println("Cikis yapildi");
				break;

			default:
				System.out.println("Yanlis bir tuslama yaptiniz, tekrar deneyiniz");
				break;
			}

		} while (secim != 0);
		
		
		
	}
	public  static void anaMenu() {
		System.out.println("===============");
		System.out.println("Sinav Uygulamasi");
		System.out.println("================");
	}
	public static void secim() {
		System.out.println("1-Sinav olustur");
		System.out.println("2-Sorulari gir");
		System.out.println("3-Sorulari goruntule");
		System.out.println("4-Sorulari cevapla");
		System.out.println("5-Sinav Sonucu");
		System.out.println("0-Cikis yap");
		
	}

}
