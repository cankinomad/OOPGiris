package com.berkOs.Hafta06.Gun4.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/*
 * 
 */

public class MapTest {
	public static void main(String[] args) {

		Map<String, String> map1 = new HashMap<>();
		map1.put("06", "Ankara");
		map1.put("05", "Amasya");
		map1.put("06", "ANKARA");

		System.out.println(map1.get("06"));
		map1.isEmpty();
		map1.keySet().forEach(System.out::println);
		map1.replace("05", "AMASYA");
		System.out.println(map1.get("05"));
		//map1.remove("06");
		System.out.println(map1);
		System.out.println(map1.containsKey("06"));
		Collection<String> iller = map1.values();

		map1.forEach((k, v) -> System.out.println(k + "---------" + v)); //yazdirma yontemi1
		
		for (Entry<String, String> string : map1.entrySet()) {		//yazdirma yontemi  2
			if(string.getKey().equals("06")) {
				string.setValue("ankara");
			}
			System.out.println(string);
		}
	}
}
