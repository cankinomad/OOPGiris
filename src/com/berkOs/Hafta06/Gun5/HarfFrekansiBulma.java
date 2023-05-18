package com.berkOs.Hafta06.Gun5;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

/*
 * Disaridan bir String deger alacagiz.
 * daha sonra bunu bir mapde saklayacagiz
 * hangi harf kac kere gecmistir
 * 
 * m=1
 * e=1
 * r=1
 * h=1
 * a=2
 * b=1
 * 
 * 
 */
public class HarfFrekansiBulma {
	public static void main(String[] args) {
		
		HarfFrekansiBulma bul=new HarfFrekansiBulma();
		Map<Character, Integer> kelime=new TreeMap<>();
		Map<Character, Integer> kelime2=new TreeMap<>();
		
		bul.mapeAktar2(kelime2);
		
		kelime2.entrySet().forEach(System.out::println);
		
		
		
		bul.mapeAktar(kelime);
		
		for (Entry<Character, Integer> string : kelime.entrySet()) {
			
			System.out.println(string);
		}
		kelime.forEach((k,v)->System.out.println(k+"---"+v));
		
		kelime.entrySet().stream().forEach(System.out::println);
	}
	
	public  void mapeAktar(Map<Character, Integer> harf) {
		Scanner input=new Scanner(System.in);
		System.out.println("Bir kelime giriniz");
		String kelime=input.next();
		for (int i = 0; i < kelime.length(); i++) {
			if(!harf.containsKey(kelime.charAt(i))) {
			harf.put(kelime.charAt(i), 1);
			}else {
				harf.put(kelime.charAt(i),harf.get(kelime.charAt(i))+1);
			}
		}
	}
		public  void mapeAktar2(Map<Character, Integer> harf) {
			Scanner input=new Scanner(System.in);
			System.out.println("Bir kelime giriniz");
			String kelime=input.next();
			
			for (char c : kelime.toCharArray()) {			//String ifadeyi direk char olarak tek tek gezmek.
				if(!harf.containsKey(c)) {
					harf.put(c, 1);
					}else {
						harf.replace(c,harf.get(c)+1);
					}
			}
		
		
		
	}
	
}
