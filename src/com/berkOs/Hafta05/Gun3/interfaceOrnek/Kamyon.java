package com.berkOs.Hafta05.Gun3.interfaceOrnek;

public class Kamyon extends Arac implements ISur,IYukal,IYukbosalt{
	
	private String tasidigiMadde;

	

	
	public Kamyon(String marka, String model, String tasidigiMadde) {
		super(marka, model);
		this.tasidigiMadde = tasidigiMadde;
		setHiz(30);
	}
	public void hizlan() {
		setHiz(getHiz()+15);
	}
	public void yavasla() {
		setHiz(getHiz()-15);
	}


	public String getTasidigiMadde() {
		return tasidigiMadde;
	}


	public void setTasidigiMadde(String tasidigiMadde) {
		this.tasidigiMadde = tasidigiMadde;
	}


	@Override
	public String toString() {
		return "Kamyon [tasidigiMadde=" + tasidigiMadde + "]";
	}
	@Override
	public void sur() {
		System.out.println("Kamyon Suruluyor");
		
	}
	@Override
	public void yukbosalt() {
		System.out.println("Yuk bosaltiliyor");		
	}
	@Override
	public void yukAl() {
		System.out.println("Yuk aliniyor");
		
	}
	
	
}
