package com.berkOs.Hafta04.gun2;
/*
 * ogrencinin iki tane ozelligi olsun
 * isim ve numara olsun
 * daha sonra birde kayit metodu yazalim==>mustafa isimli ogrenci basari ile kayit olmustur.
 * ogrenci numarasi 1dir.
 * 
 */

public class Student {
	
	public String ad;
	public static int index; //surekli artsin yeni cagirmadan etkilenmesin diye static
	public int no; //index numarasini kacirmamak icin no'ya atiyoruz ve ilerde geri dondugumuzde numaramiz o ogrenci icin sabit kaliyor
	


public void kayit() {
	index++;
	no=index;
	System.out.println(ad+" isimi ogrenci basari ile kayit olmustur");
	System.out.println("Ogrenci nmumarasi: "+no);

}

public void bilgileriGoster() {
	System.out.println("==========================");
	System.out.println("Isim= "+ad);
	
	System.out.println("Ogrenci No "+no);
	System.out.println("==========================");
}
}
