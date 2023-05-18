package com.berkOs.Hafta05.gun1.SinavHocaninCozumu;

import java.util.Arrays;
import java.util.Scanner;

public class Soru {

	
	public int puan;
	public int siraNo;
	public String icerik;
	public String dogruCevabi;
	public String []cevapIcerikleri;
	
	
	
	public void soruOlustur(String [] cevapSecenekleri) {
		Scanner input=new Scanner(System.in);
		System.out.println("Lutfen bir Soru icerigi giriniz");
		this.icerik=input.nextLine();
		cevapIcerikleri=new String[cevapSecenekleri.length];
		
		for (int i = 0; i < cevapIcerikleri.length; i++) {
			System.out.println("Lutfen "+ cevapSecenekleri[i]+" sikkinin icerigini giriniz");
			cevapIcerikleri[i]=input.nextLine();
		}
		System.out.println("Sorunun dogru cevabini belirleyiniz");
		this.dogruCevabi=input.nextLine();
		System.out.println("Lutfen sorunun puanini giriniz");
		this.puan=Integer.parseInt(input.nextLine());
	}	
	



	@Override
	public String toString() {
		return "Soru [puan=" + puan + ", siraNo=" + siraNo + ", icerik=" + icerik + ", dogruCevabi=" + dogruCevabi
				+ ", cevapIcerikleri=" + Arrays.toString(cevapIcerikleri) + "]";
	}



	
	
}
