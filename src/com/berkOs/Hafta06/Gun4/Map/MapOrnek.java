package com.berkOs.Hafta06.Gun4.Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/*
 * Bu iki arrayi kullanarak bir map olsuturalim
 * 
 * id degelerine karsilik isimler gelsin
 * 
 * harcamalar mapi olusturalim. isme karsilik o kisinin harcamalari gelsin
 * 
 */

public class MapOrnek {
	String[] calisanlar = { "Mustafa", "Oznur", "Elif" };
	Integer[] ids = { 1, 2, 3 };

	Integer[][] harcamalar = { { 500, 400, 120 }, { 100, 200, 800 }, { 500, 750, 1200 } };

	public static void main(String[] args) {
		Map<Integer, String> calisanlar = new HashMap<>();
		MapOrnek map = new MapOrnek();

		for (int i = 0; i < map.calisanlar.length; i++) {
			calisanlar.put(map.ids[i], map.calisanlar[i]);
		}

		calisanlar.forEach((k, v) -> System.out.println(k + "----" + v));

		Map<String, Integer[]> harcamalar = new HashMap<>();

		for (int i = 0; i < map.ids.length; i++) {

			harcamalar.put(map.calisanlar[i], map.harcamalar[i]);
		}
		harcamalar.forEach((k, v) -> System.out.println(k + "===" + Arrays.toString(v)));
		
		for (Entry<String, Integer[]> value : harcamalar.entrySet()) {
			//System.out.println(value.getKey()+"--"+Arrays.toString(value.getValue()));
			System.out.println(value.getKey());
			for (Integer string : value.getValue()) {
				System.out.println(string+"-");
			}
			System.out.println();
		}
	}
}
