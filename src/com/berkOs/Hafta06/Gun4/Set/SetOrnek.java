package com.berkOs.Hafta06.Gun4.Set;
/*
 * film kategorisi ekle diye bir metodumuz olsun
 * String olarak aldigi bir kategoriyi bir sete eklesin
 * eger daha once eklenmisse bu kategori daha once eklenmistir diye cikti versin
 * 
 */

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetOrnek {
	Set<String> filmKategorileri=new TreeSet<>(); //treeset yaparsan otomatik siralar


	public static void main(String[] args) {
		
		SetOrnek orn=new SetOrnek();
		
//		orn.filmKategorisiEkle();
//		orn.filmKategorisiEkle();
//		System.out.println(orn.filmKategorileri);
//		orn.filmKategorisiEkle();
//		orn.filmKategorileri.forEach(System.out::println);
		
		orn.filmKategorisiEkle2();
		orn.filmKategorisiEkle2();
		
	}
	public void filmKategorisiEkle() {
		Scanner input=new Scanner(System.in);
		System.out.println("Lutfen eklemek istediginiz kategoriyi yaziniz");
		String kategori=input.nextLine();
		if(filmKategorileri.contains(kategori)) {
			System.out.println("Daha onceden eklenmistir");
		}else {
			filmKategorileri.add(kategori);
			System.out.println(kategori+" Kategorisi Basariyla eklenmistir");
		}
	}
	public void filmKategorisiEkle2() {
		Scanner input=new Scanner(System.in);
		System.out.println("Lutfen eklemek istediginiz kategoriyi yaziniz");
		String kategori=input.nextLine();
		if(filmKategorileri.add(kategori)) {
			System.out.println(kategori+" Kategorisi Basariyla eklenmistir");
		}else {
			System.out.println("Daha onceden eklenmistir");
		}
	}
	
}
