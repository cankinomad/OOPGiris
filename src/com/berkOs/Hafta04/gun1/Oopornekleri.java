package com.berkOs.Hafta04.gun1;

public class Oopornekleri {
	/*
	 * primitive veri turundeki degiskenlerin degerleri stack bellekte
	 * referans veri tipindeki degiskenlerin verileri heap bellekte tutulur
	 * 
	 */

	public static void main(String[] args) {
		
		int a=5;
		int b=3;
		
		System.out.println(a);
		System.out.println(b);
		a=b;
		b=8;
		System.out.println(a);
		System.out.println(b);
		
		String [] sehirler1= {"Ankara","Istanbul","Izmir"};
		String [] sehirler2= {"Bursa","Konya","Mersin"};
		
		System.out.println(sehirler1[0]); //ankara
		System.out.println(sehirler2[1]); //konya
		
		sehirler2=sehirler1;
		
		System.out.println(sehirler2[0]);	//ankara
		sehirler1[0]="Bolu";
		System.out.println(sehirler2[0]);	//bolu
		sehirler2[1]="Edirne";
		System.out.println(sehirler1[1]);	//edirne
		
		Integer c=10;
		Integer d=15;
		System.out.println(c);
		System.out.println(d);
		c=d;
		d=24;
		System.out.println(c);
		System.out.println(d);
		
	}

}
