package com.berkOs.Hafta07.Gun2;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * bolme metodu olsuturalim
 * 2 tane sayi alalim
 * ve bu islemde bir hata varsa yakalayip hata mesajini yazdiralim
 * 
 * 
 * metodumuz bizden dogru sonuc alana kadar calissin
 * yani bir dongu kuracagiz ve bu dongu bizden 2. degeri 0 aldikca tekrar calisacak
 */
public class TryCatchOrnek {
	public static void main(String[] args) {
		
		System.out.println(bolme());
		
		
	}
	
	public static double bolme() {
		Scanner input=new Scanner(System.in);
		boolean kontrol=false;
		double sonuc;
		do {
			kontrol=false;
			sonuc = 0;
			try {
				System.out.println("Lutfen 1. sayiyi giriniz");
				int sayi1 = input.nextInt();
				System.out.println("Lutfen 2. sayiyi giriniz");
				int sayi2 = input.nextInt(); 
				sonuc = sayi1 / sayi2;
			} catch (ArithmeticException e) {
				System.out.println("2. sayiyi sifir giridniz=" + e.getMessage());
				System.out.println("Lutfen tekrar deneyiniz");
				e.printStackTrace();
				kontrol=true;
			} catch (InputMismatchException e) {
				System.out.println("Lutfen sadece sayi giriniz" + e.getMessage());
				kontrol=true;
			} catch (Exception e) {
				System.out.println("Bir hata olustu" + e.getMessage());
				kontrol=true;
			} 
			finally {
				input.nextLine();
			}
		} while (kontrol);
		return sonuc;
	}
}
