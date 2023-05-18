package com.berkOs.Hafta07.Gun2;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			try {
				degerYazdir(input.nextInt());			//try catch ile yazdirmaya zorlarsan hatayi alirsin ama proigram devam eder
			} catch (EksiDegerException e) {
				System.out.println(e.getLocalizedMessage());
			}
		}
	}
	
	public static void degerYazdir(int deger) throws EksiDegerException   {  //throws yapmazsan try catch zorlamadigi icin kullanici alip yazar gecer. ///Exceptiondan miras alirsna throw atmak zorundasin,
	 if (deger<0) {
		throw new EksiDegerException("Eksi deger girilemez");		//runtime exception yazarsan throw atmana gerek yok.
	}
	 System.out.println(deger);
	}
}
