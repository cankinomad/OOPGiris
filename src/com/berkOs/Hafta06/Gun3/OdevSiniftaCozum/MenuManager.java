package com.berkOs.Hafta06.Gun3.OdevSiniftaCozum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MenuManager {
	List<EIcecek> icecekler=new ArrayList<>(Arrays.asList(EIcecek.values()));
	
	public Menu menuOlustur() {
		
		
		ECorba corba=(ECorba)menuBelirle(ECorba.values());
		EYemek yemek=(EYemek)menuBelirle(EYemek.values());
		ETatli tatli=(ETatli)menuBelirle(ETatli.values());
		EIcecek icecek=icecekBelirle(EIcecek.values());
		Menu menu=new Menu(corba,yemek, tatli,icecek);
				return menu;
	}
	
	public Enum menuBelirle(Enum [] dizi) {
		int index=randomIndex(dizi.length);
		return dizi[index];
		
	}
	public EIcecek icecekBelirle(EIcecek[]dizi) {
		int index=randomIndex(dizi.length);
		
		while(dizi[index].isAtandiMi()) {
			index=randomIndex(dizi.length);
		}
		dizi[index].setAtandiMi(true);
		
		return dizi[index];
		
		
		
	}
	public EIcecek icecekBelirle2() {
		if(icecekler.isEmpty()) {
			icecekler=new ArrayList<>(Arrays.asList(EIcecek.values())); // dizileri direk arraylist icine atmaya yariyor. uzun uzun esitlemeye gerek yok
		}
		int index=randomIndex(icecekler.size());
		EIcecek icecek=icecekler.get(index);
		icecekler.remove(index);
		//icecekler.remove(icecek);
		return icecek;
		
	}
	
	public int randomIndex(int value) {
		Random random=new Random();
		return random.nextInt(0,value);
	}
	public void haftalikMenu() {
		List<EGun> gunler=new ArrayList<>(Arrays.asList(EGun.values()));
		
		for (EGun gun : gunler) {
			System.out.println(gun.ordinal()+1+"-"+gun);
			System.out.println(menuOlustur());
		}
	}
}
