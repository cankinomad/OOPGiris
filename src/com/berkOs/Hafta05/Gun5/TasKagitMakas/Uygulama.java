package com.berkOs.Hafta05.Gun5.TasKagitMakas;

import java.util.Random;
import java.util.Scanner;

public class Uygulama {
	Esecenek[] secenekler = Esecenek.values();

	public void oyun() {
		Esecenek secimim = benimSecimim();
		Esecenek pc = pcSecim();

		if (secimim == pc) {
			System.out.println("Beraberlik");
		} else {

			switch (secimim) {
			case TAS:
				if (pc == Esecenek.KAGIT) {
					System.out.println("Kaybettiniz");
				} else {
					System.out.println("Kazandiniz");
				}
				System.out.println("Pc secimi===>"+ pc);
				break;
				
			case KAGIT:
				if (pc == Esecenek.MAKAS) {
					System.out.println("Kaybettiniz");
				} else {
					System.out.println("Kazandiniz");
				}
				System.out.println("Pc secimi===>"+ pc);
				break;
			case MAKAS:
				if (pc == Esecenek.TAS) {
					System.out.println("Kaybettiniz");
				} else {
					System.out.println("Kazandiniz");
				}
				System.out.println("Pc secimi===>"+ pc);
				break;

			default:
				break;
			}

		}

	}

	public Esecenek benimSecimim() {
		Scanner input = new Scanner(System.in);

		for (Esecenek eSecenek : secenekler) {
			System.out.println((eSecenek.ordinal() + 1) + "-" + eSecenek);
		}
		System.out.println("Lutfen TAS,KAGIT,MAKAS Verilerinden birini seciniz");
		int secim = Integer.parseInt(input.nextLine());
		return secenekler[secim - 1];

	}

	public Esecenek pcSecim() {
		Random random = new Random();
		int index = random.nextInt(secenekler.length);
		return secenekler[index];
	}

}
