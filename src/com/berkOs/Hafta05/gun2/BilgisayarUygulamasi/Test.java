package com.berkOs.Hafta05.gun2.BilgisayarUygulamasi;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		Ram ram=new Ram(16, 3200);
		HardDisk hardDisk=new HardDisk(512, 3000, 3000);
		islemci islemci=new islemci(4, 3, "7.Nesil");

		
		ArrayList<DahiliDonanim> dahiliDonanimlar=new ArrayList<>();
		dahiliDonanimlar.add(islemci);
		dahiliDonanimlar.add(hardDisk);
		dahiliDonanimlar.add(ram);
		Anakart anakart=new Anakart(0, dahiliDonanimlar);
		
		ArrayList<HariciDonanim> haricidonanimlar=new ArrayList<>();
		Mouse mouse=new Mouse(0);
		Klavye klavye=new Klavye("mekanik", "q");
		
		haricidonanimlar.add(klavye);
		haricidonanimlar.add(mouse);
		
		Laptop laptop=new Laptop("1", "Monster", anakart, haricidonanimlar, "", "", 60);
		
		System.out.println(laptop);
	}
}
