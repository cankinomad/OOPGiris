package com.berkOs.Hafta07.Groupiongby;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class OgrenciManager {

	List<Ogrenci> ogrenciler;

	public OgrenciManager() {
		ogrenciler = new ArrayList<>();
	}

	public void baslangicVerisi() {
		ogrenciler = new ArrayList<>();
		Ogrenci Ogrenci1 = new Ogrenci(1, "Mustafa", "mat");
		Ogrenci1.getNotlar().add(50D);
		Ogrenci1.getNotlar().add(50.0);
		Ogrenci1.getNotlar().add(50D);
		Ogrenci Ogrenci2 = new Ogrenci(2, "Ayşe", "tm");
		Ogrenci2.getNotlar().add(80D);
		Ogrenci2.getNotlar().add(55D);
		Ogrenci2.getNotlar().add(79.5);
		Ogrenci Ogrenci3 = new Ogrenci(3, "Hakan", "tm");
		Ogrenci3.getNotlar().add(86D);
		Ogrenci3.getNotlar().add(97.5);
		Ogrenci3.getNotlar().add(50.5);
		Ogrenci Ogrenci4 = new Ogrenci(4, "Mert", "mat");
		Ogrenci4.getNotlar().add(80D);
		Ogrenci4.getNotlar().add(30D);
		Ogrenci4.getNotlar().add(82.5);
		Ogrenci Ogrenci5 = new Ogrenci(5, "Gamze", "mat");
		Ogrenci5.getNotlar().add(10D);
		Ogrenci5.getNotlar().add(35.7);
		Ogrenci5.getNotlar().add(58.3);
		Ogrenci Ogrenci6 = new Ogrenci(6, "Merve", "tm");
		Ogrenci6.getNotlar().add(36D);
		Ogrenci6.getNotlar().add(23.5D);
		Ogrenci6.getNotlar().add(57.5);
		ogrenciler = List.of(Ogrenci1, Ogrenci2, Ogrenci3, Ogrenci4, Ogrenci5, Ogrenci6);
	}

	public static void main(String[] args) {
		// ogrencileri bolume gore mapleyelim
		OgrenciManager ogrenci = new OgrenciManager();
		ogrenci.baslangicVerisi();
		//ogrenci bolume gore mapleyeleim	
		Map<String, List<Ogrenci>> ogrenciMap = ogrenci.ogrenciler.stream()
				.collect(Collectors.groupingBy(Ogrenci::getBolum));
		//2. yontem
		Map<String, List<Ogrenci>> ogrenciMap2 = ogrenci.ogrenciler.stream()
				.collect(Collectors.groupingBy(o->o.getBolum()));
		
		ogrenciMap.entrySet().forEach(System.out::println);
		
		
		//butun ogrencilerin not ortalamasini bulalim
		
		Double ort=ogrenci.ogrenciler.stream().collect(Collectors.averagingDouble(o->o.getNotlar().stream().collect(Collectors.averagingDouble(x->x)))); //getnotlar double bir list o yuzden onu da stream e ceviriyoruz
		
		System.out.println(ort);
		
		Double ort2=ogrenci.ogrenciler.stream().collect(Collectors.averagingDouble(Ogrenci::notOrtHEsapla));
		Double ort3=ogrenci.ogrenciler.stream().collect(Collectors.averagingDouble(o->o.notOrtHEsapla()));
		System.out.println(ort2);
		System.out.println(ort3);
		
		//ogrenci ismine karsilik not ortalamasi olan bir map yapisi yapalim
		
		Map<String, Double> ogrenciNotlari=ogrenci.ogrenciler.stream().collect(Collectors.groupingBy(Ogrenci::getIsim,Collectors.averagingDouble(Ogrenci::notOrtHEsapla)));
		Map<String, Double> ogrenciNotlari2=ogrenci.ogrenciler.stream().collect(Collectors.groupingBy(Ogrenci::getIsim,Collectors.averagingDouble(o->o.getNotlar().stream().collect(Collectors.averagingDouble(x->x)))));
		
		Map<String, Double> ogrenciNotlari3=ogrenci.ogrenciler.stream().collect(Collectors.toMap(Ogrenci::getIsim, Ogrenci::notOrtHEsapla));	//3. yontem
		
		ogrenciNotlari.entrySet().forEach(System.out::println);
		
		//not ortalamasi 50'den kucuk olanlarin durumu kaldi, buyuk olanlarinki gecti olarak guncellensin
		
		//1. yol
		ogrenci.ogrenciler.stream().forEach(o->{
			if(o.notOrtHEsapla()>50) {
				o.setDurum("Gecti");
			}else {
				o.setDurum("Kaldi");
			}});
			
		//2.yol
		ogrenci.ogrenciler.stream().filter(x->x.notOrtHEsapla()>50).forEach(y->y.setDurum("Gecti"));
		ogrenci.ogrenciler.stream().filter(x->x.notOrtHEsapla()<=50).forEach(y->y.setDurum("Kaldi"));
		
			Map<String, String> durumlistesi=ogrenci.ogrenciler.stream().collect(Collectors.toMap(Ogrenci::getIsim, Ogrenci::getDurum));
			
			durumlistesi.entrySet().forEach(System.out::println);
			
			//her bir ogrenciye bir tane de sozlu notu ekleyelim. yani 4. notu ekleyelim
			ogrenci.ogrenciler.stream().forEach(o->{
				Random random=new Random();
				double not=random.nextDouble(50,101);
				
			o.getNotlar().add(not);});
		
			System.out.println(ogrenci.ogrenciler);
			
			//herbir ogrencinin her notuna +5 puan ekleyeleim
			ogrenci.ogrenciler.stream().forEach(o->{
				List<Double> list=new ArrayList<>();
				for (int i = 0; i < o.getNotlar().size(); i++) {
					if(o.getNotlar().get(i)<96) {
						list.add(o.getNotlar().get(i)+5);
					}else {
						list.add(100.0);		
					}
					o.setNotlar(list);
				}
			});
			
			//ogrenci.ogrenciler.forEach(o->o.setNotlar(o.getNotlar().stream().map(x->x+5.0).collect(Collectors.toList())));
			
		System.out.println(ogrenci.ogrenciler);
	}

}
