package com.berkOs.Hafta06.Gun5.SehirOrnek;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

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
	
	public Uygulama() {
		sehirleriOlustur();
	}
	public static void main(String[] args) {
		Uygulama uygulama=new Uygulama();
		//uygulama.sehirler.forEach(System.out::println);
	//nufusu 1 milyondan az olan sehirleri getiren stream yapisi	====================================
		
		uygulama.sehirler.stream().filter(x->x.getNufus()<10000000).forEach(System.out::println);
		
		//Plaka kodlarini integer bir listede tutalim====================================
		List<Integer> plaka=uygulama.sehirler.stream().map(x->Integer.parseInt(x.getPlakaKodu())).collect(Collectors.toList());
		plaka.stream().forEach(System.out::println);
		//Bolgelere gore sehirleri mapleyelim ===========================================
		//1.bolge ankra,bolu
		Map<String, List<Sehir>> map=uygulama.sehirler.stream().collect(Collectors.groupingBy(Sehir::getBolge));
		//Map<String, List<Sehir>> map2=uygulama.sehirler.stream().collect(Collectors.groupingBy(x->x.getBolge()));
		
//		map.entrySet().stream().forEach(System.out::println);//mapleri yazdirmak icin gir once entrySet yap
//		map.forEach((k,v)->System.out.println(k+"--"+v));
		
		//Sehrin plaka koduna karsilik sehrin ismi gelsin
		Map<Integer, String> map2=uygulama.sehirler.stream().collect(Collectors.toMap(x-> Integer.parseInt(x.getPlakaKodu()), c->c.getIsim()));
		Map<Integer, String> map3=uygulama.sehirler.stream().collect(Collectors.toMap(x-> Integer.parseInt(x.getPlakaKodu()), Sehir::getIsim));
		
		map3.entrySet().stream().forEach(System.out::println);
		
		
		
		//Mainnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn
	}
	
	public void sehirleriOlustur() {
		Random random=new Random();
		
		for (int i = 0; i < SehirDatabase.iller.length; i++) {
			
			String sehirIsim=SehirDatabase.iller[i];
			Sehir sehir=new Sehir(sehirIsim,i);
			sehir.setBolge(random.nextInt(1,4)+".bolge");
			//sehir.setPlakaKodu(sehir.plakaKoduUret(i));
			sehirler.add(sehir);	
		}
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
