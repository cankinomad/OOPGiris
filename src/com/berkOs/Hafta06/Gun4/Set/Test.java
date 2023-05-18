package com.berkOs.Hafta06.Gun4.Set;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test {
	Set<Kullanici> kullanicilar;
	Set<String> kullaniciIsimleri;
	

	public Test() {
		this.kullanicilar=new LinkedHashSet<>();
		this.kullaniciIsimleri=new TreeSet<>();
		kullanicilar.add(new Kullanici("yk1","yk1@gmail.com","123"));
		kullanicilar.add(new Kullanici("yk1","yk1@gmail.com","123"));
		kullanicilar.add(new Kullanici("yk1","yk1@gmail.com","123"));
		kullanicilar.add(new Kullanici("yk1","yk1@gmail.com","123"));
		kullaniciIsimleri.add("yk1");
		kullaniciIsimleri.add("yk2");
		kullaniciIsimleri.add("yk3");
		kullaniciIsimleri.add("yk4");
	}
	
	public void kullaniciEkle() {
		Scanner input=new Scanner(System.in);
		System.out.println("Lutfen bir kullanici adi giriniz");
		String kullaniciAdi=input.nextLine();
		
		
//		for (Kullanici kullanici : kullanicilar) {
//			if(kullaniciAdi.equals(kullanici.isim)) {
//				System.out.println("Daha once bu kullanici adi kullanilmistir");
//				kontrol=false;
//				break;
//			}
		while(!kullaniciIsimleri.add(kullaniciAdi)) {
			System.out.println("Kullanici adi daha once eklenmistir");
			System.out.println("Lutfen bir kullanici adi giriniz");
			kullaniciAdi=input.nextLine();
		}
		System.out.println("Lutfen bir email  giriniz");
		String email=input.nextLine();
		System.out.println("Lutfen bir sifre  giriniz");
		String sifre=input.nextLine();
			kullanicilar.add(new Kullanici(kullaniciAdi, email, sifre));
		
		
	}
	
	public void kullaniciEkle2() {
		Kullanici kullanici=new Kullanici("yk7","yk1@gmail.com","123");
		Kullanici kullanici2=kullanici;
		Kullanici kullanici3=new Kullanici("yk12","yk1@gmail.com","123");
		kullanicilar.add(kullanici);
		kullanicilar.add(kullanici2);
		kullanicilar.add(kullanici3);
	}
	
	public static void main(String[] args) {
		Test kullaniciTest=new Test();
		kullaniciTest.kullaniciEkle2();
		kullaniciTest.kullanicilar.forEach(System.out::println);
	}
	
}
