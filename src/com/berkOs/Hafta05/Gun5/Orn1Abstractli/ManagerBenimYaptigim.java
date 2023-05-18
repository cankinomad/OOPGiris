package com.berkOs.Hafta05.Gun5.Orn1Abstractli;

import java.util.Scanner;

/*
 * bir menumuz olacak.
 * 1-Veri ekle
 * 2-Veri sil
 * 3-Veri Guncelle
 * 4-Verileri Getir
 * 
 * daha soinra bir calistir metodumuz olacak olacak bu metotta menuden secim yapaacagiz bu secime gore database'den bir metot calisacak
 */
public class ManagerBenimYaptigim {
	public static void main(String[] args) {
		ManagerBenimYaptigim manager=new ManagerBenimYaptigim();
		manager.calistir();
		
	}

	public void menu() {
		System.out.println("1-Veri ekle");
		System.out.println("2-Veri sil");
		System.out.println("3-Veri Guncelle");
		System.out.println("4-Verileri Getir");
		System.out.println("5-Cikis yap");

	}

	public int secim() {
		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen yapmak istediginiz islemi rakamla giriniz");
		String secim = input.nextLine();
		return Integer.parseInt(secim);

	}

	public void calistir() {
		int secim = 0;
		Database mysqlDatabase=new Mysql();
		Database oracleDatabase=new Oracle();
		int uygulamaSecim=0;
		Scanner input =new Scanner(System.in);
		do {
			menu();
			secim = secim();
			switch (secim) {
			case 1:	
				System.out.println("Hangi uygulamaya eklemek istyorsunuz");
				System.out.println("1-mySql, 2-Oracle");
				uygulamaSecim=Integer.parseInt(input.nextLine());
				if(uygulamaSecim==1) {
					mysqlDatabase.ekle();
				}else if(uygulamaSecim==2) {
					oracleDatabase.ekle();
				}else {
					System.out.println("Yanlis bir tuslama yaptiniz lutfen tekrar deneyiniz");
				}
				
				break;
			case 2:
				System.out.println("Hangi uygulamadan veri silmek istyorsunuz");
				System.out.println("1-mySql, 2-Oracle");
				uygulamaSecim=Integer.parseInt(input.nextLine());				
				if(uygulamaSecim==1) {
					mysqlDatabase.sil();
				}else if(uygulamaSecim==2) {
					oracleDatabase.sil();
				}else {
					System.out.println("Yanlis bir tuslama yaptiniz lutfen tekrar deneyiniz");
				}

				break;
			case 3:
				System.out.println("Hangi uygulamada veri guncellemek istiyorsunuz");
				System.out.println("1-mySql, 2-Oracle");
				uygulamaSecim=Integer.parseInt(input.nextLine());	
				if(uygulamaSecim==1) {
					mysqlDatabase.guncelle();
				}else if(uygulamaSecim==2) {
					oracleDatabase.guncelle();
				}else {
					System.out.println("Yanlis bir tuslama yaptiniz lutfen tekrar deneyiniz");
				}

				break;
			case 4:
				System.out.println("Hangi uygulamanin verilerini getirelim");
				System.out.println("1-mySql, 2-Oracle");
				uygulamaSecim=Integer.parseInt(input.nextLine());	
				if(uygulamaSecim==1) {
					mysqlDatabase.verileriGetir();
				}else if(uygulamaSecim==2) {
					oracleDatabase.verileriGetir();
				}else {
					System.out.println("Yanlis bir tuslama yaptiniz lutfen tekrar deneyiniz");
				}

				break;
			case 5:
					System.out.println("Cikis yapiliyor...");
				break;

			default:
				System.out.println("Yanlis bir secim yaptiniz");
				break;
			}

		} while (secim != 5);

	}

}
