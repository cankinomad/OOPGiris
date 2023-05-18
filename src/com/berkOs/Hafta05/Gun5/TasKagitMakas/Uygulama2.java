package com.berkOs.Hafta05.Gun5.TasKagitMakas;

import java.util.Random;
import java.util.Scanner;

public class Uygulama2 {

	public void oyun() {
		Scanner input=new Scanner(System.in);
		Random random=new Random();
		ESecenek2 [] secenekler=ESecenek2.values();
		
		System.out.println("TAS KAGIT MAKAS oyununa hos geldiniz");
		for (ESecenek2 eSecenek2 : secenekler) {
			System.out.println((eSecenek2.ordinal()+1)+"-"+eSecenek2);
			
		}
		ESecenek2 secim=secenekler[input.nextInt()-1];
		ESecenek2 pcsecim=secenekler[random.nextInt(secenekler.length)];
		
		if(pcsecim==secim) {
			System.out.println("Beraberlik");
		}else if(pcsecim.kaybeder.equalsIgnoreCase(secim.name())) {
			System.out.println("kazandin");
		}else {
			System.out.println("kaybettin");
		}
		System.out.println("Pc secim=====>"+pcsecim);
	}
	
}
