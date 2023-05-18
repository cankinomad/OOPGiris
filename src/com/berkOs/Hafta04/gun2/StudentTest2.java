package com.berkOs.Hafta04.gun2;

import java.util.Scanner;

public class StudentTest2 {
	/*
	 * Bir metod yazalim, bize bir ogrenci ismi alip donsun(static olabilir)

	 * main metodda boyutu 5 olan bir ogrenci arrayi yaratalim 
	 *
	 * ve bir for dongusu ile bu arrayi dolduralim
	 * 
	 * en sonunda da  arrayi yazdiralim
	 */

	public static void main(String[] args) {
		Student [] ogrenciler=new Student [5];
//		ogrenciler[0].ad="doruk";			//boyle null hatasi aliyoruz yeni bir nesne olusturman lazim her ogrenci icin.
//		ogrenciler[1].ad="doruk2";
		
		System.out.println();
		
		for (int i = 0; i < ogrenciler.length; i++) {
			Student student=new Student();//her yeni ogrenci icin yeni bi nesne olusturmalisin ki bilgileri tutabilesin
			student.ad=isimAl();//isimal string bir ifade senin bunu student a cevirmen lazim
			student.kayit();
			ogrenciler[i]=student;//o yuzden isimal i student ad a esitliyorsun ve student tipinde degisken yapiyorsun
			
			
		}
		for (Student i : ogrenciler) {
			i.bilgileriGoster();
		}
		
		for (int i = 0; i < ogrenciler.length; i++) {//2. yontem gosterim
			ogrenciler[i].bilgileriGoster();
		}
		
	}
	
	public static String isimAl() {
		System.out.println("Bir isim giriniz");
		Scanner input=new Scanner(System.in);
		String isim=input.nextLine();
		return isim;
	}

}
