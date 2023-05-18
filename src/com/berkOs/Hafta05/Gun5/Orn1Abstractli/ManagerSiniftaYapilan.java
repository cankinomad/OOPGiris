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
public class ManagerSiniftaYapilan {
	
//	Mysql mysql;
//	Oracle oracle;
	Database database;		// tek tek mysql yazacagina git onlarin ana sinifini yaz ve ordan olustur basitce
	
	

	public ManagerSiniftaYapilan(Database database) {
	super();
	this.database = database;
}

	public void menu() {
		System.out.println("1-Veri ekle");
		System.out.println("2-Veri sil");
		System.out.println("3-Veri Guncelle");
		System.out.println("4-Verileri Getir");
	}

	public void calistir() {
		Scanner input = new Scanner(System.in);

		int secim;
		database.login();
		do {
			
			menu();
			System.out.println("Lutfen bir secim yapiniz");
			secim = Integer.parseInt(input.nextLine());

			switch (secim) {
			case 1:		
				database.ekle();
				break;
			case 2:
				database.sil();
				break;
			case 3:
				database.guncelle();
				break;
			case 4:
				database.verileriGetir();
				break;
			case 0:
				System.out.println("Sistemden cikiliyor....");
				break;

			default:
				break;
			}

		} while (secim != 0);
	}
}
