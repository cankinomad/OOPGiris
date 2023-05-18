package com.berkOs.Hafta07.Gun2;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Bir metot ile disaridan bir index alalim,sonra o indexdeki degeri yazdiralim. Hata varsa try-catch ile yakalayalim
 * 
 * array uzerinde gezerken toplabildigimiz degerleri toplama ekleyelimbir sayac ile hata sayisini tutalim ve dongu sonunda toplami ve hata sayisini yazdiralim
 */
public class TryCatchOrnek2 {
	public static void main(String[] args) {
		String[] array= {"a","30","20",null,"abc","50"};
		
		//secilenIndexiYazdir(array);
		//toplam2(array);
		
		for (String string : array) {
			try {
				nullCheck2(string);
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
	}
	
	public static void secilenIndexiYazdir(String[] array) {
			Scanner input=new Scanner(System.in);
		
		int index = 0;
		try {
			System.out.println("Lutfen bir index numarasi giriniz");
			index = input.nextInt();
			System.out.println(array[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("lutfen max deger array boyutu-1 olacak sekilde giriniz");
			System.out.println("Array boyutunuz: "+ array.length);
		}	catch (InputMismatchException e) {
			System.out.println("bir sayi degeri giriniz!!");
		}
	
		catch (Exception e) {
			System.out.println("Bir hata olustu"+e.toString());
		}finally {
			input.close();
		}
		
	}
	
	public static void toplam(String[] array) {
		
		int toplam=0;
		int sayac = 0;
		
		for (String string : array) {
			try {
				toplam+=Integer.parseInt(string);
			} catch (NumberFormatException e) {
				System.out.println(e.toString());
				sayac++;
			}catch (Exception e) {
				System.out.println("Baska bir hata");
				sayac++;
			}
		}
		System.out.println("Toplam= "+toplam);
		System.out.println("hata sayisi= "+ sayac);
		
	}
	
	public static String nullCheck(String string) {
		if(string==null) {
			 throw new NullPointerException(); //throw da return gibi calisir oraya girersek program sonlanir.
		}
		return string;
	}
	
public static void toplam2(String[] array) {
		
		int toplam=0;
		int sayac = 0;
		
		for (String string : array) {
			try {
				nullCheck(string);
				toplam+=Integer.parseInt(string);
			} catch (NumberFormatException e) {
				System.out.println(e.toString());
				sayac++;
			}catch (Exception e) {
				System.out.println("Baska bir hata"+e.toString());
				sayac++;
			}
		}
		System.out.println("Toplam= "+toplam);
		System.out.println("hata sayisi= "+ sayac);
		
	}public static String nullCheck2(String string) throws Exception { //runtime yazsaydin sonradan hata alcaktin,, exception ile direk aliyorsun try catch sarmalamasina tabii tutuyorsun
		if(string==null) {
			 throw new NullPointerException(); //throw da return gibi calisir oraya girersek program sonlanir.
		}
		return string;
	}
	
	public static String nullCheck3(String string) throws RuntimeException{ //unchecked exception
		if(string==null) {
			 throw new NullPointerException(); //throw da return gibi calisir oraya girersek program sonlanir.
		}
		return string;
	}
	
	public static String nullCheck4(String string)  {
		if(string==null) {
			 throw new RuntimeException(); //throw da return gibi calisir oraya girersek program sonlanir.
		}
		return string;
	}


}
