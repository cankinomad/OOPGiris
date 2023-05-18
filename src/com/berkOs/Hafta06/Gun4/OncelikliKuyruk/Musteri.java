package com.berkOs.Hafta06.Gun4.OncelikliKuyruk;

import java.util.Scanner;

/*
 * Musteride bir bankanin musterisi olup olmadigini tutan bir ozellik olsun 
 * bir de sira numarasi ozelligi olsun
 * bir de musterinin ismi olsun
 * 
 * daha sonra banka sinifimizda birden cok musteri olusturarak 
 * banka musterisi olanlara oncelik versin
 * banka musterileri arasinda da sira numarasina gore siralama yapsin
 * 
 */
public class Musteri{// implements Comparable<Musteri> {
	boolean musterisiMi;
	int siraNo;
	String isim;

	public Musteri() {
		super();
	}
	
	public Musteri(boolean musterisiMi, int siraNo, String isim) {
		super();
		this.musterisiMi = musterisiMi;
		this.siraNo = siraNo;
		this.isim = isim;
	}
	
	public Musteri musteriOlustur() {
		Scanner input=new Scanner(System.in);
		System.out.println("Musterinin adi?");
		this.isim=input.nextLine();
		System.out.println("Musterinin siraNumarasi");
		this.siraNo=input.nextInt();input.nextLine();
		System.out.println("Bankanizin musterisi mi? Evet veya Hayir yaziniz");
		String cevap=input.nextLine();
		
		boolean musterisi=false;
		if(cevap.equalsIgnoreCase("Evet")){
			musterisi=true;
		}else {
			 musterisi=false;
		}
		Musteri musteri=new Musteri(musterisi, siraNo, cevap);
		return musteri;
	}

	

	@Override
	public String toString() {
		return "Musteri [musterisiMi=" + musterisiMi + ", siraNo=" + siraNo + ", isim=" + isim + "]";
	}

//	@Override
//	public int compareTo(Musteri o) {
//		if(musterisiMi) {
//			return -1;
//		}else {
//			return 1;
//		}
//	}


	
	
}
