package com.berkOs.Hafta05.gun2.BilgisayarUygulamasi;

import java.util.ArrayList;

public class Anakart extends DahiliDonanim{
	
	private int hiz;
	private ArrayList<DahiliDonanim> dahiliDonanimlar;
	
	
	
	
	



	public Anakart(int hiz) {
		super();
		this.hiz = hiz;
	}








	public Anakart(int hiz, ArrayList<DahiliDonanim> dahiliDonanimlar) {
		super();
		this.hiz = hiz;
		this.dahiliDonanimlar = dahiliDonanimlar;
	}








	public int getHiz() {
		return hiz;
	}








	public void setHiz(int hiz) {
		this.hiz = hiz;
	}








	public ArrayList<DahiliDonanim> getDahiliDonanimlar() {
		return dahiliDonanimlar;
	}








	public void setDahiliDonanimlar(ArrayList<DahiliDonanim> dahiliDonanimlar) {
		this.dahiliDonanimlar = dahiliDonanimlar;
	}








	@Override
	public String toString() {
		return "Anakart [hiz=" + hiz + ", dahiliDonanimlar=" + dahiliDonanimlar + "]";
	}
	
	
	
}
