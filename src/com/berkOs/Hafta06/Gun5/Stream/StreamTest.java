package com.berkOs.Hafta06.Gun5.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest {
	// sTream yapisi collection yapisinda calisir
	public static void main(String[] args) {
		List<String> aylar = new ArrayList<>(List.of("Ocak", "Subat", "Mart", "Nisan", "Mayis", "HAziran", "Temmuz",
				"Agustos", "Eylul", "Ekim", "Kasim", "Aralik"));

		List<Integer> sayilar = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12));
		// foreach=========================================================
		aylar.stream().forEach(l -> System.out.println(l.toLowerCase()));

		aylar.stream().forEach(x -> {
			x = x.substring(0, 3);
			x = "-" + x;
			System.out.println(x);
		});
		// map: mutlaka bir deger dondurur.============================================
		System.out.println("********************************");
		aylar.stream().map(x -> x.toLowerCase()).forEach(System.out::println);
		aylar.stream().map(x -> { // map her zaman return bekler.
			x = x.substring(0, 3);
			x = "-" + x;
			return x;
		}).forEach(System.out::println);

		List<String> liste = aylar.stream().map(x -> {
			x = x.substring(0, 3);
			x = "-" + x;
			return x;
		}).collect(Collectors.toList()); // toSet de yapabilirsin=================================================================
		System.out.println("====List===");
		liste.forEach(System.out::println);

		
		List<String> liste3=sayilar.stream().map(x->"-"+x).collect(Collectors.toList());	//map sayesinde collection yapisinda gezip istedigimizi digerine aktarabiliyoruz
		
		liste3.forEach(System.out::println);
		
		// filter==================================================
		aylar.stream().filter(x->x.startsWith("A")).forEach(System.out::println);
		
		List<String> liste4=aylar.stream().filter(x->x.startsWith("M")).collect(Collectors.toList());
		
		liste4.forEach(System.out::println); //filtrede belirttigin sinirlardaki elemani cekip liste icine atabilirisn.
		
		List<String> liste5=aylar.stream().filter(x->{		// filterin acilmis hali budur. burasi eger kosullari sagliyorsa gider listeye ekler.
			if(x.startsWith("M")) {
				return true;
			}else {
				return false;
			}
			
		}).collect(Collectors.toList());
		
		List<Integer> liste6=sayilar.stream().filter(x-> x>5).collect(Collectors.toList());	//filtre ile gidip integer bi listeyi string yapamazsin cunku filter return olarak true ya
		liste6.forEach(System.out::println);
		//da false donuyor. ama map return olarak aldigi eleman uzerinde oynama yapip dondurebiliyor. basitce "" yaparsan int stringe cevirirsin ve string listte toplarsin
		
		List<String> liste7=sayilar.stream().filter(x->x>5).map(x->"-"+x).collect(Collectors.toList());	//map ile sayilar elemaninin basina "-" koyarak - li sayilar dondurdun
	
		List<String> liste8=sayilar.stream().filter(x->x>5).map(x->{
			String a=x+"-";
			return a;}).collect(Collectors.toList());
		
		liste7.forEach(System.out::println);
		
		Map<String, Integer> map =aylar.stream().collect(Collectors.toMap(k->k, v->v.length()));
		
		Map<Integer, List<String>> map2 =aylar.stream().collect(Collectors.groupingBy(String::length));
		
		Map<Object, List<String>> map3 =aylar.stream().collect(Collectors.groupingBy(x->x.substring(0, 1)));
		
		map3.entrySet().stream().forEach(System.out::println);
		
	}

}
