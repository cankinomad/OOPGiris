package com.berkOs.Hafta05.Gun5.Orn1Abstractli;

import java.util.Scanner;

/*
 * database secim metodu olsun
 * sectigimiz database e gore databasedeki login metodunu ve
 * manager sinifindan calisatir metodunu calistirsin.
 * 
 * 1-Mysql
 * 2-Oracle
 * 
 * kullanicidan database secmesini isteyecegiz. Bu sayede sectigimiz database e gore metotlar calisacak
 * 
 */
public class Main {
	public static void main(String[] args) {

		// Mysql mysql=new Mysql(); boyle cagirip mysql i parametre olarak alabilirsin
		// eger mysq. uzerinden metod cekeceksen boyle yapabilrisin. veya
		// assagidaki gibi direk newlersen parantez icinde artik newlenmis bi mysql
		// gelir ve nullpoint hatasi almazsin enayi olma.
//		ManagerSiniftaYapilan manager = new ManagerSiniftaYapilan(new Mysql());
//
//		ManagerSiniftaYapilan managerOracle = new ManagerSiniftaYapilan(new Oracle());
//
//		managerOracle.calistir();
//		manager.calistir();

		//secim();
		dataSec();
	}

	public static void secim() {
		Scanner input = new Scanner(System.in);
		System.out.println("Lufen hangi uygulamanin database'i uzerinde islem yapmak istediginizi seciniz");
		int secim;
		do {

			databaseMenu();
			secim = Integer.parseInt(input.nextLine());

			if (secim == 1) {
				ManagerSiniftaYapilan mysql = new ManagerSiniftaYapilan(new Mysql());
				mysql.calistir();

			} else if (secim == 2) {
				ManagerSiniftaYapilan oracle = new ManagerSiniftaYapilan(new Oracle());
				oracle.calistir();
			} else {
				System.out.println("Yanlis bir tuslama yaptiniz");
			}
		} while (secim != 1 && secim != 2);

	}

	public static void databaseMenu() {
		System.out.println("1-Mysql" + "\n2-Oracle");
	}

	public static void dataSec() {

		ManagerSiniftaYapilan manager;
		Database database = null;

		System.out.println("Lutfen database seciniz");
		Scanner input = new Scanner(System.in);
		databaseMenu();
		int sonuc = input.nextInt();
		input.nextLine();

		switch (sonuc) {
		case 1:
			database = new Mysql();
			break;
		case 2:
			database = new Oracle();
			break;

		default:
			break;
		}
		
		
		manager=new ManagerSiniftaYapilan(database);
		manager.calistir();
	}
}
