package com.berkOs.Hafta06.Gun4.OncelikliKuyruk;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;


public class Banka {
	//ArrayList<Musteri> musteriler=new ArrayList<>();
	Queue<Musteri> musteriler=new PriorityQueue<>(new Comparator<Musteri>() {

		@Override
		public int compare(Musteri o1, Musteri o2) {
			if(o1.musterisiMi&&o2.musterisiMi) {
				return o1.siraNo-o2.siraNo;
			}else if(o1.musterisiMi) {
				return -1;
			}else if(!o1.musterisiMi&& !o2.musterisiMi) {
				return o1.siraNo-o2.siraNo;
			}
			return 1;
		}
	});
	public static void main(String[] args) {
		Banka banka=new Banka();
		banka.kuyrugaMusteriEkle();
		banka.kuyrugaYazdir();
		
		//Musteri musteri=new Musteri();
		//musteri.musteriOlustur();
	}
	
	
	public void kuyrugaMusteriEkle() {
		musteriler.offer(new Musteri(false,5,"Mustafa"));
		musteriler.offer(new Musteri(true,1,"Kemal"));
		musteriler.offer(new Musteri(false,4,"MERve"));
		musteriler.offer(new Musteri(false,2,"Ali"));
		musteriler.offer(new Musteri(true,3,"Gizem"));
		musteriler.offer(new Musteri(false,6,"Okan"));
		musteriler.offer(new Musteri(true,7,"Zeliha"));
				
	}
	public void kuyrugaMusteriEkle(Musteri musteri) {
		musteriler.offer(musteri);
	}
	public void kuyrugaYazdir() {
		while(!musteriler.isEmpty()) {
			System.out.println(musteriler.poll());
		}
	}
}
