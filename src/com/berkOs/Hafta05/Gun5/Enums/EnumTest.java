package com.berkOs.Hafta05.Gun5.Enums;

public class EnumTest {
	public static void main(String[] args) {

		System.out.println(EAylar.AGUSTOS.name());
		System.out.println(EAylar.AGUSTOS.toString()); //bu 2 yontem de Enum i String e cevirir
		System.out.println(EAylar.AGUSTOS.ordinal());
		System.out.println(EAylar.HAZIRAN.ordinal());
		EAylar ay=EAylar.valueOf("TEMMUZ"); //temmuz yerine temmuzz falan yazarsan hata verir benim boyle bir elemanim yok der neyi esitlicem
		System.out.println(ay.ordinal());
		System.out.println(ay.name());//string e cevirme
		
		//EAylar ay2=EAylar.valueOf("TemmuzZZ"); hata!!!
		
		EAylar[]dizi=EAylar.values();
		for (EAylar eAylar : dizi) {
			System.out.println(eAylar.ordinal()+1+" "+eAylar.name());
		}
		
		System.out.println(EAylar.HAZIRAN.getIsim());
		
	}
}
