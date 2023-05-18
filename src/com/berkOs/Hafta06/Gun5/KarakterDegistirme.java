package com.berkOs.Hafta06.Gun5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * bi iki array uzerinden bir map yapip
 * bir metot yazalim
 *  disaridan girilen kelimede turkce karakter varsa ingilizce karaktere cevirsin
 * 
 */
public class KarakterDegistirme {
	char[] turkishWords = { 'İ', 'ı', 'ş', 'Ş', 'ç', 'Ç', 'ğ', 'Ğ', 'ü', 'Ü', 'ö', 'Ö' };
	char[] englishWords = { 'I', 'i', 's', 'S', 'c', 'C', 'g', 'G', 'u', 'U', 'o', 'O' };
	Map<Character, Character> map=new LinkedHashMap<>();
	public static void main(String[] args) {
		char[] turkishWords = { 'İ', 'ı', 'ş', 'Ş', 'ç', 'Ç', 'ğ', 'Ğ', 'ü', 'Ü', 'ö', 'Ö' };
		char[] englishWords = { 'I', 'i', 's', 'S', 'c', 'C', 'g', 'G', 'u', 'U', 'o', 'O' };

		Map<Character, Character> ceviri=new HashMap<>();
		
		for (int i = 0; i < englishWords.length; i++) {
			ceviri.put(turkishWords[i], englishWords[i]);
		}
		
		ceviri.entrySet().stream().forEach(System.out::println);
		
		KarakterDegistirme karakter=new KarakterDegistirme();
		karakter.ingilizceYap(ceviri);
		
		KarakterDegistirme karakter2=new KarakterDegistirme();
		karakter2.mapOlustur();
		karakter2.replace();
		
	}
	public void ingilizceYap(Map<Character, Character> ceviri) {
		Scanner input=new Scanner(System.in);
		System.out.println("Lutfen bir kelime giriniz");
		String kelime=input.nextLine();
		String yeniKelime="";
		
		for (char c : kelime.toCharArray()) {
			if(ceviri.containsKey(c)) {
			yeniKelime=kelime.replace(c, ceviri.get(c));
			}
		}
		System.out.println(yeniKelime);
		
	}
	
	public void mapOlustur() {
		for (int i = 0; i < englishWords.length; i++) {
			map.put(turkishWords[i],englishWords[i]);
		}
	}
	public void replace() {
		Scanner input=new Scanner(System.in);
		System.out.println("Lutfen bir kelime giriniz");
		String kelime=input.nextLine();
		
		for (char c : kelime.toCharArray()) {
			if(map.containsKey(c)) {
				kelime=kelime.replace(c, map.get(c));
			}
		}
		System.out.println(kelime);
	}
	
	
	
}
