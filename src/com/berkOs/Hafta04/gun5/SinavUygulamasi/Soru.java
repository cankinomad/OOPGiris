package com.berkOs.Hafta04.gun5.SinavUygulamasi;

import java.util.Arrays;
import java.util.Scanner;

public class Soru {
	Scanner input = new Scanner(System.in);

	public int puan;
	public String icerik;
	public String dogruCevabi; // A,B,C,D
	public String[] cevapIcerikleri = new String[4];; // a)====>Tutkiye'nion baskenti Ankara'dir.

	public Soru() {
		System.out.println("Kac puanlik soru?");
		this.puan = input.nextInt();input.nextLine();
		System.out.println("Soru icerigi?");
		this.icerik = input.nextLine();
		this.cevapIcerikleri = new String[4];
		System.out.println("1. sikki giriniz");
		cevapIcerikleri[0] = "A-" + input.nextLine();
		System.out.println("2. cevabi giriniz");
		cevapIcerikleri[1] = "B-" + input.nextLine();
		System.out.println("3. cevabi giriniz");
		cevapIcerikleri[2] = "C-" + input.nextLine();
		System.out.println("4. cevabi giriniz");
		cevapIcerikleri[3] = "D-" + input.nextLine();
		System.out.println("Dogru cevabi giriniz");
		this.dogruCevabi = input.next();
//		switch (dogruCevabi) {
//		case "A":
//			dogruCevabi=cevapIcerikleri[0];
//			break;
//		case "B":
//			dogruCevabi=cevapIcerikleri[1];
//			break;
//		case "C":
//				dogruCevabi=cevapIcerikleri[2];
//			break;
//		case "D":
//			dogruCevabi=cevapIcerikleri[3];
//			break;
//
//		default:
//			System.out.println("Yanlis bir harf sectiniz");
//			break;
//		}
	}

	public Soru(int puan, String icerik, String dogruCevabi, String[] cevapIcerikleri) {
		super();
		this.puan = puan;

		this.icerik = icerik;
		this.dogruCevabi = dogruCevabi;
		this.cevapIcerikleri = cevapIcerikleri;
	}
	/*
	 * sorulari da olusturmak gerekecek. bu soru olusturma isini soru sinifinda bir
	 * metoda devredelim Soru sinifinda bir soru olusturma metodu yazalim.
	 * soruOlustur()==> disaridan soru ile ilgili verileri alacak
	 * icerik,puan,cevapicerikleri gibi ve iceride cevap iceriklerini de
	 * kullanicidan alacagiz.
	 * 
	 */

	public void soruOlustur() {
		Soru soru = new Soru();

	}

	@Override
	public String toString() {
		return "Soru [puan=" + puan + ", icerik=" + icerik + ", dogruCevabi=" + dogruCevabi + ", cevapIcerikleri="
				+ Arrays.toString(cevapIcerikleri) + "]";
	}

}
