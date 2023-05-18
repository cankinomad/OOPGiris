package com.berkOs.Hafta06.Gun3.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
/*
* String bir kuyruk tanımlıyacagız 
* 
* bu kuyruga 10-12 tane isim ekleyeceğiz 
* 
* 
* random 1-10 arası sayı uretecegız  buda bizim pide sayımız olucak
* 
* kuyruga gore pideleri dagıtacagız  pide bittiğinde pide bitti yazalım 
* birde pide alamayanları yazdıralım 
* 
* 
* 
*/
public class RamazanPidesiKuyrugu {
	Queue<String>kuyruk=new ArrayBlockingQueue<>(10); // dersen 10 ile sinirli bir kuyruk olsturur.
	
	public static void main(String[] args) throws InterruptedException {
		Queue<String> isimler = new LinkedList<>();
		
		isimler.add("Ahmet");
		isimler.add("Ayse");
		isimler.add("ali");
		isimler.add("deniz");
		isimler.add("cevdet");
		isimler.add("salih");
		isimler.add("kaan");
		isimler.add("burak");
		isimler.add("metin");
		isimler.add("sinan");
		isimler.add("mehmet");
		
		Random random=new Random();
		int index=10;
		int pideSayisi=random.nextInt(1,index);
		
		while (!isimler.isEmpty()&&pideSayisi>0) {
			System.out.println(isimler.poll()+" pidesini kapti");
			pideSayisi--;
			
		}
		while (!isimler.isEmpty()) {
			System.out.println(isimler.poll()+" pidesini alamadi");
		}
		System.out.println("2. yol");
		
		
		RamazanPidesiKuyrugu ramazanPidesiKuyrugu=new RamazanPidesiKuyrugu();
		ramazanPidesiKuyrugu.kuyrukOlustur();
		ramazanPidesiKuyrugu.pideDagit();
		ramazanPidesiKuyrugu.geriyeKalanlar();
		//ramazanPidesiKuyrugu.kuyruk.forEach(System.out::println);//sadece yazdirir
	}
	public void kuyrukOlustur() {
		kuyruk.offer("Ahmet");
		kuyruk.offer("Murat");
		kuyruk.offer("Ozan");
		kuyruk.offer("Hasan");
		kuyruk.offer("Merve");
		kuyruk.offer("Hilal");
		kuyruk.offer("Mustafa");
		kuyruk.offer("ezgi");
		kuyruk.offer("Selim");
		kuyruk.offer("Cigdem");
		//kuyruk.add("Cigdem"); //add ile eklerksek kuyrugun boyutu 10 oldugundan kuyruk asilir ve hata firlatir
		//offer ile eklersek donus toipi null olur. hata firlatmaz.
		
	}
	public void pideDagit() throws InterruptedException {
		Random random=new Random();
		int pideSayisi=random.nextInt(1,11);
		System.out.println("Pideler Cikiyor");
		System.out.println("Pide sayisi===>"+pideSayisi);
		Thread.sleep(2000);
		
		
		for (int i = 0; i < pideSayisi; i++) {
			
			if(!kuyruk.isEmpty()) {
				Thread.sleep(500);
			System.out.println(kuyruk.poll()+"pidesini aldi");
			}else {
				System.out.println("Musteri kalmadi!!!!");
				break;
			}
		}
	}
	public void geriyeKalanlar() {
		if(kuyruk.isEmpty()) {
			System.out.println("Pidesini almayan musteri kalmadi");
		}else {
			System.out.println("Pide bitti. Pidesini alamayan musteriler");
			kuyruk.forEach(System.out::println);
		}
	}
}
