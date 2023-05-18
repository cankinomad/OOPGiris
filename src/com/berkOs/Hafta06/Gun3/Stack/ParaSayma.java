package com.berkOs.Hafta06.Gun3.Stack;

import java.util.Stack;

/*
 * integer bir stack olusturup icerisine 5,6 tane deger ekleyelim
 * 100,den buyuk olanlari toplam degerine ekleyelim. 100'den kucuk olanlari'da baska bir stack yapisinda tutalim.
 * en sonundada toplami ve diger stack i yazdiralim
 */
public class ParaSayma {
	public static void main(String[] args) {
		Stack<Integer> paralar = new Stack<>();
		Stack<Integer> yuzdenKucukler = new Stack<>();
		int toplam = 0;
		
		
		paralar.push(320);	//push degeri doner, add boolean doner o yuzden if icine add ile bir kosul koyabilrisin.
		paralar.push(120);
		paralar.push(20);
		paralar.push(50);
		paralar.push(350);
		paralar.push(2);

		
		//peek en ustteki degere bakmamizi saglar yani onun degerini bize gosterir
		//pop en ustteki degeri stacken cikartir.
		
		while (!paralar.isEmpty()) {
			if(paralar.peek()>100) {
				toplam+=paralar.pop();
			}else {
				yuzdenKucukler.push(paralar.pop());
			}
		}
		System.out.println("toplam= "+toplam);					//stack icin asla for ile arama git while kullan
		
		yuzdenKucukler.forEach(System.out::println);
		System.out.println("======================");
		yuzdenKucukler.forEach((x)->System.out.println(x));
		



}}
