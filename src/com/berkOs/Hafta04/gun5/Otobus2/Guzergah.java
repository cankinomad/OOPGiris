package com.berkOs.Hafta04.gun5.Otobus2;

import java.util.Arrays;

public class Guzergah {
	
	public Durak[] duraklar;
	public int hatNo;
	
	
	
	
	
	public Guzergah(int hatNo) {
		this.duraklar=new Durak[5];
		this.hatNo = hatNo;
	}





	public Guzergah(Durak[] duraklar, int hatNo) {
		
		this.duraklar = duraklar;
		this.hatNo = hatNo;
	}









	@Override
	public String toString() {
		return "Guzergah [duraklar=" + Arrays.toString(duraklar) + ", hatNo=" + hatNo + "]";
	}
	
	
	
}
