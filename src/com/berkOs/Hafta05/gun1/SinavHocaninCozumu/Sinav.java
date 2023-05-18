package com.berkOs.Hafta05.gun1.SinavHocaninCozumu;
/*
 * 
 * Sinavolustur()==> metodumuz olacak//sinav sinifinda
 * disaridan gereken verileri alacak sinav konusu soru sayisi gibi.
 * sorulari da olusturmak gerekecek. bu soru olusturma isini soru sinifinda bir metoda devredelim
 * Soru sinifinda bir soru olusturma metodu yazalim.
 * soruOlustur()==> disaridan soru ile ilgili verileri alacak  icerik,puan,cevapicerikleri gibi
 * ve iceride cevap iceriklerini de kullanicidan alacagiz. 
 *	//tek metod soru sinifinda olacak
 * bu iki metod sayesinde sinavimiz olusmus olacak
 * 
 * Assagidaki metodlar sinav sinifinda olusturulacak
 * 
 * daha sonra sinav sinifinda cevaplari gir diye bir metod olusturacagiz.
 * bu metod sinav sorularini sira ile gosterirken bizden cevaplari alacak
 * 
 * daha sonra baska bir metod daha yazip cevaplarikontrolEt  bi onceki metoddan aldigimiz cevaplari
 * sorularin dogru cevabi ile kontrol edip sinav puanimizi hesaplayan bir metod olacak
 * 
 * 
 */
import java.util.Scanner;
public class Sinav {
	
		static Scanner input=new Scanner(System.in);
		public String ders;
		public String konu;
		public int soruSayisi;
		public Long sure;
		public Soru[] sorular;
		public String[] cevaplar;
		public String [] cevapSecenekleri= {"A","B","C","D"};
		
		public void sinavOlustur() {
			Scanner input=new Scanner(System.in);
			System.out.println("lutfen Ders adini giriniz");
			this.ders=input.nextLine();
			System.out.println("lutfen bir sinav konusu giriniz");
			this.konu=input.nextLine();
			System.out.println("lutfen Soru Sayisini giriniz");
			this.soruSayisi=input.nextInt(); input.nextLine();
			System.out.println("Lutfen sinav suresini giriniz");
			this.sure=Long.parseLong(input.nextLine());
			
			sorular=new Soru[soruSayisi];
			
			for (int i = 0; i < soruSayisi; i++) {	
				Soru soru=new Soru();
				soru.soruOlustur(cevapSecenekleri);
				soru.siraNo=i+1;
				sorular[i]=soru;
				
					
				
				                       
			}
		}
		public void sorulariGoster(Soru[] sorular) {
			for (Soru soru : sorular) {
				if(soru!=null) {
					System.out.println(soru);
				}
			}
		}
		public void sorulariCevapla(Soru[]sorular) {
			int sayac=0;
			int puan=0;
			for (int i = 0; i < sorular.length; i++) {
				System.out.println(i+1+". soru \n"+sorular[i].icerik);
				for (int j = 0; j < sorular[i].cevapIcerikleri.length ;j++) {
					System.out.println(sorular[i].cevapIcerikleri[j]);
				}
				Scanner input=new Scanner(System.in);
				System.out.println("Lutfen Cevabinizi giriniz");
				String kullaniciCevap=input.nextLine();
				if(kullaniciCevap.equalsIgnoreCase(sorular[i].dogruCevabi)) {
					puan+=sorular[i].puan;
					sayac++;
				}
			}
			System.out.println("Toplam "+sayac+" adet soruya dogru cevap verdiniz");
			System.out.println("Sinav Puaniniz "+puan);
		}
		public void cevaplariGir() {
			Scanner input=new Scanner(System.in);
			System.out.println("Ders= "+this.ders);
			System.out.println("Konu= "+this.konu);
			System.out.println("Sure= "+this.sure);
			
			this.cevaplar=new String[sorular.length];
			
			for (int i = 0; i < this.sorular.length; i++) {
				System.out.println(sorular[i].icerik);
				
				for (int j = 0; j < sorular[i].cevapIcerikleri.length; j++) {
					System.out.println(cevapSecenekleri[i]+"-)"+sorular[i].cevapIcerikleri[j]);
				}
				System.out.println("Lutfen cevabinizi giriniz (A,B,C,D olacak sekilde)");
				cevaplar[i]=input.nextLine().toUpperCase();
			}
		}
		public void cevaplariKontrolEt() {
			int dogruSayisi=0;
			int puan=0;
			
			for (int i = 0; i < sorular.length; i++) {
				if (cevaplar[i].equalsIgnoreCase(sorular[i].dogruCevabi)) {
					dogruSayisi++;
					puan+=sorular[i].puan;
				}
			}
			System.out.println("Dogru cevap sayiniz= "+ dogruSayisi);
			System.out.println("yanlis cevap sayiniz= "+ (soruSayisi-dogruSayisi));
			System.out.println("Toplam puan= "+ puan);
		}
}
