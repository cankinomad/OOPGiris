package com.berkOs.Hafta06.Gun2.Sehirler;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/*
 * 1-Sehir sinifimiz olacak===> isim plaka Kodu nufus
 * 
 * uygulama sinifinda sehirleri olustur diye bir metodumuz olsun. bu metod iller arayindaki
 * sehirleri alarak herbirinden birer sehir nesnesi yaratalim ve bunlari bir listeye ekleyelim.
 * 
 * ornek====> sehir sinifinda bir metot olsun plaka kodlarini bizim icin olustursun.
 * 
 * 2-Disaridan girilen harflerle baslayan illeri donduren bir metod yazalim
 * 
 *	3- Nufusa gore siralama
 *
 *	4- isme gore bir siralama yapalim
 *
 *	5- Listemin son 10 degerini isme gore siralasin
 * 
 * 	6-plakaya gore sirala
 */
public class Uygulama {
	ArrayList<Sehir> sehirler=new ArrayList<>();
	
	public static void main(String[] args) {
		Uygulama uygulama=new Uygulama();
		uygulama.sehirleriOlustur();
//		
//		for (Sehir sehir : uygulama.sehirler) {
//			System.out.println(sehir);	
//		}
//		for (Sehir string : uygulama.sehirBul2()) {
//			System.out.println(string);
//		}
//		Collections.sort(uygulama.sehirler);
//		
//		System.out.println(uygulama.sehirler);
		System.out.println("==================================================");
		
		
		System.out.println("Sehir siralamasi isme gore=======================");
		
		
		
		
//		uygulama.ismeGoreSirala(uygulama.sehirler);
//		
//		for (Sehir sehir : uygulama.sehirler) {
//		System.out.println(sehir);	
//		}
		
		List<Sehir>yeniSehirListesi=uygulama.ismeGoreSirala(uygulama.sehirler.subList(uygulama.sehirler.size()-10, uygulama.sehirler.size()));
		uygulama.ismeGoreSirala(yeniSehirListesi);
		
		for (Sehir sehir : yeniSehirListesi) {
			System.out.println(sehir);
		}
		
		Collections.shuffle(uygulama.sehirler);
		for (Sehir sehir : uygulama.sehirler) {
			System.out.println(sehir);
		}
		
		System.out.println("================Plaka Koduna gore siraladiktan sonra=========");
		
		Collections.sort(uygulama.sehirler);
		for (Sehir sehir : uygulama.sehirler) {
		System.out.println(sehir);	
		}
		
		
		
		
		
		
		
		//Mainnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn
	}
	
	public void sehirleriOlustur() {
		
		for (int i = 0; i < SehirDatabase.iller.length; i++) {
			
			String sehirIsim=SehirDatabase.iller[i];
			Sehir sehir=new Sehir(sehirIsim,i);
			//sehir.setPlakaKodu(sehir.plakaKoduUret(i));
			sehirler.add(sehir);	
		}
		System.out.println(sehirler);
	}
	public void sehirBul() {
		System.out.println("Bulmak istediginiz sehrin bas harfini giriniz");
		Scanner input=new Scanner(System.in);
		String harf=input.nextLine();
		char ch=harf.charAt(0);
		
		for (int i = 0; i < sehirler.size(); i++) {
			if(sehirler.get(i).getIsim().charAt(0)==ch) {
		System.out.println(sehirler.get(i).getIsim());
			}
		}
	}
	public ArrayList<Sehir> sehirBul2() {
		ArrayList<Sehir>sehirListesi=new ArrayList<>();
		System.out.println("Bulmak istediginiz sehrin bas harfini giriniz");
		Scanner input=new Scanner(System.in);
		String harf=input.nextLine().toUpperCase();
		
		
		for (int i = 0; i < sehirler.size(); i++) {
			if(sehirler.get(i).getIsim().startsWith(harf.charAt(0)+"")) {
			sehirListesi.add(sehirler.get(i));
			}
		}
		return sehirListesi;
	}
	
	public ArrayList<Sehir> nufusSirala(ArrayList<Sehir> liste){
		
		Comparator<Sehir> comparator=new Comparator<Sehir>() {

			@Override
			public int compare(Sehir o1, Sehir o2) {
				
				return o1.getNufus()-o2.getNufus();
			}
		};
		Collections.sort(liste, comparator);
		return liste;
	}
	public List<Sehir> ismeGoreSirala(List<Sehir> liste){
		Collator collactor=Collator.getInstance(); //Turkce karakter sorununu cozmek icin siralamada ekeleyebilrisin
		Comparator<Sehir> comparator=new Comparator<Sehir>() {
			@Override
			public int compare(Sehir o1, Sehir o2) {

				return collactor.compare(o1.getIsim(),o2.getIsim());
			}
		};
		Collections.sort(liste,comparator);
		return liste;
	}
}
