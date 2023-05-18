package com.berkOs.Hafta05.Gun3.interfaceOrnek;

public class Otomobil extends Arac implements ISur {
	
	public String bagajHacmi;


	public Otomobil(String marka, String model, String bagajHacmi) {
		super(marka, model);
		this.bagajHacmi = bagajHacmi;
		setHiz(50);
	}
	public void hizlan() {
		setHiz(getHiz()+30);
	}
	public void yavasla() {
		setHiz(getHiz()-30);
	}


	public String getBagajHacmi() {
		return bagajHacmi;
	}


	public void setBagajHacmi(String bagajHacmi) {
		this.bagajHacmi = bagajHacmi;
	}
	@Override
	public void sur() {
		System.out.println("Otomobil suruluyor");
		
	}
	
	
}
