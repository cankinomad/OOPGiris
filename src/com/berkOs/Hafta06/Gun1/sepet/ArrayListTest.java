package com.berkOs.Hafta06.Gun1.sepet;

import java.util.ArrayList;
import java.util.List;
/*
 * Y ile baslayan urunleri listeden silelim
 */
public class ArrayListTest {

	public static void main(String[] args) {
		String [] dizi= {"Sut","Yumurta"};
		
		List<String> urunler=new ArrayList<>();
		urunler.add("Sut");
		
		List<String> urunler2=new ArrayList<>(List.of("Cips","Kola","Seker","Yag","Un","Ekmek","Cay","Yumurta","Yogurt","Sut"));
		
		for (String string : urunler2) {
		System.out.println(string);	
		
		}
//		System.out.println("-------------------Cikarildiktan sonra--------------");
//		for (int i = 0; i < urunler2.size(); i++) {
//			if(urunler2.get(i).startsWith("Y")) {
//				urunler2.remove(i);	
//				i--;								//boyle islemlerde normal for icinde yapmalisin. Safe bir islem degil.
//			}										//cikarma islemlerinde sondan basa cikarirsan i uzerinde ekstra bir islem yapaman gerke yok kendin dene
//		}
//		for (int i = 0; i < urunler2.size(); i++) {
//			System.out.println(urunler2.get(i));
//		}
		System.out.println("-------------------replaceden sonra--------------");
		for (int i = 0; i < urunler2.size(); i++) {
			if(urunler2.get(i).equalsIgnoreCase("YOGURT")) {
				//urunler2.remove(i);
				//urunler2.add(i,"XXX");
				urunler2.set(i, "XXX");
												
			}										
		}
		for (int i = 0; i < urunler2.size(); i++) {
			System.out.println(urunler2.get(i));
		}
		
	}

}
